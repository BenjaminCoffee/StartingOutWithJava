package chapter9;

public class Customer extends Person {
    String customerNum;
    private boolean mailingListPreference;

    public Customer() {

    }
    public Customer(String customerNum, boolean mailingListPreference) {
        this.customerNum = customerNum;
        this.mailingListPreference = mailingListPreference;
    }

    public String getCustomerNum() {
        return customerNum;
    }

    public void setCustomerNum(String customerNum) {
        this.customerNum = customerNum;
    }

    public boolean isMailingListPreference() {
        return mailingListPreference;
    }

    public void setMailingListPreference(boolean mailingListPreference) {
        this.mailingListPreference = mailingListPreference;
    }
}
