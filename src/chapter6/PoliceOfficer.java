package chapter6;

public class PoliceOfficer {
    private String name, badgeNum;
    private ParkedCar car;
    private ParkingMeter meter;

    public PoliceOfficer(String name, String badgeNum) {
        this.name = name;
        this.badgeNum = badgeNum;
    }

    // If a ticket needs to be issued, the car and meter fields
    // will have been assigned the appropriate ParkedCar and
    // ParkingMeter objects. We will now pass those objects(car and meter)
    // in our PoliceOfficer fields to a newly created ParkingTicket object.
    public void createTicket() {
        ParkingTicket ticket =
                new ParkingTicket(
                car,
                meter,
                name,
                badgeNum
        );
        System.out.println(ticket.createTicketStatement());
    }
    public void inspectMeter(ParkedCar car, ParkingMeter meter) {
        if (isCarIllegallyParked(car, meter)) {
            this.car = car;
            this.meter = meter;
            createTicket();
        }
        else {
            System.out.println("The car is not illegally parked.");
            System.exit(0);
        }
    }
    public boolean isCarIllegallyParked(ParkedCar car, ParkingMeter meter) {
        if (car.getTotalMinutesParked() > meter.getMinutesPurchased()) {
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBadgNum() {
        return badgeNum;
    }

    public void setBadgNum(String badgNum) {
        this.badgeNum = badgNum;
    }

    public ParkedCar getCar() {
        return car;
    }

    public void setCar(ParkedCar car) {
        this.car = car;
    }

    public ParkingMeter getMeter() {
        return meter;
    }

    public void setMeter(ParkingMeter meter) {
        this.meter = meter;
    }
}
