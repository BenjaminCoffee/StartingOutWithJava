package chapter5;

import chapter2.AskUserForInput;

public class BarChart {
    private int sales;


    public String printRowOfStarsFromSales(int storeNum) {
        StringBuilder str = new StringBuilder();
        str.append("Store " + storeNum+ ": ");
        while (getSales() != 0) {
            str.append("*");
            setSales(getSales() - 100);
        }

        str.append("\n");
        return str.toString();
    }
    public String calculateStatement() {
        StringBuilder str = new StringBuilder();
        for (int i = 1; i <= 5; i++) {
            setUserInputForSales(i);
            str.append(printRowOfStarsFromSales(i));
        }
        return str.toString();
    }
    public void setUserInputForSales(int anInt) {
        setSales(askForSales(anInt));
    }
    public int askForSales(int anInt) {
        int x = AskUserForInput.askUserForPositiveInteger(
                "Enter the sales for store, " + anInt+": "
        );
        // return the answer rounded to the nearest hundred.
        return (((x + 5)/100) * 100);

    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }
}
