package behavioral.visitor;

public class Circle implements Shape {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
