import java.util.List;

public class Evaluation {
    private List<Question> questionList;
    private List<UserResponse> userResponseList;

    public Evaluation(List<Question> questionList, List<UserResponse> userResponseList) {
        this.questionList = questionList;
        this.userResponseList = userResponseList;
    }

    public Result run() {
        Result result = new Result();
        for (int i = 0; i < this.questionList.size(); i++) {
            Question question = this.questionList.get(i);
            UserResponse userResponse = this.userResponseList.get(i);
            if (userResponse.isCorrect()) {
                Level level = question.getLevel();
                result.addPoint(level.getPoint());
            }
        }
        return result;
    }
}
