package creational.factorymethod;

public class Orange extends TelecommunicationCompany {

    @Override
    public Notification createNotification() {
        return new SmsNotification();
    }
}
