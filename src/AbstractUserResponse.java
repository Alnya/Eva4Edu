public class AbstractUserResponse implements UserResponse {
    private String questionId;
    private boolean isCorrect;

    public AbstractUserResponse(String questionId, boolean isCorrect) {
        this.questionId = questionId;
        this.isCorrect = isCorrect;
    }

    @Override
    public String getQuestionId() {
        return this.questionId;
    }

    @Override
    public boolean isCorrect() {
        return this.isCorrect;
    }
}
