package Task1;

import java.util.List;

public class Content {

    private String text;

    public Content(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Content{" +
                "text=" + text +
                '}';
    }
}
