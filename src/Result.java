import java.util.List;

public class Result {
    private double point = 0;
    private List<Boolean> correct;

    public Result() {

    }

    public void addPoint(double point) {
        this.point += point;
    }

    public double getPoint() {
        return this.point;
    }

    public void addCorrect(boolean isCorrect) {
        this.correct.add(isCorrect);
    }

    public List<Boolean> getCorrect() {
        return this.correct;
    }
}
