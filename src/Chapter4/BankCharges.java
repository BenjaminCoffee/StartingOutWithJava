package Chapter4;

import Chapter2.AskUserForInput;

import java.text.NumberFormat;
import java.util.Locale;

public class BankCharges {
    final private double monthlyCharge = 10;
    private int checksUsed;
    private double accountBalance;


    public String statement() {
        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
        return "Amount of checks used this month = "+
                getChecksUsed()+'\n'+
                "Monthly account holding fee = "+
                format.format(getMonthlyCharge())+'\n'+
                "Your current account balance = "+
                format.format(getAccountBalance())+'\n'+
                "Your total fees for the month = "+
                format.format(calculateFees());
    }

    //region Methods used to calculate the fees acquired from
    // both account balance and checks used.
    /**
     * Sums the doubles returned from calculateBalanceFee,
     * calculateCheckFee, and the monthlyCharge field;
     * @return A double, the sum of all fees acquired for the month.
     */
    public double calculateFees() {
        return (calculateCheckFees() + calculateBalanceFee() + getMonthlyCharge());
    }

    /**
     * Return the appropriate decimal based upon the accountBalance field.
     * @return A double, either 15.00 or 0.00.
     */
    public double calculateBalanceFee() {
        if (getAccountBalance() < 400.00)
            return 15.00;
        else return 0.00;
    }

    /**
     * Returns the appropriate decimal based upon the integer returned
     * from checksUsed field.
     * @return A double, checksUsed times the appropriate rate.
     */
    public double calculateCheckFees() {

        if ( (getChecksUsed() > 0) && (getChecksUsed() <= 19) )
            return ( getChecksUsed() * 0.10 );
        else if( (getChecksUsed() > 19) && (getChecksUsed() <= 39))
            return ( getChecksUsed() * 0.08 );
        else if( (getChecksUsed() > 39) && (getChecksUsed() <= 59))
            return ( getChecksUsed() * 0.06 );
        else return ( getChecksUsed() * 0.04 );
    }
    //endregion

    //region Methods used to input to the checksUsed field.
    /**
     * This method is essentially a wrapper to tie all the input methods together.
     */
    public void assignChecksUsed() {
        setChecksUsed(validateUserAnswer());
    }
    /**
     * This method ensures the users entry is valid by and returns
     * the user answer
     * @return A valid integer(greater than or equal to 0) from the user.
     */
    public int validateUserAnswer() {
        int userAnswer = 0;
        do {
            userAnswer = receiveAndReturnAnswer();
            if(userAnswer < 0) {
                System.out.println("The checks used field may not be negative.");
            }
        }while(userAnswer < 0);
        return userAnswer;
    }
    /**
     * This method asks the user to enter an integer ensures the entry is
     * indeed and integer. It does not, however, validate the integer entered.
     * @return Whatever integer was entered by the user.
     */
    public int receiveAndReturnAnswer() {
        return AskUserForInput.askUserForInteger(userPromptChecksUsed());
    }
    /**
     *
     * @return A string to be used as a prompt to the user.
     */
    public String userPromptChecksUsed() {
        return "How many checks have been used?";
    }
    //endregion

    //region Setters and getters, minus a setter for the monthlyCharge
    // variable which is a final variable
    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public double getMonthlyCharge() {
        return monthlyCharge;
    }

    public int getChecksUsed() {
        return checksUsed;
    }

    public void setChecksUsed(int checksUsed) {
        this.checksUsed = checksUsed;
    }
    //endregion
}
