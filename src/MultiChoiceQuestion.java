import java.util.ArrayList;
import java.util.List;

public class MultiChoiceQuestion extends Question {
    private List<Choice> choices = new ArrayList<>();
    private String text;
    private Answer answer;

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

    public void addChoices(Choice choice) {
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

    @Override
    public String getId() {
        return super.getId();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getLevel() {
        return super.getLevel();
    }

    public List<Choice> getChoices() {
        return this.choices;
    }

    public String getText() {
        return this.text;
    }
}
