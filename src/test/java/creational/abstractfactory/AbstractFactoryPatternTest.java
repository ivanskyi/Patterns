package creational.abstractfactory;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class AbstractFactoryPatternTest {

    @Test
    @DisplayName("Verify RobotMindFactory creates correct instances of Consciousness and Subconscious")
    public void shouldProvideCorrectInstancesOfRobotMindFactoryObjects() {
        MindFactory mindFactory = new RobotMindFactory();
        Consciousness consciousness = mindFactory.createConsciousness();
        Subconscious subconscious = mindFactory.createSubconscious();
        assertInstanceOf(RobotConsciousness.class, consciousness);
        assertInstanceOf(RobotSubconscious.class, subconscious);
    }

    @Test
    @DisplayName("Verify HumanMindFactory creates correct instances of Consciousness and Subconscious")
    public void shouldProvideCorrectInstancesOfHumanMindFactoryObjects() {
        MindFactory mindFactory = new HumanMindFactory();
        Consciousness consciousness = mindFactory.createConsciousness();
        Subconscious subconscious = mindFactory.createSubconscious();
        assertInstanceOf(HumanConsciousness.class, consciousness);
        assertInstanceOf(HumanSubconscious.class, subconscious);
    }

    @Test
    @DisplayName("Verify Robot Consciousness awakens exactly once when triggered")
    public void shouldAwakenRobotConsciousnessOnce() {
        MindFactory mindFactory = new RobotMindFactory();
        Consciousness consciousness = mindFactory.createConsciousness();
        Consciousness spyConsciousness = spy(consciousness);
        spyConsciousness.awaken();
        verify(spyConsciousness, times(1)).awaken();
        assertNotNull(spyConsciousness);
    }

    @Test
    @DisplayName("Verify Human Subconscious awakens exactly once when triggered")
    public void shouldCallAwakenOnceForHumanSubconscious() {
        MindFactory mindFactory = new HumanMindFactory();
        Subconscious subconscious = mindFactory.createSubconscious();
        Subconscious spySubconscious = spy(subconscious);
        spySubconscious.awaken();
        verify(spySubconscious, times(1)).awaken();
        assertNotNull(spySubconscious);
    }
}
