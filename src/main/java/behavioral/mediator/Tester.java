package behavioral.mediator;

public class Tester extends Employee {

    Tester(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void receive(String message) {
        receivedMessages.add(message);
    }
}
