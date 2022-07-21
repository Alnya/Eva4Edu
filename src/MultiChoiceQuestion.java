import java.util.ArrayList;
import java.util.List;

public class MultiChoiceQuestion extends Question {
    private List<Choice> choices = new ArrayList<>();

    public MultiChoiceQuestion() {
    }

    public MultiChoiceQuestion(String name) {
        super.setName(name);
    }

    public void setChoices(List<Choice> choices) {
        this.choices = choices;
    }

    public List<Choice> getChoices() {
        return this.choices;
    }
}
