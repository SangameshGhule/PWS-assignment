//package com.s3group.oms.external.order.service;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.s3group.oms.external.asn.repo.AsnRepository;
//import com.s3group.oms.external.config.entity.OrderConfiguration;
//import com.s3group.oms.external.config.service.OrderConfigurationService;
//import com.s3group.oms.external.inventory.entity.InventoryTransactionLog;
//import com.s3group.oms.external.inventory.entity.WarehouseInventory;
//import com.s3group.oms.external.inventory.repo.InventoryTransactionLogRepository;
//import com.s3group.oms.external.inventory.repo.WarehouseInventoryRepository;
//import com.s3group.oms.external.inventory.service.WarehouseInventoryService;
//import com.s3group.oms.external.item.entity.request.Item;
//import com.s3group.oms.external.item.service.ItemService;
//import com.s3group.oms.external.omsRuleEngine.order.entity.OrderRequestRE;
//import com.s3group.oms.external.omsRuleEngine.order.entity.OrderResponseRE;
//import com.s3group.oms.external.omsRuleEngine.ruleImpl.OrderInferenceEngine;
//import com.s3group.oms.external.omsRuleEngine.service.RuleDbModelService;
//import com.s3group.oms.external.order.dashboard.input.entity.InputOrderQueueDashboard;
//import com.s3group.oms.external.order.dashboard.input.repo.InputOrderDashboardRepository;
//import com.s3group.oms.external.order.dashboard.output.entity.OutputOrderDashboard;
//import com.s3group.oms.external.order.dashboard.output.repo.OutputOrderDashboardRepository;
//import com.s3group.oms.external.order.entity.OutputOrderUpdateFields;
//import com.s3group.oms.external.order.entity.input.InputOrderQueue;
//import com.s3group.oms.external.order.entity.input.InputOrderRequest;
//import com.s3group.oms.external.order.entity.input.InputOrderStatusHistory;
//import com.s3group.oms.external.order.entity.input.request.OrderDetailRequest;
//import com.s3group.oms.external.order.entity.input.request.OrderHeaderRequest;
//import com.s3group.oms.external.order.entity.input.request.OrderRequest;
//import com.s3group.oms.external.order.entity.input.request.OrderRequestJson;
//import com.s3group.oms.external.order.entity.main.InputOrder;
//import com.s3group.oms.external.order.entity.main.InputOrderDetail;
//import com.s3group.oms.external.order.entity.main.OrderKey;
//import com.s3group.oms.external.order.entity.output.OutputOrderDetail;
//import com.s3group.oms.external.order.entity.output.OutputOrderQueue;
//import com.s3group.oms.external.order.entity.output.OutputOrderStatusHistory;
//import com.s3group.oms.external.order.exception.MisMatchException;
//import com.s3group.oms.external.order.exception.QtyLessThanOrEqualToZero;
//import com.s3group.oms.external.order.repo.*;
//import com.s3group.oms.master.entity.Warehouse;
//import com.s3group.oms.master.service.WarehouseService;
//import com.s3group.oms.master.validation.ValidationService;
//import lombok.Data;
//import org.modelmapper.ModelMapper;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Service;
//
//import java.lang.reflect.Field;
//import java.time.LocalDateTime;
//import java.time.ZoneId;
//import java.time.ZoneOffset;
//import java.time.ZonedDateTime;
//import java.time.format.DateTimeFormatter;
//import java.util.*;
//import java.util.stream.Collectors;
//
//@Data
//@Service
//public class OrderCreateTestService {
//
//    @Value("${ORDER_NUMBER_MISMATCH}")
//    private String orderNumberMismatch;
//
//    @Value("${OWNER_CODE_MISMATCH}")
//    private String ownerCodeMismatch;
//
//    @Value("${INVALID_QTY}")
//    private String invalidQty;
//
//    @Value("${SKU_MANDATORY}")
//    private String skuMandatory;
//
//    @Value("${ORDER_CREATED}")
//    private String orderCreated;
//
//    @Value("${NEW_STATUS}")
//    private String newStatus;
//
//    @Value("${PROCESSED_STATUS}")
//    private String processedStatus;
//
//    @Value("${ORDER_NOT_CREATED}")
//    private String orderNotCreated;
//
//    @Value("${AVAILABLE_QTY_LESS_THAN_ORDER_QUANTITY}")
//    private String availableQtyLessThanOrderQuantity;
//
//    private static final String success = "SUCCESS";
//
//    private static final String failure = "FAILURE";
//
//    private static final String rejected = "REJECTED";
//
//    private static final String inProgress = "INPROGRESS";
//
//    private static final String created = "CREATED";
//
//    @Autowired
//    private OrderValidationService orderValidationService;
//
//    @Autowired
//    private ValidationService validationService;
//
//    @Autowired
//    private InputOrderQueueRepository inputOrderQueueRepository;
//
//    @Autowired
//    private ItemService itemService;
//
//    @Autowired
//    private WarehouseInventoryService warehouseInventoryService;
//
//    @Autowired
//    private OutputOrderQueueRepository outputOrderQueueRepository;
//
//    @Autowired
//    private OutputOrderDashboardRepository outputOrderDashboardRepository;
//
//    @Autowired
//    private InputOrderRepository inputOrderRepository;
//
//    @Autowired
//    private InputOrderQueueDetailRepository inputOrderQueueDetailRepository;
//
//    @Autowired
//    private InputOrderDetailRepository inputOrderDetailRepository;
//
//    @Autowired
//    private InventoryTransactionLogRepository inventoryTransactionLogRepository;
//
//    @Autowired
//    private WarehouseInventoryRepository warehouseInventoryRepository;
//
//    @Autowired
//    private InputOrderDashboardRepository inputOrderDashboardRepository;
//
//    @Autowired
//    private com.s3group.oms.external.omsRuleEngine.ruleEngine.RuleEngine ruleEngine;
//
//    @Autowired
//    private OrderInferenceEngine orderInferenceEngine;
//
//    @Autowired
//    private AsnRepository asnRepository;
//
//    @Autowired
//    private RuleDbModelService ruleDbModelService;
//
//    @Autowired
//    private WarehouseService warehouseService;
//
//    @Autowired
//    private OrderConfigurationService orderConfigurationService;
//
//    private static final Logger logger = LoggerFactory.getLogger(OrderCreateTestService.class);
//
//    private OrderRequestJson orderRequestJson;
//
//    public void create(OrderRequestJson orderRequestJson) throws Exception {
//        this.orderRequestJson = orderRequestJson;
//        ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneOffset.UTC);
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
//        String timestamp = utcDateTime.format(formatter);
//
//        ModelMapper modelMapper = new ModelMapper();
//        ObjectMapper objectMapper = new ObjectMapper();
//        String inputOrderNumber;
//        ArrayList<String> ruleStatus = new ArrayList<>();
//        List<OutputOrderUpdateFields> outputOrderUpdateFields = new ArrayList<>();
//
//        //validating order request
//        orderValidationService.orderRequestInitialValidation(orderRequestJson);
//
//        logger.info("Enter into the create order method");
//        OrderRequest orderRequest = orderRequestJson.getOrderRequest();
//        OrderHeaderRequest orderHeaderRequest = orderRequestJson.getOrderRequest().getOrderHeader();
//        inputOrderNumber = orderHeaderRequest.getOrderNumber();
//
//        String headerOwnerCode = orderHeaderRequest.getOwnerCode();
//        String headerOrderNumber = orderHeaderRequest.getOrderNumber();
//        InputOrder inputOrder = modelMapper.map(orderRequest, InputOrder.class);
//        OrderKey orderKey = new OrderKey(headerOwnerCode, headerOrderNumber);
//        inputOrder.getOrderHeader().setOrderKey(orderKey);
//        inputOrder.getOrderHeader().setOrderAction(orderRequest.getOrderAction());
//        inputOrder.setStatus("IN-PROGRESS");
//        inputOrder.setStatusDescription("Processing the order");
//        logger.info("saving details in inputOrderTable");
//        double orderFutureAllocatedQty = 0.0;
//        double orderPresentAllocatedQty = 0.0;
//        double totalProcessQty;
//        double processedOrderQuantity;
//
//        try {
//            logger.info("Validating the orderRequest");
//            List<OrderDetailRequest> orderDetailRequestList = orderHeaderRequest.getOrderDetails();
//
//            //initialization of new variables
//            List<InputOrderStatusHistory> inputOrderStatusHistoryList = new ArrayList<>();
//            InputOrderStatusHistory inputOrderStatusHistory;
//            int oon = 01;
//            int numberOfFailedDetails = 0;
//            int numberOfPassedDetails = 0;
//            int numberOfPartialPassedDetails = 0;
//            String status;
//            String statusDescription;
//            String warehouseCode = "";
//            InputOrderDetail inputOrderDetail = new InputOrderDetail();
//            List<InputOrderDetail> inputOrderDetailList = new ArrayList<>();
//            ArrayList<String> outputOrderNumber = new ArrayList<>();
//            boolean partialFill = false;
//            boolean negativeFill = false;
//
//            // form keys from orderDetails to validate the null and blank of orderNumber and ownerCode fields
//            List<String> keys = Arrays.stream(OrderDetailRequest.class.getDeclaredFields()).map(Field::getName).collect(Collectors.toList());
//            keys.removeAll(new ArrayList<>(Arrays.asList("orderLineNumber", "externalLineNumber", "orderQuantity", "uom", "retailUnitPrice", "batchOrLot", "countryOfOrigin", "allocation", "cartonGroup", "cartonType", "cartonBreak", "cartoBreaknQty", "specialInstructions1", "specialInstructions2", "specialInstructions3", "specialInstructions4", "specialInstructions5", "vasDetailInstructions1", "vasDetailInstructions2", "vasDetailInstructions3", "udfTEXT1", "udfTEXT2", "udfTEXT3", "udfTEXT4", "udfTEXT5", "udfNumeric1", "udfNumeric2", "udfNumeric3", "udfNumeric4", "udfNumeric5", "udfDate1", "udfDate2", "udfDate3", "udfDate4", "udfDate5")));
//
//            // processing the order
//            List<WarehouseInventory> updateWarehouseInventories = new ArrayList<>();
//            WarehouseInventory warehouseInventory = new WarehouseInventory();
//
//            //order configuration true/false
//            List<OrderConfiguration> allOrderConfiguration = orderConfigurationService.getAllOrderConfiguration();
//            if (!allOrderConfiguration.isEmpty()) {
//                partialFill = allOrderConfiguration.stream()
//                        .anyMatch(oc -> oc.getConfigurationKey().equalsIgnoreCase("partialFill") && oc.getConfigurationValue().equalsIgnoreCase("true"));
//                negativeFill = allOrderConfiguration.stream()
//                        .anyMatch(oc -> oc.getConfigurationKey().equalsIgnoreCase("negativeFill") && oc.getConfigurationValue().equalsIgnoreCase("true"));
//            }
//
//            // processing order details (sku's)
//            for (OrderDetailRequest orderDetailRequest : orderDetailRequestList) {
//                totalProcessQty = 0;
//                processedOrderQuantity = 0;
//
//                try {
//                    inputOrderStatusHistoryList = new ArrayList<>();
//                    inputOrderDetail = modelMapper.map(orderDetailRequest, InputOrderDetail.class);
//                    inputOrderDetail.setOrderStatusHistory(inputOrderStatusHistoryList);
//
//                    String ownerCode = orderDetailRequest.getOwnerCode();
//                    String orderNumber = orderDetailRequest.getOrderNumber();
//                    String sku = orderDetailRequest.getSku();
//                    double orderQuantity = orderDetailRequest.getOrderQuantity();
//
//                    List<String> values = new ArrayList<>(Arrays.asList(orderDetailRequest.getOrderNumber(), orderDetailRequest.getOwnerCode(), orderDetailRequest.getSku()));
//                    Map<String, String> map = new HashMap<>();
//                    for (String key : keys) {
//                        if (values.get(keys.indexOf(key)) == null) {
//                            map.put(key, values.get(keys.indexOf(key)));
//                        } else {
//                            map.put(key, values.get(keys.indexOf(key)).stripTrailing());
//                        }
//                    }
//                    logger.info("validating orderDetails");
//                    validationService.validateNullAndBlank(map);
//
//                    if (!ownerCode.equalsIgnoreCase(headerOwnerCode)) {
//                        numberOfFailedDetails++;
//                        throw new MisMatchException(ownerCodeMismatch);
//                    }
//
//                    if (!orderNumber.equalsIgnoreCase(headerOrderNumber)) {
//                        numberOfFailedDetails++;
//                        throw new MisMatchException(orderNumberMismatch);
//                    }
//
//                    if (!orderValidationService.isQtyGreaterThanZero(orderQuantity)) {
//                        numberOfFailedDetails++;
//                        throw new QtyLessThanOrEqualToZero(invalidQty);
//                    }
//
//                    inputOrderStatusHistory = new InputOrderStatusHistory(inProgress, "Validating Item", String.valueOf(timestamp));
//                    inputOrderStatusHistoryList.add(inputOrderStatusHistory);
//
//                    Item item = itemService.getItem(ownerCode, sku);
//
//                    inputOrderStatusHistory = new InputOrderStatusHistory(inProgress, "Item Validated", String.valueOf(timestamp));
//                    inputOrderStatusHistoryList.add(inputOrderStatusHistory);
//
//                    logger.info("Checking inventory for available qty");
//                    List<WarehouseInventory> warehouseInventoryList = warehouseInventoryService.getByOwnerCodeAndSku(ownerCode, sku);
//                    List<Warehouse> warehouseList = warehouseService.getWarehouseList();
//
//                    List<Warehouse> priorityListWarehouses = warehouseList.stream().sorted(Comparator.comparing(Warehouse::getPriority)).toList();
//                    List<WarehouseInventory> filteredInventoryList = priorityListWarehouses.stream().flatMap(warehouse -> warehouseInventoryList.stream().filter(inventory -> inventory.getWarehouseInventoryKey().getWarehouseCode().equals(warehouse.getId().getWarehouseCode()))).toList();
//
//                    double totalAvailableQty = 0;
//                    OrderRequestRE orderRequestRE = new OrderRequestRE();
//                    List<WarehouseInventory> warehouseInventoriesList = new ArrayList<>();
//                    OrderRequestRE orderRequestREValues = null;
//                    int l = 0;
//
//                    //FILL (Checking inventory for all warehouse)
//                    for (WarehouseInventory inventory : filteredInventoryList) {
//                        logger.info("Checking for available aty for each warehouse");
//                        if (inventory.getAvailableQty() >= orderQuantity) {
//                            orderRequestREValues = passingValuesToRuleEngine(inventory, orderRequestRE, orderDetailRequest, totalAvailableQty);
//                            warehouseInventory = inventory;
//                            warehouseCode = warehouseInventory.getWarehouseInventoryKey().getWarehouseCode();
//                            totalProcessQty = processedOrderQuantity = orderQuantity;
//                            l++;
//                            break;
//                        }
//                    }
//
//                    //SPLIT (Total available qty from all warehouses)
//                    if (l == 0) {
//                        logger.info("Split order adding qty from all warehouse");
//                        warehouseInventoriesList = filteredInventoryList.stream().filter(a -> a.getAvailableQty() > 0).toList();
//                        if (!warehouseInventoriesList.isEmpty()) {
//                            if (!warehouseInventoriesList.isEmpty()) {
//                                warehouseInventory = filteredInventoryList.get(0);
//                                warehouseCode = warehouseInventory.getWarehouseInventoryKey().getWarehouseCode();
//                                totalAvailableQty = warehouseInventoriesList.stream().mapToDouble(WarehouseInventory::getAvailableQty).sum();
//                                orderRequestREValues = passingValuesToRuleEngine(warehouseInventory, orderRequestRE, orderDetailRequest, totalAvailableQty);
//                            }
//                        }
//                    }
//
//                    inputOrderStatusHistory = new InputOrderStatusHistory(inProgress, "Rule engine in progress", String.valueOf(timestamp));
//                    inputOrderStatusHistoryList.add(inputOrderStatusHistory);
//
//                    //Rule engines processing
//                    logger.info("Rule Engine Order Request:- " + objectMapper.writeValueAsString(orderRequestREValues));
//                    OrderResponseRE result = (OrderResponseRE) ruleEngine.run(orderInferenceEngine, orderRequestRE);
//                    logger.info("Result:- " + objectMapper.writeValueAsString(result));
//
//                    if (result == null) {
//                        inputOrderStatusHistory = new InputOrderStatusHistory(inProgress, "Rule engine failed.", String.valueOf(timestamp));
//                        inputOrderStatusHistoryList.add(inputOrderStatusHistory);
//                    }
//
//                    if (result == null) {
//                        inputOrderStatusHistory = new InputOrderStatusHistory(inProgress, "Checking for order configuration", String.valueOf(timestamp));
//                        inputOrderStatusHistoryList.add(inputOrderStatusHistory);
//                    }
//
//                    if (result == null && (!partialFill && !negativeFill)) {
//                        inputOrderStatusHistory = new InputOrderStatusHistory(inProgress, "Order configuration disabled", String.valueOf(timestamp));
//                        inputOrderStatusHistoryList.add(inputOrderStatusHistory);
//                    }
//
//                    if ((result == null && !partialFill && !negativeFill) || (result == null && !negativeFill && partialFill && totalAvailableQty <= 0)) {
//                        if (result == null && (result == null && !negativeFill && partialFill && totalAvailableQty <= 0)) {
//                            inputOrderStatusHistory = new InputOrderStatusHistory(inProgress, "Order configuration failed", String.valueOf(timestamp));
//                            inputOrderStatusHistoryList.add(inputOrderStatusHistory);
//                        }
//                        numberOfFailedDetails++;
//                        throw new Exception(availableQtyLessThanOrderQuantity);
//                    }
//
//                    //After processing rules and order configuration
//                    if (result != null) {
//                        logger.info("Rule Engine processed result:- " + objectMapper.writeValueAsString(result));
//                        inputOrderStatusHistory = new InputOrderStatusHistory(inProgress, result.getRuleName() + " Rule engine process completed", String.valueOf(timestamp));
//                        inputOrderStatusHistoryList.add(inputOrderStatusHistory);
//
//                        result.setSku(sku);
//                        result.setOwnerCode(ownerCode);
//                        result.setOrderNumber(orderNumber);
//                        result.setOrderQuantity(orderQuantity);
//                        ruleStatus.add(result.getRuleName());
//
//                        if (result.getStatus() != null && result.getStatus().equalsIgnoreCase("CREATED")) {
//                            outputOrderUpdateFields.add(new OutputOrderUpdateFields(warehouseCode, ownerCode, result.getSku(), inputOrderDetail.getOrderQuantity(), processedOrderQuantity, inputOrderNumber, inputOrderDetail.getOrderLineNumber(), result.getStatus()));
//                            totalProcessQty = processedOrderQuantity;
//                        } else if ((result.getStatus() != null && result.getStatus().equalsIgnoreCase("SPLIT ORDER"))) {
//                            warehouseInventoriesList = ruleCode(priorityListWarehouses, orderQuantity, warehouseInventoriesList, outputOrderUpdateFields, processedOrderQuantity, totalProcessQty, updateWarehouseInventories, ownerCode, result.getSku(), inputOrderDetail, inputOrderNumber, result);
//                            totalProcessQty = orderQuantity;
//                        }
//                    } else if (totalAvailableQty < orderQuantity && negativeFill) {
//                        logger.info("Negative filled. if partial flag is disabled & negative fill is enabled");
//                        int t = 1;
//                        for (Warehouse war : priorityListWarehouses) {
//                            if (orderQuantity > 0) {
//                                List<WarehouseInventory> warehouseInventory1 = warehouseInventoriesList.stream().filter(a -> a.getWarehouseInventoryKey().getWarehouseCode().equalsIgnoreCase(war.getId().getWarehouseCode())).toList();
//                                if (!warehouseInventory1.isEmpty()) {
//                                    if (warehouseInventory1.get(0).getAvailableQty() < orderQuantity && negativeFill && warehouseInventoriesList.size() == t) {
//                                        processedOrderQuantity = orderQuantity;
//                                        totalProcessQty = totalProcessQty + processedOrderQuantity;
//                                        warehouseInventory1.get(0).setAllocatedQty(warehouseInventory1.get(0).getAllocatedQty() + orderQuantity);
//                                        warehouseInventory1.get(0).setAvailableQty(warehouseInventory1.get(0).getAvailableQty() - orderQuantity);
//                                        orderQuantity = 0;
//
//                                        if (result == null) {
//                                            inputOrderStatusHistory = new InputOrderStatusHistory(inProgress, "Negative fill order executed", String.valueOf(timestamp));
//                                            inputOrderStatusHistoryList.add(inputOrderStatusHistory);
//                                        }
//                                    } else if (warehouseInventory1.get(0).getAvailableQty() < orderQuantity) {
//                                        orderQuantity = orderQuantity - warehouseInventory1.get(0).getAvailableQty();
//                                        processedOrderQuantity = warehouseInventory1.get(0).getAvailableQty();
//                                        totalProcessQty = totalProcessQty + processedOrderQuantity;
//                                        warehouseInventory1.get(0).setAllocatedQty(warehouseInventory1.get(0).getAllocatedQty() + warehouseInventory1.get(0).getAvailableQty());
//                                        warehouseInventory1.get(0).setAvailableQty(0.0);
//                                    } else if (warehouseInventory1.get(0).getAvailableQty() >= orderQuantity) {
//                                        processedOrderQuantity = orderQuantity;
//                                        totalProcessQty = totalProcessQty + processedOrderQuantity;
//                                        warehouseInventory1.get(0).setAllocatedQty(warehouseInventory1.get(0).getAllocatedQty() + orderQuantity);
//                                        warehouseInventory1.get(0).setAvailableQty(warehouseInventory1.get(0).getAvailableQty() - orderQuantity);
//                                        orderQuantity = 0;
//                                    }
//                                    updateWarehouseInventories.addAll(warehouseInventory1);
//                                    outputOrderUpdateFields.add(new OutputOrderUpdateFields(warehouseInventory1.get(0).getWarehouseInventoryKey().getWarehouseCode(), ownerCode, sku, inputOrderDetail.getOrderQuantity(), processedOrderQuantity, inputOrderNumber, inputOrderDetail.getOrderLineNumber(), result != null ? result.getStatus() : ""));
//                                    t++;
//                                } else if (warehouseInventoriesList.isEmpty()) {
//                                    updateWarehouseInventories = new ArrayList<>();
//                                    logger.info("All warehouse qty is 0 or less");
//                                    processedOrderQuantity = orderQuantity;
//                                    totalProcessQty = totalProcessQty + processedOrderQuantity;
//                                    filteredInventoryList.get(0).setAllocatedQty(filteredInventoryList.get(0).getAllocatedQty() + orderQuantity);
//                                    filteredInventoryList.get(0).setAvailableQty(filteredInventoryList.get(0).getAvailableQty() - orderQuantity);
//                                    orderQuantity = 0;
//
//                                    inputOrderStatusHistory = new InputOrderStatusHistory(inProgress, "Negative fill order executed", String.valueOf(timestamp));
//                                    inputOrderStatusHistoryList.add(inputOrderStatusHistory);
//
//                                    updateWarehouseInventories.add(filteredInventoryList.get(0));
//                                    warehouseInventoriesList = updateWarehouseInventories;
//                                    outputOrderUpdateFields.add(new OutputOrderUpdateFields(filteredInventoryList.get(0).getWarehouseInventoryKey().getWarehouseCode(), ownerCode, sku, inputOrderDetail.getOrderQuantity(), processedOrderQuantity, inputOrderNumber, inputOrderDetail.getOrderLineNumber(), result != null ? result.getStatus() : ""));
//                                }
//                            }
//                        }
//                    } else if (totalAvailableQty < orderQuantity && partialFill) {
//                        warehouseInventoriesList = ruleCode(priorityListWarehouses, orderQuantity, warehouseInventoriesList, outputOrderUpdateFields, processedOrderQuantity, totalProcessQty, updateWarehouseInventories, ownerCode, sku, inputOrderDetail, inputOrderNumber, result);
//                        totalProcessQty = totalAvailableQty;
//
//                        inputOrderStatusHistory = new InputOrderStatusHistory(inProgress, "partial fill order executed", String.valueOf(timestamp));
//                        inputOrderStatusHistoryList.add(inputOrderStatusHistory);
//                    }
//
//                    //Updating inventory and transaction logs added
//                    if (result != null) {
//                        if (result.getStatus() != null && result.getStatus().equalsIgnoreCase("CREATED")) {
//                            logger.info("Setting inventory");
//                            if (warehouseInventory != null) {
//                                warehouseInventory.setAllocatedQty(result.getAllocatedQuantity());
//                                warehouseInventory.setAvailableQty(result.getAvailableQuantity());
//                            }
//                            inputOrderDetail.setProcessedOrderQuantity(orderQuantity);
//                            InventoryTransactionLog inventoryTransactionLog = new InventoryTransactionLog(ownerCode, warehouseInventory != null && warehouseInventory.getWarehouseInventoryKey() != null ? warehouseInventory.getWarehouseInventoryKey().getWarehouseCode() : "", result.getSku(),  item!=null && (item.getCompanyCode()!=null && !item.getCompanyCode().isBlank()) ? item.getCompanyCode() : "", item!=null && (item.getSkuDesc()!=null && !item.getSkuDesc().isBlank()) ? item.getSkuDesc() : "", orderDetailRequest.getBatchOrLot(), orderDetailRequest.getCountryOfOrigin(), result.getOrderQuantity(), processedOrderQuantity, "", null, null, orderNumber, orderDetailRequest.getOrderLineNumber(), "SUCCESS", "Order Creation");
//                            warehouseInventoryService.internalUpdateInventory1(warehouseInventory, inventoryTransactionLog);
//                            logger.info("Inventory & transaction logs updated");
//                        } else if (isSplitOrder(result)) {
//                            for (WarehouseInventory warehouseInventory1 : warehouseInventoriesList) {
//                                List<OutputOrderUpdateFields> collect = outputOrderUpdateFields.stream().filter(a -> a.getWarehouseName().equalsIgnoreCase(warehouseInventory1.getWarehouseInventoryKey().getWarehouseCode()) && a.getSku().equalsIgnoreCase(warehouseInventory1.getWarehouseInventoryKey().getSku())).toList();
//                                logger.info("Updating inventory logs & transaction logs");
//                                InventoryTransactionLog inventoryTransactionLog1 = new InventoryTransactionLog(ownerCode, !collect.isEmpty() ? collect.get(0).getWarehouseName() : "", !collect.isEmpty() ? collect.get(0).getSku() : "", item!=null && (item.getCompanyCode()!=null && !item.getCompanyCode().isBlank()) ? item.getCompanyCode() : "", item!=null && (item.getSkuDesc()!=null && !item.getSkuDesc().isBlank()) ? item.getSkuDesc() : "", orderDetailRequest.getBatchOrLot(), orderDetailRequest.getCountryOfOrigin(), !collect.isEmpty() ? collect.get(0).getOrderQuantity() : 0.0, !collect.isEmpty() ? collect.get(0).getProcessedOrderQuantity() : 0.0, "", null, null, orderNumber, orderDetailRequest.getOrderLineNumber(), "SUCCESS", "Order Creation");
//                                warehouseInventoryService.internalUpdateInventory1(warehouseInventory1, inventoryTransactionLog1);
//                                logger.info("Inventory & transaction logs updated");
//                            }
//                            logger.info("Inventory Updated");
//                        }
//                    } else if (result == null && (negativeFill || partialFill)) {
//                        for (WarehouseInventory warehouseInventory1 : warehouseInventoriesList) {
//                            List<OutputOrderUpdateFields> collect = outputOrderUpdateFields.stream().filter(a -> a.getWarehouseName().equalsIgnoreCase(warehouseInventory1.getWarehouseInventoryKey().getWarehouseCode()) && a.getSku().equalsIgnoreCase(warehouseInventory1.getWarehouseInventoryKey().getSku())).toList();
//                            logger.info("Updating inventory logs & transaction logs");
//                            InventoryTransactionLog inventoryTransactionLog1 = new InventoryTransactionLog(ownerCode, !collect.isEmpty() ? collect.get(0).getWarehouseName() : "", !collect.isEmpty() ? collect.get(0).getSku() : "", item!=null && (item.getCompanyCode()!=null && !item.getCompanyCode().isBlank()) ? item.getCompanyCode() : "", item!=null && (item.getSkuDesc()!=null && !item.getSkuDesc().isBlank()) ? item.getSkuDesc() : "", orderDetailRequest.getBatchOrLot(), orderDetailRequest.getCountryOfOrigin(), !collect.isEmpty() ? collect.get(0).getOrderQuantity() : 0.0, !collect.isEmpty() ? collect.get(0).getProcessedOrderQuantity() : 0.0, "", null, null, orderNumber, orderDetailRequest.getOrderLineNumber(), "SUCCESS", "Order Creation");
//                            warehouseInventoryService.internalUpdateInventory1(warehouseInventory1, inventoryTransactionLog1);
//                            logger.info("Inventory & transaction logs updated");
//                        }
//
//                        logger.info("Inventory Updated");
//                    }
//
//                    //setting status history for order configuration disabled
//                    if (result == null && (!partialFill && !negativeFill)) {
//                        inputOrderStatusHistory = new InputOrderStatusHistory(inProgress, "Order configuration disabled", String.valueOf(timestamp));
//                        inputOrderStatusHistoryList.add(inputOrderStatusHistory);
//                    }
//
//                    //Setting input order status history
//                    if (result == null && (!partialFill && !negativeFill)) {
//                        numberOfFailedDetails++;
//                        inputOrderStatusHistory = new InputOrderStatusHistory(rejected, "ORDER REJECTED", String.valueOf(timestamp));
//                        inputOrderDetail.setStatus(rejected);
//                    } else if (result == null && negativeFill) {
//                        numberOfPassedDetails++;
//                        inputOrderStatusHistory = new InputOrderStatusHistory("NEGATIVE FILL CREATED", "NEGATIVE FILL ORDER CREATED", String.valueOf(timestamp));
//                        inputOrderDetail.setStatus("NEGATIVE FILL CREATED");
//                    } else if (result == null && partialFill) {
//                        numberOfPartialPassedDetails++;
//                        inputOrderStatusHistory = new InputOrderStatusHistory("PARTIAL CREATED", "PARTIAL SPLIT ORDER CREATED", String.valueOf(timestamp));
//                        inputOrderDetail.setStatus("PARTIAL CREATED");
//                    } else if (result != null && result.getStatus().equalsIgnoreCase("SPLIT ORDER")) {
//                        numberOfPassedDetails++;
//                        inputOrderStatusHistory = new InputOrderStatusHistory("SPLIT ORDER CREATED", "SPLIT ORDER CREATED", String.valueOf(timestamp));
//                        inputOrderDetail.setStatus("SPLIT ORDER CREATED");
//                    } else if (result != null && result.getStatus().equalsIgnoreCase("CREATED")) {
//                        numberOfPassedDetails++;
//                        inputOrderStatusHistory = new InputOrderStatusHistory(created, "ORDER CREATED", String.valueOf(timestamp));
//                        inputOrderDetail.setStatus(created);
//                    }
//
//                    inputOrderDetail.setProcessedOrderQuantity(totalProcessQty);
//                    inputOrderStatusHistoryList.add(inputOrderStatusHistory);
//                    inputOrderDetail.setOrderLineNumber(inputOrderDetail.getOrderLineNumber() != null ? inputOrderDetail.getOrderLineNumber() : "");
//                    inputOrderDetail.setOrderStatusHistory(inputOrderStatusHistoryList);
//                    inputOrderDetailList.add(inputOrderDetail);
//
//                } catch (Exception e) {
//                    e.printStackTrace();
//                    numberOfFailedDetails++;
//                    inputOrderStatusHistory = new InputOrderStatusHistory(rejected, e.getMessage(), String.valueOf(timestamp));
//                    inputOrderStatusHistoryList.add(inputOrderStatusHistory);
//                    inputOrderDetail.setStatus(rejected);
//                    inputOrderDetail.setOrderLineNumber(inputOrderDetail.getOrderLineNumber() != null ? inputOrderDetail.getOrderLineNumber() : "");
//                    inputOrderDetail.setOrderStatusHistory(inputOrderStatusHistoryList);
//                    inputOrderDetailList.add(inputOrderDetail);
//                }
//            }
//
//            //setting input order status
//            if (numberOfFailedDetails == 0) {
//                if (numberOfPartialPassedDetails != 0) {
//                    statusDescription = "Order Created partially";
//                    status = "PARTIAL SUCCESS";
//                } else {
//                    statusDescription = orderCreated;
//                    status = success;
//                }
//            } else if (numberOfPartialPassedDetails != 0 || numberOfPassedDetails != 0) {
//                statusDescription = "Order Created partially";
//                status = "PARTIAL SUCCESS";
//            } else {
//                statusDescription = orderNotCreated;
//                status = failure;
//                outputOrderNumber = null;
//            }
//
//            //Setting final rule status
//            String finalRuleStatus = null;
//            if (ruleStatus != null) {
//                if (!ruleStatus.isEmpty()) {
//                    logger.info("Setting final rule status");
//                    boolean containsFill = ruleStatus.stream().anyMatch(a -> a.equalsIgnoreCase("FILL"));
//                    boolean containsSplit = ruleStatus.stream().anyMatch(a -> a.equalsIgnoreCase("SPLIT ORDER"));
//                    finalRuleStatus = containsFill && containsSplit ? "SPLIT RULE PROCESSED" : containsFill ? "FILL RULE PROCESSED" : containsSplit ? "SPLIT RULE PROCESSED" : partialFill ? "PARTIAL SPLIT ORDER" : negativeFill ? "NEGATIVE FILL ORDER" : null;
//                }
//            }
//
//            //Output order generated based on number of warehouse
//            List<String> warehouses = outputOrderUpdateFields.stream().map(OutputOrderUpdateFields::getWarehouseName).distinct().toList();
//            if (!status.equalsIgnoreCase(failure)) {
//                if (!warehouses.isEmpty() && warehouses.size() > 1) {
//                    for (int i = 0; i < warehouses.size(); i++) {
//                        String formattedNumber = String.format("%02d", oon);
//                        outputOrderNumber.add(inputOrderNumber.concat("_").concat(String.valueOf(formattedNumber)));
//                        oon++;
//                    }
//                } else {
//                    String formattedNumber = String.format("%02d", oon);
//                    outputOrderNumber.add(inputOrderNumber.concat("_").concat(String.valueOf(formattedNumber)));
//                }
//            }
//
//            //setting input order
//            inputOrder.getOrderHeader().setOrderDetails(inputOrderDetailList);
//            inputOrder.setStatus(status);
//            inputOrder.setRuleStatus(finalRuleStatus);
//            inputOrder.setInputOrderNumber(inputOrderNumber);
//            inputOrder.setOutputOrderNumber(outputOrderNumber);
//            inputOrder.setStatusDescription(statusDescription);
//            inputOrder.setStatusDate(timestamp);
//            inputOrder.setFutureAllocatedQty(orderFutureAllocatedQty);
//            inputOrder.setPresentAllocatedQty(orderPresentAllocatedQty);
//            inputOrderRepository.save(inputOrder);
//
//            InputOrderQueueDashboard inputOrderQueueDashboard = modelMapper.map(inputOrder, InputOrderQueueDashboard.class);
//            inputOrderDashboardRepository.save(inputOrderQueueDashboard);
//
//            List<InputOrderQueue> inputOrderQueueList = inputOrderQueueRepository.findByInputOrderNumberOrderByIdDesc(inputOrderNumber);
//
//            if (!inputOrderQueueList.isEmpty()) {
//                InputOrderQueue inputOrderQueue1 = inputOrderQueueList.get(0);
//                inputOrderQueueRepository.delete(inputOrderQueue1);
//
//                InputOrderQueue inputOrderQueue = modelMapper.map(inputOrder, InputOrderQueue.class);
//                InputOrderRequest inputOrderRequest = modelMapper.map(inputOrder, InputOrderRequest.class);
//
//                inputOrderQueue.setOrderRequest(inputOrderRequest);
//                inputOrderQueueRepository.save(inputOrderQueue);
//            }
//
//            List<InputOrderDetail> all = inputOrderDetailRepository.findAll();
//            for (InputOrderDetail input : all) {
//                if (input.getStatus() == null)
//                    inputOrderDetailRepository.delete(input);
//            }
//
//            //Setting output order
//            updateOutputOrder(warehouses, status, inputOrder, outputOrderUpdateFields, timestamp, outputOrderNumber);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            inputOrder.setInputOrderNumber(inputOrderNumber);
//            inputOrder.setOutputOrderNumber(null);
//            inputOrder.setStatus(failure);
//            inputOrder.setStatusDescription(e.getMessage());
//            inputOrder.setStatusDate(timestamp);
//            logger.info("failed create orderRequest");
//            inputOrderRepository.save(inputOrder);
//            logger.info("exit from crete order method");
//
//            InputOrderQueueDashboard inputOrderDashboard = modelMapper.map(inputOrder, InputOrderQueueDashboard.class);
//            inputOrderDashboardRepository.save(inputOrderDashboard);
//            logger.info("added order detailed successfully in input Dashboard orderTable");
//        }
//    }
//
//    private static boolean isSplitOrder(OrderResponseRE result) {
//        return result.getStatus().equalsIgnoreCase("SPLIT ORDER");
//    }
//
//    private List<WarehouseInventory> ruleCode(List<Warehouse> priorityListWarehouses, double orderQuantity, List<WarehouseInventory> warehouseInventoriesList, List<OutputOrderUpdateFields> outputOrderUpdateFields, double processedOrderQuantity, double totalProcessQty, List<WarehouseInventory> updateWarehouseInventories, String ownerCode, String sku, InputOrderDetail inputOrderDetail, String inputOrderNumber, OrderResponseRE result) {
//        updateWarehouseInventories = new ArrayList<>();
//        for (Warehouse war : priorityListWarehouses) {
//            if (orderQuantity > 0) {
//                List<WarehouseInventory> warehouseInventory1 = warehouseInventoriesList.stream().filter(a -> a.getWarehouseInventoryKey().getWarehouseCode().equalsIgnoreCase(war.getId().getWarehouseCode())).toList();
//                if (!warehouseInventory1.isEmpty()) {
//                    if (warehouseInventory1.get(0).getAvailableQty() < orderQuantity) {
//                        orderQuantity = orderQuantity - warehouseInventory1.get(0).getAvailableQty();
//                        processedOrderQuantity = warehouseInventory1.get(0).getAvailableQty();
//                        totalProcessQty = totalProcessQty + processedOrderQuantity;
//                        warehouseInventory1.get(0).setAllocatedQty(warehouseInventory1.get(0).getAllocatedQty() + warehouseInventory1.get(0).getAvailableQty());
//                        warehouseInventory1.get(0).setAvailableQty(0.0);
//                    } else if (warehouseInventory1.get(0).getAvailableQty() >= orderQuantity) {
//                        processedOrderQuantity = orderQuantity;
//                        totalProcessQty = totalProcessQty + processedOrderQuantity;
//                        warehouseInventory1.get(0).setAllocatedQty(warehouseInventory1.get(0).getAllocatedQty() + orderQuantity);
//                        warehouseInventory1.get(0).setAvailableQty(warehouseInventory1.get(0).getAvailableQty() - orderQuantity);
//                        orderQuantity = 0;
//                    }
//                    updateWarehouseInventories.addAll(warehouseInventory1);
//                    outputOrderUpdateFields.add(new OutputOrderUpdateFields(war.getId().getWarehouseCode(), ownerCode, sku, inputOrderDetail.getOrderQuantity(), processedOrderQuantity, inputOrderNumber, inputOrderDetail.getOrderLineNumber(), result != null ? result.getStatus() : ""));
//                }
//            }
//        }
//        return updateWarehouseInventories;
//    }
//
//    private OrderRequestRE passingValuesToRuleEngine(WarehouseInventory inventory, OrderRequestRE
//            orderRequestRE, OrderDetailRequest orderDetailRequest, double totalAvailableQty) {
//        if (inventory != null) {
//            orderRequestRE.setOwnerCode(orderDetailRequest.getOwnerCode());
//            orderRequestRE.setOrderNumber(orderDetailRequest.getOrderNumber());
//            orderRequestRE.setSku(orderDetailRequest.getSku());
//            orderRequestRE.setOrderQuantity(orderDetailRequest.getOrderQuantity());
//            orderRequestRE.setOnHandQuantity(inventory.getOnHandQty());
//            orderRequestRE.setAvailableQuantity(inventory.getAvailableQty());
//            orderRequestRE.setAllocatedQuantity(inventory.getAllocatedQty());
//            orderRequestRE.setHoldQuantity(inventory.getHoldQty());
//            orderRequestRE.setTotalAvailableQuantity(totalAvailableQty);
//        }
//        return orderRequestRE;
//    }
//
//    private void updateOutputOrder(List<String> warehouses, String status, InputOrder
//            inputOrder, List<OutputOrderUpdateFields> outputOrderUpdateFields, String
//                                           timestamp, ArrayList<String> outputOrderNumber) {
//        logger.info("Enter into updating outputOrder method");
//        int i = 0;
//        ModelMapper modelMapper = new ModelMapper();
//        for (String warehouse : warehouses) {
//            OutputOrderQueue outputOrderQueue = new OutputOrderQueue();
//            if (!status.equalsIgnoreCase(failure)) {
//                outputOrderQueue = modelMapper.map(inputOrder, OutputOrderQueue.class);
//                outputOrderQueue.setId(0L);
//                List<OutputOrderDetail> removeOutputOrderDetailList = outputOrderQueue.getOrderHeader().getOrderDetails().stream().filter(d -> d.getStatus() != null && !d.getStatus().isBlank() && d.getStatus().equalsIgnoreCase("REJECTED")).toList();
//                outputOrderQueue.getOrderHeader().getOrderDetails().removeAll(removeOutputOrderDetailList);
//
//                List<OutputOrderUpdateFields> warehouseOutputOrderFields = outputOrderUpdateFields.stream().filter(a -> a.getWarehouseName().equalsIgnoreCase(warehouse)).collect(Collectors.toList());
//                List<OutputOrderDetail> resultOutputOrderDetailList = new ArrayList<>();
//                List<OutputOrderDetail> outputOrderDetailList = getUpdatedOutputOrderDetails(warehouseOutputOrderFields, resultOutputOrderDetailList);
//
//                outputOrderQueue.getOrderHeader().setOrderDetails(outputOrderDetailList);
//                outputOrderQueue.setWarehouseCode(warehouse);
//                outputOrderQueue.setInputOrderNumber(inputOrder.getInputOrderNumber());
//                outputOrderQueue.setOutputOrderNumber(outputOrderNumber.get(i));
//                outputOrderQueue.setStatus(newStatus);
//                outputOrderQueue.setStatusDate(timestamp);
//                outputOrderQueueRepository.save(outputOrderQueue);
//                logger.info("added order detailed successfully in output orderTable");
//
//                logger.info("now adding success order details to dashboard output order table");
//                OutputOrderDashboard outputOrderDashboard = modelMapper.map(outputOrderQueue, OutputOrderDashboard.class);
//                outputOrderDashboardRepository.save(outputOrderDashboard);
//                logger.info("added order detailed successfully in Dashboard output orderTable");
//                logger.info("exit from crete order method");
//                i++;
//            }
//        }
//    }
//
//    private List<OutputOrderDetail> getUpdatedOutputOrderDetails
//            (List<OutputOrderUpdateFields> outputOrderUpdateFields, List<OutputOrderDetail> resultOutputOrderDetailList) {
//        logger.info("updating outputOrderQueue");
//        int i = 0;
//        for (OutputOrderUpdateFields outputOrderUpdateFields1 : outputOrderUpdateFields) {
//            OutputOrderDetail outputOrderDetail = new OutputOrderDetail();
//            outputOrderDetail.setOrderLineNumber(outputOrderUpdateFields1.getOrderLineNumber() != null && !outputOrderUpdateFields1.getOrderLineNumber().isBlank() ? outputOrderUpdateFields1.getOrderLineNumber() : "");
//            outputOrderDetail.setSku(outputOrderUpdateFields1.getSku());
//            outputOrderDetail.setStatus(outputOrderUpdateFields.get(i).getRuleName());
//            outputOrderDetail.setOrderQuantity(outputOrderUpdateFields.get(i).getOrderQuantity());
//            outputOrderDetail.setProcessedOrderQuantity(outputOrderUpdateFields.get(i).getProcessedOrderQuantity());
//            outputOrderDetail.setOrderNumber(outputOrderUpdateFields.get(i).getInputOrderNumber());
//            outputOrderDetail.setOwnerCode(outputOrderUpdateFields.get(i).getOwnerCode());
//
//            List<OutputOrderStatusHistory> outputOrderStatusHistoryList = new ArrayList<>();
//            OutputOrderStatusHistory outputOrderStatusHistory = new OutputOrderStatusHistory("NEW", LocalDateTime.now().toString(), "Newly Created Order");
//            outputOrderStatusHistoryList.add(outputOrderStatusHistory);
//            outputOrderDetail.setOutputOrderStatusHistory(outputOrderStatusHistoryList);
//            resultOutputOrderDetailList.add(outputOrderDetail);
//            i++;
//        }
//        return resultOutputOrderDetailList;
//    }
//}