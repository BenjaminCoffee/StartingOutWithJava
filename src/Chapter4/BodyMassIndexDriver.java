package Chapter4;

public class BodyMassIndexDriver {
    public static void main(String[] args) {
        bodyMassIndexDemo();
    }

    public static void bodyMassIndexDemo() {
        BodyMassIndex person0 = new BodyMassIndex();
        // set height to 5'5
        person0.setHeight(65);

        // set weight to 150lbs
        person0.setWeight(150);
        System.out.println(person0.statement());
    }
}
