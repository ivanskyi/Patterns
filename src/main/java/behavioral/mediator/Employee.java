package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public abstract class Employee {

    protected Mediator mediator;
    protected String name;
    protected List<String> receivedMessages = new ArrayList<>();

    public Employee(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public void send(String message) {
        mediator.notify(message, this);
    }

    public boolean hasReceivedMessage(String message) {
        return receivedMessages.contains(message);
    }

    public abstract void receive(String message);
}
