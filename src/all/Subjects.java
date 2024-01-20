package all;

public enum Subjects {
    LEAVES("листья"),
    BRUSHWOOD("хворост");

    private final String description;

    Subjects(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
