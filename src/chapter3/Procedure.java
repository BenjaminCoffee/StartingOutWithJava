package chapter3;

public class Procedure {
    private String name;
    private String date;
    private String practitioner;
    private double charge;

    public Procedure(String name,
                     String date,
                     String practitioner,
                     double charge) {
        this.name = name;
        this.date = date;
        this.practitioner = practitioner;
        this.charge = charge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPractitioner() {
        return practitioner;
    }

    public void setPractitioner(String practitioner) {
        this.practitioner = practitioner;
    }

    public double getCharge() {
        return charge;
    }

    public void setCharge(double charges) {
        this.charge = charges;
    }
    public String toString() {
        return " Procedure:"+ "\n"+
                "  name = "+ getName()+ "\n"+
                "  date = "+ getDate()+ "\n"+
                "  Practitioner = "+ getPractitioner()+ "\n"+
                "  charge = "+ getCharge();
    }
}
