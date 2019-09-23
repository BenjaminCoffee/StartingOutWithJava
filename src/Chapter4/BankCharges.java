package Chapter4;

import Chapter2.AskUserForInput;

public class BankCharges {
    final private double monthlyCharge = 10;
    private int checksUsed = 0;

    
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
