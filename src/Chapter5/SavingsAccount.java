package Chapter5;

import Chapter2.AskUserForInput;

public class SavingsAccount {
    private double balance;
    private double annualInterestRate;

    public SavingsAccount(double balance) {
        this.balance = balance;
    }

    public static void loopTheMonths() {
        // set the balance for the newly created object.
        SavingsAccount account0 = new SavingsAccount(100.00);

        account0.inputAnnualInterestRate();
        int months = account0.askForMonthsPassed();

        account0.calculateBalanceAfterMonths(months, account0);
        System.out.println(account0.getBalance());
    }

    public SavingsAccount calculateBalanceAfterMonths(int months, SavingsAccount account) {
        double sumOfDeposits = 0;
        double sumOfWithDrawals = 0;
        for (int i = 1; i <= months; i++) {
            System.out.println("For month "+ months+ ":");
            double deposit = SavingsAccount.AskForDepositStatic();
            account.setBalance(account.getBalance() + deposit);
            sumOfDeposits = sumOfDeposits + deposit;

            double withdrawal = SavingsAccount.AskForWithdrawalStatic();
            account.setBalance(account.getBalance() - withdrawal);
            sumOfWithDrawals = sumOfWithDrawals + withdrawal;

            account.addMonthlyInterest();

        }

        System.out.println("Total amount of deposits = " + sumOfDeposits);
        System.out.println("Total amount of withdrawals = " + sumOfWithDrawals);
        return account;
    }
    public int askForMonthsPassed() {
        return AskUserForInput.askUserForPositiveInteger(
                "How many months have passed since the " +
                        "initialization of the account: "
        );
    }
    public void calculateStatement() {
        StringBuilder statement = new StringBuilder();
    }

    public static double AskForWithdrawalStatic() {
        return AskUserForInput.askUserForPositiveDouble(
                "Withdrawal amount:"
        );
    }

    public static double AskForDepositStatic() {
        return  AskUserForInput.askUserForPositiveDouble(
                "Deposit amount:"
        );
    }
    public void askForWithdrawal() {
        setBalance(getBalance() -
                AskUserForInput.askUserForPositiveDouble(
                        "Withdrawal amount:"
                ));
    }
    public void askForDeposit() {
        setBalance(getBalance() +
                AskUserForInput.askUserForPositiveDouble(
                        "Deposit amount:"
                ));
    }
    public void inputAnnualInterestRate() {
        setAnnualInterestRate(receiveAndReturnAnnualInterestRate());
    }
    public double receiveAndReturnAnnualInterestRate() {
        return AskUserForInput.askUserForPositiveDouble(
                "Please enter the annual interest rate."
        );
    }
    public void addMonthlyInterest() {
        setBalance(getBalance() + (getBalance() * (getAnnualInterestRate() / 12.00) ) );
    }
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }
    public void withdraw(double amount) {
        setBalance(getBalance() - amount);
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
}
