package Chapter4;

public class RomanNumeralsDriver {
    public static void main(String[] args) {
        romanNumeralsDemo();
    }
    private static void romanNumeralsDemo() {
        RomanNumerals romanNumerals0 = new RomanNumerals();
        System.out.print(romanNumerals0.getNumber()+
                " converted to roman numerals = '"+
                romanNumerals0.returnRoman()+ "'.");
    }
}
