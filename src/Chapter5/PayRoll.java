package Chapter5;

import Chapter2.AskUserForInput;

import java.util.Scanner;

public class PayRoll {
    private String idNum;
    private double grossPay;
    private double stateTax;
    private double fedTax;
    private double ficaWithholdings;

    static void testingCreateAndReturnMethod() {
        PayRoll report0;
        do {
            // This inner loop validates the input
            // if the sum of the withholdings are larger than
            // the gross pay, the user is prompted to re-enter.
            do {
                report0 = createInitializeAndReturnPayRollObject();
                if(validateFieldData(report0) == false) {
                    System.out.println("There was an error with the input\n" +
                            " Please try again...");
                }
            }while(validateFieldData(report0) == false);

            if(report0.getIdNum().equalsIgnoreCase("0")) {
                System.out.println(
                        " You have chosen to terminate the program" +
                        " by entering '0' for the employee ID number."
                );
                break;
            }
            System.out.println(generateReport(report0));
        } while (!report0.getIdNum().equalsIgnoreCase("0"));

        System.out.println("  Press enter to continue: ");
        Scanner in = new Scanner(System.in);
        in.nextLine();
    }

    static PayRoll createInitializeAndReturnPayRollObject() {
        PayRoll aPayRollObject = new PayRoll();

        // initialize the newly created object.
        aPayRollObject.setIdNum(askForIdNum());
        if(aPayRollObject.getIdNum().equalsIgnoreCase("0")) {
            return aPayRollObject;
        }
        aPayRollObject.setGrossPay(askForGrossPay());
        aPayRollObject.setStateTax(askForStateTax());
        aPayRollObject.setFedTax(askForFedTax());
        aPayRollObject.setFicaWithholdings(askForFicaWitholdings());

        return aPayRollObject;
    }

    static String generateReport(PayRoll obj) {
        double grossPay = obj.getGrossPay();
        double stateTax = (grossPay * obj.getStateTax());
        double fedTax = (grossPay * obj.getFedTax());
        double ficaWithHoldings = (grossPay * obj.getFicaWithholdings());

        return " For employee, "+ obj.getIdNum()+ ":"+
                " The gross pay = "+ grossPay+ "\n" +
                " The State Tax withheld = "+ stateTax+ "\n" +
                " The Federal Tax withheld =  "+ fedTax+ "\n" +
                " The FICA Witholdings = "+ ficaWithHoldings+ "\n" +
                " Total pay after taxes = "+
                (grossPay - stateTax - fedTax - ficaWithHoldings);
    }

    static boolean validateFieldData(PayRoll obj) {
        if (obj.getGrossPay() <
                (obj.getStateTax() * obj.getGrossPay() +
                        obj.getFedTax() * obj.getGrossPay() +
                        obj.getFicaWithholdings() * obj.getGrossPay()
                )
        ) {
            return false;
        }
        return true;
    }

    static public double askForFicaWitholdings() {
        return AskUserForInput.askUserForPositiveDouble(
                "Please enter the FICA withholdings" +
                        " as a positive decimal representing" +
                        " a percentage."
        );
    }
    static public double askForFedTax() {
        return AskUserForInput.askUserForPositiveDouble(
                "Please enter the federal tax" +
                        " as a positive decimal representing" +
                        " a percentage."
        );
    }
    static public double askForStateTax() {
        return AskUserForInput.askUserForPositiveDouble(
                "Please enter the state tax" +
                        " as a positive decimal representing" +
                        " a percentage."
        );
    }
    static public double askForGrossPay() {
        return AskUserForInput.askUserForPositiveDouble(
                "Enter the gross pay:"
        );
    }
    static public String askForIdNum() {
        return AskUserForInput.askUserForString(
                "Please enter the employee ID number:"
        );
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public double getGrossPay() {
        return grossPay;
    }

    public void setGrossPay(double grossPay) {
        this.grossPay = grossPay;
    }

    public double getStateTax() {
        return stateTax;
    }

    public void setStateTax(double stateTax) {
        this.stateTax = stateTax;
    }

    public double getFedTax() {
        return fedTax;
    }

    public void setFedTax(double fedTax) {
        this.fedTax = fedTax;
    }

    public double getFicaWithholdings() {
        return ficaWithholdings;
    }

    public void setFicaWithholdings(double ficaWithholdings) {
        this.ficaWithholdings = ficaWithholdings;
    }
}
