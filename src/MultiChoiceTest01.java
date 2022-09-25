import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MultiChoiceTest01 {
    public static void main(String[] args) {
        Map<String, Object> map = getData();
        println("Get user");
        User user = (User) map.get("user");
        println("userId:" + user.getId());
        println("userName:" + user.getName());
        println("\nGet multiChoiceQuestion");
        MultiChoiceQuestion mQuestion =
            (MultiChoiceQuestion) map.get("multiChoiceQuestion");
        println("questionId:" + mQuestion.getId());
        println("questionName:" + mQuestion.getName());
        println("questionLevel:" + mQuestion.getLevel().getPoint());
        println("questionText:" + mQuestion.getText());
        List<Choice> choices = mQuestion.getChoices();
        for (Choice choice : choices) {
            println("choice:" + choice.getText() +
                "  isAnswer?:" + choice.isAnswer());
        }
        Answer answer = mQuestion.getAnswer();
        println("answer:" + answer.getText());
    }

    public static Map<String, Object> getData() {
        Map<String, Object> map = new HashMap<>();
        User user = new User("19AJ000", "alnya");
        map.put("user", user);

        MultiChoiceQuestion mQuestion = new MultiChoiceQuestion("q01", "q01");
        Level level = new Level(3.0);
        mQuestion.setLevel(level);
        mQuestion.setText(
            "apple,banana,chocolateの三つの選択肢があります。\n" +
                "appleを選んでください。\n");
        Choice choice1 = new Choice("q01", "apple", true);
        Choice choice2 = new Choice("q01", "banana", false);
        Choice choice3 = new Choice("q01", "chocolate", false);
        mQuestion.addChoice(choice1);
        mQuestion.addChoice(choice2);
        mQuestion.addChoice(choice3);
        Answer answer = new Answer("q01", "答えはappleです。\n");
        mQuestion.setAnswer(answer);
        map.put("multiChoiceQuestion", mQuestion);
        return map;
    }

    public static void println(String str) {
        System.out.println(str);
    }
}
