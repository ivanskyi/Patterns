package creational.factorymethod;

public class Vodafone extends TelecommunicationCompany {

    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
