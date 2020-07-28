package chapter9;


public class WorkingWithShips {
    public static void main(String[] args) {
        Ship[] shipArray = new Ship[10];
        int shipNumber = 1;
        for (int i = 0; i < shipArray.length; i++) {
            shipArray[i] = returnShipSpecifiedShip(shipNumber);
            System.out.println(shipArray[i].toString());
            System.out.println();

            if (shipNumber == 2) {
                shipNumber = 1;
            } else shipNumber++;
        }

    }

    public static Ship returnShipSpecifiedShip(int specifiedShip) {
        switch (specifiedShip) {
            case 1:
                return new CargoShip("Sea Ward", "1987");
            case 2 :
                return new CruiseShip("Pack Rat", "2002");
        }
        return new Ship(null, null);
    }
}
