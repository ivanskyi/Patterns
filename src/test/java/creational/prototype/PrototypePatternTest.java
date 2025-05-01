package creational.prototype;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PrototypePatternTest {

    @Test
    @DisplayName("Cloned object should have independent state from the original")
    public void shouldCreateIndependentClones() {
        Developer juniorDeveloper = new Developer(DeveloperRank.JUNIOR);

        Developer clone = juniorDeveloper.clone();
        clone.setRank(DeveloperRank.MIDDLE);

        assertEquals(DeveloperRank.JUNIOR, juniorDeveloper.getRank());
        assertEquals(DeveloperRank.MIDDLE, clone.getRank());
    }

    @Test
    @DisplayName("Clone should not affect the original object's state")
    public void shouldCloneWithDistinctState() {
        Developer juniorDeveloper = new Developer(DeveloperRank.JUNIOR);
        juniorDeveloper.addNewSkill(DeveloperSkill.JAVA);

        Developer clone = juniorDeveloper.clone();
        clone.addNewSkill(DeveloperSkill.SPRING);

        assertEquals(List.of(DeveloperSkill.JAVA), juniorDeveloper.getSkills());
        assertEquals(List.of(DeveloperSkill.JAVA, DeveloperSkill.SPRING), clone.getSkills());
    }
}
