package chapter9;

abstract class BankAccount {
    private double balance;
    private int depositsPerCurrentMonth;
    private int numberOfWithdrawals;
    private double annualInterestRate;
    private double monthlyServiceCharge;

    public BankAccount(double balance, double annualInterestRate) {

    }

    public void deposit(double deposit) {
        if (deposit > 0) {
            depositsPerCurrentMonth++;
            addToBalance(deposit);
        } else {
            System.out.println("deposit may not be less than zero.");
        }
    }

    public void withdrawal(double withdrawal) {
        if (withdrawal > 0) {
            numberOfWithdrawals++;
            withdrawal = withdrawal * -1;
            addToBalance(withdrawal);
        } else {
            System.out.println("withdrawal may not be less than zero.");
        }
    }

    public void addToBalance(double sum) {
        balance = balance + sum;
    }

    private double calcInterest() {
        int months = 12;
        double monthlyInterestRate = annualInterestRate / (double)months;
        double monthlyInterest = monthlyInterestRate * balance;

        return monthlyInterest;
    }

    public void addMonthlyInterest() {
        balance = balance + calcInterest();
    }

    public void monthlyProcess() {
        balance = balance + monthlyServiceCharge;

        addMonthlyInterest();

        depositsPerCurrentMonth = 0;
        numberOfWithdrawals = 0;
        monthlyServiceCharge = 0;
    }

    public double getBalance() {
        return balance;
    }

    public int getDepositsPerCurrentMonth() {
        return depositsPerCurrentMonth;
    }

    public int getNumberOfWithdrawals() {
        return numberOfWithdrawals;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setDepositsPerCurrentMonth(int depositsPerCurrentMonth) {
        this.depositsPerCurrentMonth = depositsPerCurrentMonth;
    }

    public void setNumberOfWithdrawals(int numberOfWithdrawals) {
        this.numberOfWithdrawals = numberOfWithdrawals;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setMonthlyServiceCharge(double monthlyServiceCharge) {
        this.monthlyServiceCharge = monthlyServiceCharge;
    }
}
