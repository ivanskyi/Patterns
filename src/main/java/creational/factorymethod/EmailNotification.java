package creational.factorymethod;

public class EmailNotification extends Notification {

    @Override
    public Notification send() {
        System.out.println("Sending email notification");
        return this;
    }
}
