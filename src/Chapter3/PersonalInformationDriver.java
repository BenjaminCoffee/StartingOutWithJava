package chapter3;

public class PersonalInformationDriver {
    public static void main(String [] args) {

        createThreePeople();
    }

    public static void createThreePeople() {
        PersonalInformation person0 = new PersonalInformation();
        PersonalInformation person1 = new PersonalInformation();
        PersonalInformation person2 = new PersonalInformation();

        setPersonalInformationFields(
                person0,
                "Benjamin",
                "12345 Goober Dr.",
                29,
                2141231234
        );
        setPersonalInformationFields(
                person1,
                "Gary",
                "54321 Goober Dr.",
                28,
                2141234321
        );
        setPersonalInformationFields(
                person2,
                "Chip",
                "98765 Goober Dr.",
                29,
                2141231254
        );

        System.out.println(person0.toString());


    }

    public static void setPersonalInformationFields(
            PersonalInformation obj,
            String name,
            String address,
            int age,
            int phoneNumber) {

        obj.setName(name);
        obj.setAddress(address);
        obj.setAge(age);
        obj.setPhoneNumber(phoneNumber);
    }

}


