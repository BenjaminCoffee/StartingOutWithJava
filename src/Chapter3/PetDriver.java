package Chapter3;

import Chapter2.AskUserForInput;

public class PetDriver {
    public static void main(String[] args) {
        petDemo();
    }

    public static void petDemo() {
        Pet pet0 = new Pet();

        String confirmation;

        do {
            // Ask user for the pet's name.
            // Input the answer to the name field.
            pet0.setName(
                    AskUserForInput.askUserForString(
                            "Enter your pet's name."
                    )
            );

            // Ask the user for the pet's type
            // Input the answer in the type field.
            pet0.setType(
                    AskUserForInput.askUserForString(
                            "What type of animal is " +
                                    pet0.getName() +
                                    "?"
                    )
            );

            // Ask the user for the pet's age.
            // Input the answer in the age field.
            pet0.setAge(
                    AskUserForInput.askUserForInteger(
                            "How old is " +
                                    pet0.getName() +
                                    "?"
                    )
            );

            // Display the input back to the user
            // Ask the user for confirmation of object information.
            confirmation = AskUserForInput.confirmationForString(
                    pet0.getName() +
                            " is a " +
                            pet0.getAge() +
                            " year old " +
                            pet0.getType()
            );
        }while(confirmation.equalsIgnoreCase("n"));
    }
}
