package creational.builder;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HierarchicalBuilderPatternTest {

    @Test
    @DisplayName("Should correctly build objects using Builder pattern")
    void shouldCorrectlyBuildObjectsUsingBuilderPattern() {
        Developer developer = new Developer.Builder<>()
                .name("Oleh")
                .age(55)
                .build();

        BackendDeveloper backendDeveloper = new BackendDeveloper.Builder()
                .name("Pavlo")
                .age(35)
                .position("Java developer")
                .build();

        assertEquals("Oleh", developer.name);
        assertEquals(55, developer.age);

        assertEquals("Pavlo", backendDeveloper.name);
        assertEquals("Java developer", backendDeveloper.position);
        assertEquals(35, backendDeveloper.age);
        assertInstanceOf(BackendDeveloper.class, backendDeveloper);
    }
}
