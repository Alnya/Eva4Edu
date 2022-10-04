import java.util.ArrayList;
import java.util.List;

public class MultiChoiceQuestion extends AbstractQuestion {
    private List<Choice> choices = new ArrayList<>();
    private String text;
    private MultiChoiceAnswer multiChoiceAnswer;

    public MultiChoiceQuestion(String id, String name) {
        super(id, name);
    }

    public void addChoice(Choice choice) {
        this.choices.add(choice);
    }

    public void setChoices(List<Choice> choices) {
        this.choices = choices;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setAnswer(MultiChoiceAnswer multiChoiceAnswer) {
        this.multiChoiceAnswer = multiChoiceAnswer;
    }

    public List<Choice> getChoices() {
        return this.choices;
    }

    public String getText() {
        return this.text;
    }

    public MultiChoiceAnswer getAnswer() {
        return this.multiChoiceAnswer;
    }
}
