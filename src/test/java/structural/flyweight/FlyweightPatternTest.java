package structural.flyweight;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlyweightPatternTest {

    @Test
    @DisplayName("Creates and reuses flyweight objects correctly")
    public void createsAndReusesTreeTypes() {
        Forest forest = new Forest();
        forest.plantTree("Oak", "Green", "Rough");
        forest.plantTree("Pine", "Dark Green", "Smooth");
        forest.plantTree("Oak", "Green", "Rough");
        forest.plantTree("Pine", "Dark Green", "Smooth");
        String description = forest.getDescription();
        String expectedDescription = "Oak Green Rough Pine Dark Green Smooth Oak Green Rough Pine Dark Green Smooth ";
        assertEquals(expectedDescription, description);
    }
}
