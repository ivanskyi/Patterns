package behavioral.mediator;

public class Developer extends Employee {

    Developer(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void receive(String message) {
        receivedMessages.add(message);
    }
}
