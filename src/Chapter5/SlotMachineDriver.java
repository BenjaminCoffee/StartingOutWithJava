package Chapter5;

public class SlotMachineDriver {
    public static void main(String[] args) {
    SlotMachine machine0 = new SlotMachine();
        System.out.println(machine0.returnASymbol(machine0.returnRandomNumBetweenOneAndFive()));
    }
}
