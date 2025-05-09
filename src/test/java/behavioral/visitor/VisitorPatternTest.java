package behavioral.visitor;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VisitorPatternTest {

    @Test
    @DisplayName("Should correctly calculate area for Circle and Rectangle")
    public void shouldCalculateAreaForShapes() {
        Visitor areaCalculator = new AreaCalculator();

        Circle circle = new Circle(10);
        Rectangle rectangle = new Rectangle(5, 10);

        double circleArea = circle.accept(areaCalculator);
        assertEquals(314.1592653589793, circleArea);

        double rectangleArea = rectangle.accept(areaCalculator);
        assertEquals(50.0, rectangleArea);
    }

    @Test
    @DisplayName("Should correctly calculate perimeter for Circle and Rectangle")
    public void shouldCalculatePerimeterForShapes() {
        Visitor perimeterCalculator = new PerimeterCalculator();

        Circle circle = new Circle(10);
        Rectangle rectangle = new Rectangle(5, 10);

        double circlePerimeter = circle.accept(perimeterCalculator);
        assertEquals(62.83185307179586, circlePerimeter);

        double rectanglePerimeter = rectangle.accept(perimeterCalculator);
        assertEquals(30.0, rectanglePerimeter);
    }
}
