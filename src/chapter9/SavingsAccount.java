package chapter9;

public class SavingsAccount extends BankAccount {
    private boolean active;

    public SavingsAccount(double balance, double annualInterestRate) {
        super(balance, annualInterestRate);
    }


    public void checkActive() {
        int minimumBalanceLimit = 25;
        if (getBalance() >= minimumBalanceLimit) {
            active = true;
        } else {
            active = false;
        }
    }

    public boolean isActive() {
        checkActive();
        return active;
    }

    public void withdraw(double withdrawal) {
        if (isActive() && (getBalance() - withdrawal) >= 0) {
            super.withdrawal(withdrawal);
        }
    }

    public void deposit(int theDeposit) {
        if (theDeposit > 0) {
            if (getBalance() + theDeposit >= 25) {
                super.deposit(theDeposit);
                active = true;
            } else {
                super.deposit(theDeposit);
            }
        }else {
            System.out.println("Deposit may not be less than zero.");
        }
    }

    @Override
    public void monthlyProcess() {
        int numOfDepositsThisMonth = getDepositsPerCurrentMonth();
        int extraCharges = 0;
        int chargePerWithdrawal = 1;
        int withdrawalNumberLimit = 4;

        if (numOfDepositsThisMonth > 4) {
            extraCharges = chargePerWithdrawal * (getNumberOfWithdrawals() - withdrawalNumberLimit);
            extraCharges = extraCharges * -1;
            super.setMonthlyServiceCharge(extraCharges);

            if (getBalance() < 25.00) {
                active = false;
            }

            super.monthlyProcess();
        }
    }
}
