import java.util.ArrayList;
import java.util.List;

public class MultiChoiceQuestion extends Question {
    private List<Choice> choices = new ArrayList<>();

    public MultiChoiceQuestion(String id) {
        super(id);
    }

    public MultiChoiceQuestion(String id, String name) {
        super(id, name);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setLevel(int level) {
        super.setLevel(level);
    }

    public void setChoices(List<Choice> choices) {
        this.choices = choices;
    }

    public List<Choice> getChoices() {
        return this.choices;
    }
}
