package structural.flyweight;

public class Tree {

    private final TreeType type;

    public Tree(TreeType type) {
        this.type = type;
    }

    public String getDescription() {
        return type.getDescription();
    }
}
