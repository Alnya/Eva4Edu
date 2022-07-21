import java.util.ArrayList;
import java.util.List;

public class MultiChoiceQuestion extends Question {
    private List<String> choices = new ArrayList<>();

    public MultiChoiceQuestion() {
    }

    public MultiChoiceQuestion(String name) {
        super.setName(name);
    }

    public void setChoices(List<String> choices) {
        this.choices = choices;
    }

    public List<String> getChoices() {
        return this.choices;
    }
}
