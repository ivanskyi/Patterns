package structural.flyweight;

public class TreeType {

    private final String name;
    private final String color;
    private final String texture;

    public TreeType(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    public String getDescription() {
        return name + " " +  color + " " + texture;
    }
}
