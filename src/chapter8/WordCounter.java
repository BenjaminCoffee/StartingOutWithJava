package chapter8;

public class WordCounter {
    int words;

    public WordCounter(String string) {
        calculateNumberOfWords(string);
    }

    public void calculateNumberOfWords(String string) {
        String[] stringArray = string.split(" ");

        this.words = stringArray.length;
    }

    public int getWords() {
        return words;
    }
}
