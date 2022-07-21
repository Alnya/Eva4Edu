public class Choice {
    private String questionId;
    private String text;

    public Choice() {
    }

    public Choice(String questionId, String text) {
        this.questionId = questionId;
        this.text = text;
    }

    public String getQuestionId() {
        return this.questionId;
    }

    public String getText() {
        return this.text;
    }
}
