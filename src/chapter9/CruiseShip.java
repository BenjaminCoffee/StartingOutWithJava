package chapter9;

public class CruiseShip extends Ship {
    int maxPassengers;

    public static void main(String[] args) {
        System.out.println(new CruiseShip("goober", "1966").toString());
    }

    public CruiseShip(String name, String year) {
        super(name, year);
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    @Override
    public String toString() {
        return "CruiseShip{" + " \n" +
                "maxPassengers=" + maxPassengers + "\n" +
                "name=" + super.getName() +
                "} " + "\n";
    }
}
