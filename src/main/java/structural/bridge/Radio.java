package structural.bridge;

public class Radio implements Device {

    public void turnOn() {
        System.out.println("Radio is ON");
    }

    public void turnOff() {
        System.out.println("Radio is OFF");
    }
}
