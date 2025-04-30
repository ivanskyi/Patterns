package behavioral.chainofresponsibility;

import java.util.List;

public abstract class LanguageLearningHandler {

    protected LanguageLearningHandler next;

    public LanguageLearningHandler setNext(LanguageLearningHandler next) {
        this.next = next;
        return next;
    }

    public abstract void handle(List<Languages> languages);
}
