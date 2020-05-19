package chapter8;

import pl.allegro.finance.tradukisto.MoneyConverters;

import java.math.BigDecimal;

public class CheckWriter {

    public static final String[] ones = {
            "", "one", "two", "three", "four", "five",
            "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen",
            "sixteen", "seventeen", "eighteen", "nineteen" };

    public static final String[] tens = {
            "", // 0
            "", // 1
            "twenty", // 2
            "thirty", // 3
            "forty", // 4
            "fifty", // 5
            "sixty", // 6
            "seventy", // 7
            "eighty", // 8
            "ninety" // 9
    };

    private String name;
    private String date;
    private double amount;

    public CheckWriter(String name, String date, double amount) {
        this.name = name;
        this.date = date;
        this.amount = amount;
    }

    public String getAmount() {
        return getMoneyIntoWords(amount);
    }

    public double getNumberAmount() {
        return amount;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getMoneyIntoWords(double money) {
        String INVALID_INPUT_GIVEN = "Invalid input given";
        long dollars = (long) money;
        long cents = Math.round((money - dollars) * 100);
        if (money == 0D) {
            return "";
        }
        if (money < 0) {
            return INVALID_INPUT_GIVEN;
        }
        String dollarsPart = "";
        if (dollars > 0) {
            dollarsPart = convert(dollars)
                    + " dollar"
                    + (dollars == 1 ? "" : "s");
        }
        String centsPart = "";
        if (cents > 0) {
            if (dollarsPart.length() > 0) {
                centsPart = " and ";
            }
            centsPart += convert(cents) + " cent" + (cents == 1 ? "" : "s");
        }
        return dollarsPart + centsPart;
    }

    private String convert(final long n) {
        String INVALID_INPUT_GIVEN = "Invalid input given";

        if (n < 0) {
            return INVALID_INPUT_GIVEN;
        }
        if (n < 20) {
            return ones[(int) n];
        }
        if (n < 100) {
            return tens[(int) n / 10] + ((n % 10 != 0) ? " " : "") + ones[(int) n % 10];
        }
        if (n < 1000) {
            return ones[(int) n / 100] + " hundred" + ((n % 100 != 0) ? " " : "") + convert(n % 100);
        }
        if (n < 1_000_000) {
            return convert(n / 1000) + " thousand" + ((n % 1000 != 0) ? " " : "") + convert(n % 1000);
        }
        if (n < 1_000_000_000) {
            return convert(n / 1_000_000) + " million" + ((n % 1_000_000 != 0) ? " " : "") + convert(n % 1_000_000);
        }
        return convert(n / 1_000_000_000) + " billion" + ((n % 1_000_000_000 != 0) ? " " : "") + convert(n % 1_000_000_000);
    }

}
