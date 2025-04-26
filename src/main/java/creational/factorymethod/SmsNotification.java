package creational.factorymethod;

public class SmsNotification extends Notification {

    @Override
    public Notification send() {
        System.out.println("Sending SMS notification");
        return this;
    }
}
