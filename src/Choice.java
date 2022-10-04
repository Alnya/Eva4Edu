public class Choice implements UserResponse{
    private String questionId;
    private String text;

    private final boolean answer;

    public Choice(String questionId, String text, boolean answer) {
        this.questionId = questionId;
        this.text = text;
        this.answer = answer;
    }

    public String getQuestionId() {
        return this.questionId;
    }

    public String getText() {
        return this.text;
    }

    public boolean isCorrect() {
        return this.answer;
    }
}
