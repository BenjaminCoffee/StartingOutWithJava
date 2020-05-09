package chapter8;

public class DisplayStringBackwards {

    private String string;

    public DisplayStringBackwards(String string) {
        displayStringBackwards(string);
    }

    public void displayStringBackwards(String string) {
        StringBuilder str = new StringBuilder();
        for (int i = string.length() - 1; i != -1; i--) {
            str.append(string.charAt(i));
        }
        this.string = str.toString();
    }

    public String getString() {
        return string;
    }
}
