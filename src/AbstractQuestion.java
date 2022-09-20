public abstract class AbstractQuestion implements Question {
    private String id;
    private String name;
    private Level level;

    public AbstractQuestion(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Level getLevel() {
        return this.level;
    }
}
