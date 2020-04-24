package chapter7;

public class PhoneBookEntry {
    private  String name;
    private int phoneNum;

    public PhoneBookEntry(String name, int phoneNum) {
        this.name = name;
        this.phoneNum = phoneNum;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String toString() {
        String str;
        str = "name = " + this.name
                + "\n" +
                "number = " + this.phoneNum
                + "\n";
        return str;
    }
}
