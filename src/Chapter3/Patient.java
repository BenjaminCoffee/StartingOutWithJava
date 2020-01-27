package Chapter3;

public class Patient {
    private String firstName; // Use more expressive variable name so when you come back to this clas after not seeing it for a long time it will be easier to relearn
    private String middleName;
    private String lastName;

    private String streetAddress;
    private String city;
    private String state;
    private int zipCode;
    private String phoneNumber;

    private String eContactNamePhone;

    public Patient(String fName,
                   String mName,
                   String lName,
                   String sAddress,
                   String city,
                   String state,
                   int zCode,
                   String pNumber,
                   String eContactNamePhone) {
        this.firstName = fName;
        this.middleName = mName;
        this.lastName = lName;
        this.streetAddress = sAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zCode;
        this.phoneNumber = pNumber;
        this.eContactNamePhone = eContactNamePhone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String geteContactNamePhone() {
        return eContactNamePhone;
    }

    public void seteContactNamePhone(String eContactNamePhone) {
        this.eContactNamePhone = eContactNamePhone;
    }

    @Override
    public String toString() {
        return " Patient:" + "\n"+
                "  First Name = "+ getFirstName()+ "\n"+
                "  Middle Name = "+ getMiddleName()+ "\n"+
                "  Last Name = "+ getLastName()+ "\n"+
                "  Street Address = "+ getStreetAddress()+ "\n"+
                "  City = "+ getCity()+ "\n"+
                "  State = "+ getState()+ "\n"+
                "  ZIP Code = "+ getZipCode()+ "\n"+
                "  Phone number = "+ getPhoneNumber()+ "\n"+
                "  Emergency Contact Name and Number = "+ geteContactNamePhone();
    }
}
