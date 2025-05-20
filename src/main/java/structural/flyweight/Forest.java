package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Forest {

    private final List<Tree> trees = new ArrayList<>();

    public void plantTree(String name, String color, String texture) {
        TreeType type = TreeFactory.getTreeType(name, color, texture);
        Tree tree = new Tree(type);
        trees.add(tree);
    }

    public String getDescription() {
        StringBuilder buffer = new StringBuilder();
        for (Tree tree : trees) {
            buffer.append(tree.getDescription()).append(" ");
        }
        return buffer.toString();
    }
}
