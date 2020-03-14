package chapter3;

public class Patient {
    private String fName;
    private String mName;
    private String lName;

    private String sAddress;
    private String city;
    private String state;
    private int zCode;
    private String pNumber;

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
        this.fName = fName;
        this.mName = mName;
        this.lName = lName;
        this.sAddress = sAddress;
        this.city = city;
        this.state = state;
        this.zCode = zCode;
        this.pNumber = pNumber;
        this.eContactNamePhone = eContactNamePhone;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getsAddress() {
        return sAddress;
    }

    public void setsAddress(String sAddress) {
        this.sAddress = sAddress;
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

    public int getzCode() {
        return zCode;
    }

    public void setzCode(int zCode) {
        this.zCode = zCode;
    }

    public String getpNumber() {
        return pNumber;
    }

    public void setpNumber(String pNumber) {
        this.pNumber = pNumber;
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
                "  First Name = "+ getfName()+ "\n"+
                "  Middle Name = "+ getmName()+ "\n"+
                "  Last Name = "+ getlName()+ "\n"+
                "  Street Address = "+ getsAddress()+ "\n"+
                "  City = "+ getCity()+ "\n"+
                "  State = "+ getState()+ "\n"+
                "  ZIP Code = "+ getzCode()+ "\n"+
                "  Phone number = "+ getpNumber()+ "\n"+
                "  Emergency Contact Name and Number = "+ geteContactNamePhone();
    }
}
