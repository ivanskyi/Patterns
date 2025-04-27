package creational.abstractfactory;

public class RobotMindFactory implements MindFactory {

    @Override
    public Consciousness createConsciousness() {
        return new RobotConsciousness();
    }

    @Override
    public Subconscious createSubconscious() {
        return new RobotSubconscious();
    }
}
