package creational.abstractfactory;

public class HumanMindFactory implements MindFactory {

    @Override
    public Consciousness createConsciousness() {
        return new HumanConsciousness();
    }

    @Override
    public Subconscious createSubconscious() {
        return new HumanSubconscious();
    }
}
