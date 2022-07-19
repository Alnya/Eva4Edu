public class Question {
    private String name;
    private int level;

    public Question() {
    }

    public Question(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return this.name;
    }

    public int getLevel() {
        return this.level;
    }
}
