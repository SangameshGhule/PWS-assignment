package OpenClose;

public class MobileNotification implements Notification{

    String medium = "0123";
    @Override
    public void sendOTP(String medium) {
        System.out.println("Mobile otp"+ this.medium +  medium);
    }

    @Override
    public void sendTransactionReport(String medium) {
        System.out.println("Mobile transaction report");
    }


}
