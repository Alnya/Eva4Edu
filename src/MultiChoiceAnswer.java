public class MultiChoiceAnswer {
    private String questionId;
    private String text;

    public MultiChoiceAnswer(String questionId, String text) {
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
