package structural.decorator;

public class JavaDeveloperDecorator extends DeveloperDecorator {

    public JavaDeveloperDecorator(Developer developer) {
        super(developer);
    }

    @Override
    public String makeJob() {
        return super.makeJob() + " + Writes Java code";
    }
}
