package structural.decorator;

public class MentorDecorator extends DeveloperDecorator {

    public MentorDecorator(Developer developer) {
        super(developer);
    }

    @Override
    public String makeJob() {
        return super.makeJob() + " + Mentors juniors";
    }
}
