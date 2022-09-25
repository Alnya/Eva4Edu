import java.util.List;

public class Result {
    private double point = 0;
    private List<Boolean> isCorrect;

    public Result() {

    }

    public void addPoint(double point) {
        this.point += point;
    }

    public double getPoint() {
        return this.point;
    }

    public void addCorrect(boolean isCorrect) {
        this.isCorrect.add(isCorrect);
    }

    public List<Boolean> getIsCorrect() {
        return this.isCorrect;
    }
}
