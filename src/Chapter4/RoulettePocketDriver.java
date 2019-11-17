package Chapter4;

public class RoulettePocketDriver {
    public static void main(String[] args) {
        // The RoulettePocket constructor accepts the integer returned from the
        // static method, 'inputNumber'. This method is also from the
        // RoulettePocket class.
        RoulettePocket game0 = new RoulettePocket(RoulettePocket.inputNumber());

        // getPocketColor accepts the integer returned from 'getNumber'.
        System.out.println(game0.getPocketColor(game0.getNumber()));
    }

}
