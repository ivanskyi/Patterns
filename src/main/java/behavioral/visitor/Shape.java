package behavioral.visitor;

public interface Shape {

    double accept(Visitor visitor);
}
