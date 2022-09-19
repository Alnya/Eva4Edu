import java.util.ArrayList;
import java.util.List;

public class MultiChoiceQuestion extends AbstractQuestion {
    private List<Choice> choices = new ArrayList<>();
    private String text;
    private Answer answer;

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

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    public List<Choice> getChoices() {
        return this.choices;
    }

    public String getText() {
        return this.text;
    }

    public Answer getAnswer() {
        return this.answer;
    }
}
