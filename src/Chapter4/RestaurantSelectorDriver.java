package Chapter4;

public class RestaurantSelectorDriver {
    public static void main(String[] args) {
        RestaurantSelector outing0 = new RestaurantSelector();
        outing0.inputFieldValues();

        outing0.receiveAndPrintBoolArray(outing0.calculateBoolArray());

    }
}
