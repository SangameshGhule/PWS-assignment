package OpenClose;

public class MainClass {

    public static void main(String[] args) {
        Notification n = new MobileNotification();
        n.sendOTP("1234");
        n.sendTransactionReport("444");
    }
}
