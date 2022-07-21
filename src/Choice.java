public class Choice {
    private String groupId;
    private String text;

    public Choice() {
    }

    public Choice(String groupId, String text) {
        this.groupId = groupId;
        this.text = text;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public String getText() {
        return this.text;
    }
}
