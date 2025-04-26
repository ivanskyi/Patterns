package creational.factorymethod;

public abstract class TelecommunicationCompany {

    public abstract Notification createNotification();

    public Notification createPromotionNotification() {
        return createNotification();
    }
}
