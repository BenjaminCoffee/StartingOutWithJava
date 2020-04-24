package chapter7;

import java.util.ArrayList;

public class PhoneBookEntryDriver {
    public static void main(String[] args) {
        demonstration();
    }

    public static void demonstration() {
        PhoneBookEntry person0 = new PhoneBookEntry("Kenneth", 1800123456);
        PhoneBookEntry person1 = new PhoneBookEntry("Jimbo", 1800654321);
        PhoneBookEntry person2 = new PhoneBookEntry("Kenneth", 1800123456);
        PhoneBookEntry person3 = new PhoneBookEntry("Bobby", 1800123457);
        PhoneBookEntry person4 = new PhoneBookEntry("Kenneth", 1800123458);

        ArrayList<PhoneBookEntry> list0 = new ArrayList<>();
        list0.add(person0);
        list0.add(person1);
        list0.add(person2);
        list0.add(person3);
        list0.add(person4);

        for (int i = 0; i < list0.size(); i++) {
            System.out.println(list0.get(i));
        }

    }
}
