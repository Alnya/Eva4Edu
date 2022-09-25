import java.util.List;
import java.util.Map;

public class Level {
    private double point;
    private Map<String, List<String>> tag;

    public Level(double point) {
        this.point = point;
    }

    public Level(double point, Map<String, List<String>> tag) {
        this.point = point;
        this.tag = tag;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    public void setTag(Map<String, List<String>> tag) {
        this.tag = tag;
    }

    public double getPoint() {
        return this.point;
    }

    public Map<String, List<String>> getTag() {
        return this.tag;
    }
}
