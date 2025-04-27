package creational.factorymethod;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class FactoryMethodPatternTest {

    @Test
    @DisplayName("Each TelecommunicationCompany produces a distinct Notification type")
    void shouldCreateDistinctNotificationTypesByCompany() {
        TelecommunicationCompany vodafone = new Vodafone();
        Notification vodafoneNotification = vodafone.createPromotionNotification();
        assertInstanceOf(EmailNotification.class, vodafoneNotification);

        TelecommunicationCompany orange = new Orange();
        Notification orangeNotification = orange.createPromotionNotification();
        assertInstanceOf(SmsNotification.class, orangeNotification);
    }
}
