package behavioral.visitor;

public class PerimeterCalculator implements Visitor {

    @Override
    public double visit(Circle circle) {
        return  2 * Math.PI * circle.getRadius();
    }

    @Override
    public double visit(Rectangle rectangle) {
        return  2 * (rectangle.getWidth() + rectangle.getHeight());
    }
}
