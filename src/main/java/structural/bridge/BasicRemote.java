package structural.bridge;

public class BasicRemote extends RemoteControl {

    private boolean on = false;

    public BasicRemote(Device device) {
        super(device);
    }

    public void togglePower() {
        if (on) {
            device.turnOff();
        } else {
            device.turnOn();
        }
        on = !on;
    }
}
