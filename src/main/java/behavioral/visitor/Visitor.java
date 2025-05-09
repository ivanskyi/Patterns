package behavioral.visitor;

public interface Visitor {

    double visit(Circle circle);

    double visit(Rectangle rectangle);
}
