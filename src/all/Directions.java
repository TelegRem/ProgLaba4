package all;
public enum Directions {
    UP("вверх"),
    DOWN("вниз"),
    LEFT("влево"),
    RIGHT("вправо");

    private final String description;

    Directions(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
