public class Question {
    private String id;
    private String name;
    private int level;

    /**
     * Question constructor
     * id is unique so that the constructor must include id.
     *
     * @param id the unique number of a question.
     */
    public Question(String id) {
        this.id = id;
    }

    public Question(String id, String name) {
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
