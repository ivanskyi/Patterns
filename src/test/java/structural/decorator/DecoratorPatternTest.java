package structural.decorator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecoratorPatternTest {

    @Test
    @DisplayName("Should build developer roles using Decorator Pattern")
    public void shouldBuildDeveloperRolesWithDecorators() {
        Developer developer = new BasicDeveloper();
        assertEquals("Writes code", developer.makeJob());

        Developer javaDeveloper = new JavaDeveloperDecorator(developer);
        assertEquals("Writes code + Writes Java code", javaDeveloper.makeJob());

        Developer teamLead = new TeamLeadDecorator(javaDeveloper);
        assertEquals("Writes code + Writes Java code + Manages team", teamLead.makeJob());

        Developer mentor = new MentorDecorator(teamLead);
        assertEquals("Writes code + Writes Java code + Manages team + Mentors juniors", mentor.makeJob());
    }
}
