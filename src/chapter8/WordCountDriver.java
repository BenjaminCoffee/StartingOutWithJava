package chapter8;

public class WordCountDriver {
    public static void main(String[] args) {
        demonstration();
    }

    public static void demonstration() {
        String string = "Four score and seven years ago";
        WordCounter wordCounter =
                new WordCounter(string);
        System.out.println(wordCounter.getWords());
    }
}
