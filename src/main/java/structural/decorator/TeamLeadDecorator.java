package structural.decorator;

public class TeamLeadDecorator extends DeveloperDecorator {

    public TeamLeadDecorator(Developer developer) {
        super(developer);
    }

    @Override
    public String makeJob() {
        return super.makeJob() + " + Manages team";
    }
}
