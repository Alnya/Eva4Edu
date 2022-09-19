public abstract class AbstractQuestion implements Question {
    private String id;
    private String name;
    private int level = 0;

    public AbstractQuestion(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getLevel() {
        return this.level;
    }
}
