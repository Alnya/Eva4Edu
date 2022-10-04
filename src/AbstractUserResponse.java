public class AbstractUserResponse implements UserResponse {
    private String questionId;
    private boolean Correct;

    public AbstractUserResponse(String questionId, boolean Correct) {
        this.questionId = questionId;
        this.Correct = Correct;
    }

    @Override
    public String getQuestionId() {
        return this.questionId;
    }

    @Override
    public boolean isCorrect() {
        return this.Correct;
    }
}
