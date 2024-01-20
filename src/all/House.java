package all;

public class House extends absCharacter{
    public House(String name) {
        super(name);
    }
    public String door = "Дверь";
    public String window = "Окно";
    public String fireplace = "Камин";
    public String floor = "Пол";

    @Override
    public int hashCode() {
        return super.hashCode() + this.getName().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode();
    }

    @Override
    public String toString() {
        return "Дом: " + this.getName();
    }

}
