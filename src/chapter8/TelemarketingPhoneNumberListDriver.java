package chapter8;

import chapter2.AskUserForInput;

import java.io.IOException;

public class TelemarketingPhoneNumberListDriver {
    public static void main(String[] args) throws IOException {
        demonstration();
    }

    public static void demonstration() throws IOException {
        String userInput;
        TelemarketingPhoneNumberList telemarketingPhoneNumberList =
                new TelemarketingPhoneNumberList();

        userInput = getStringFromUser();

        telemarketingPhoneNumberList.storeResults(userInput);
        System.out.println(calculateStatementToUser(telemarketingPhoneNumberList));

    }

    public static String calculateStatementToUser(TelemarketingPhoneNumberList obj) {
        if (obj.getResults().equals("")) {
            return "No matching results";
        } else return obj.getResults();
    }

    public static String getStringFromUser() {
        return AskUserForInput.askUserForString(
                "Enter a name:"
        );
    }
}
