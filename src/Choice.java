public class Choice implements UserResponse{
    private String questionId;
    private String text;

    private final boolean isAnswer;

    public Choice(String questionId, String text, boolean isAnswer) {
        this.questionId = questionId;
        this.text = text;
        this.isAnswer = isAnswer;
    }

    public String getQuestionId() {
        return this.questionId;
    }

    public String getText() {
        return this.text;
    }

    public boolean isCorrect() {
        return this.isAnswer;
    }
}
