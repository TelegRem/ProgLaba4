package all;

public abstract class absCharacter {
    private String name;

    public absCharacter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + this.getName().hashCode();
    }

    @Override
    public boolean equals(Object ob) {
        if (ob == this) return true;
        if (ob == null || ob.getClass() != getClass()) return false;

        absCharacter character = (absCharacter) ob;
        return character.name.equals(name);
        // return Objects.equals(this.name, character.name);


    }

    @Override
    public String toString() {
        return "Объект " + this.getName();

    }
}
