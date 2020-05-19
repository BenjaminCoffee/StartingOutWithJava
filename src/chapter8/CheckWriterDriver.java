package chapter8;

public class CheckWriterDriver {
    public static void main(String[] args) {
        CheckWriter checkWriter = new CheckWriter("Dilbert H Goober", "date", 7321.98);
        System.out.println(formatCheckOutput(checkWriter));

    }

    public static String formatCheckOutput(CheckWriter checkWriter) {
        StringBuilder str = new StringBuilder();

        int fieldSize = 80;
        String dateFormat = "%" + fieldSize + "s";

        String payToOrderOf = "Pay to the order of: " + checkWriter.getName();
        int formatWidthForNumber = fieldSize - payToOrderOf.length();
        String formatForNumber = "%" + formatWidthForNumber + "s";


        str.append(String.format(dateFormat, checkWriter.getDate()) + "\n");
        str.append(String.format("%s","Pay to the order of: " + checkWriter.getName()));
        str.append(String.format(formatForNumber, "$" + checkWriter.getNumberAmount()) + "\n");
        str.append(String.format(checkWriter.getAmount()));
        return str.toString();
    }
}
