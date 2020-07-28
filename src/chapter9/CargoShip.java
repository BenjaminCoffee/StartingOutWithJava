package chapter9;

public class CargoShip extends Ship {

    private int maxCargoInTons;

    public CargoShip(String name, String year) {
        super(name, year);
    }

    public int getMaxCargoInTons() {
        return maxCargoInTons;
    }

    public void setMaxCargoInTons(int maxCargoInTons) {
        this.maxCargoInTons = maxCargoInTons;
    }

    @Override
    public String toString() {
        return "CargoShip{" + "\n" +
                "maxCargoInTons=" + maxCargoInTons + "\n" +
                "name=" + super.getName() +
                '}';
    }
}
