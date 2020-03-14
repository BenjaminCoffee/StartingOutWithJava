package chapter3;

import chapter2.AskUserForInput;

public class Widget {
    private final int WIDGETS_PER_DAY = 160;

    // The number of units ordered
    // The units to be produced
    private int unitsOrdered;

    public Widget() {
        unitsOrdered = 0;
        inputOrder();
    }

    public void displayDays() {
        System.out.println("This order will take "+
                daysToProduceOrder()+
                " days to process. Thank you for your patience.");
    }

    public int daysToProduceOrder() {
        int days = (int)Math.ceil(calculateDays());
        return days;
    }

    public double calculateDays() {
        double units = unitsOrdered;

        return (units/WIDGETS_PER_DAY);
    }

    public void inputOrder() {
        unitsOrdered =
                AskUserForInput.askUserForInteger(
                        "How many widgets do you need?"
                );
    }
    public int getUnitsOrdered() {
        return unitsOrdered;
    }

    public void setUnitsOrdered(int unitsOrdered) {
        this.unitsOrdered = unitsOrdered;
    }
}
