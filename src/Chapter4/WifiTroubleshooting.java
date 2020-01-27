package Chapter4;

import Chapter2.AskUserForInput;

import java.util.Scanner;

public class WifiTroubleshooting {

    public void beginTroubleshooting() {
        System.out.println("Press enter to begin troubleshooting the router...");
        allowUserToPressEnter();

        System.out.println(rebootComputerMsg());
        if (isTheIssueFixed()) {
            userTermination();
            return;
        }

        System.out.println(rebootRouterMsg());
        if (isTheIssueFixed()) {
            userTermination();
            return;
        }
        System.out.println(checkTheCablesMsg());
        if (isTheIssueFixed()) {
            userTermination();
            return;
        }

        System.out.println(moveRouterMsg());
        if (isTheIssueFixed()) {
            userTermination();
            return;
        }

        System.out.println(routerIsBrokenMsg());
    }

    //region These methods allow for user interaction
    public void userTermination() {
        System.out.println(terminationMsg());
        createScannerForUserInteraction();
    }

    public void allowUserToPressEnter() {
        createScannerForUserInteraction();
    }

    public void createScannerForUserInteraction() {
        Scanner in = new Scanner(System.in);
        in.nextLine();
    }
    //endregion

    //region User messages
    public String terminationMsg() {
        return "Great! Press enter to exit the program.";
    }

    public String routerIsBrokenMsg() {
        return "Get a new router.";
    }

    public String moveRouterMsg() {
        return "Move the router to a new location and try to connect.";
    }

    public String checkTheCablesMsg() {
        return "Make sure the cables between the router & modem" +
                " are plugged in firmly";
    }

    public String rebootRouterMsg() {
        return "Reboot the router and try to connect.";
    }

    public String rebootComputerMsg() {
        return "Reboot the computer and try to connect.";
    }
    //endregion

    //region Receiving and handling input from the user.
    public boolean isTheIssueFixed() {
        return receiveYesOrNo(returnYesOrNo());
    }

    public boolean receiveYesOrNo(String yesOrNo) {
        return yesOrNo.equalsIgnoreCase("yes");
    }

    public String returnYesOrNo() {
        return askYesOrNo();
    }

    public String askYesOrNo() {
        String response;
        do {
            response = AskUserForInput.askForString("Did that fix the connection?");
            if (!response.equalsIgnoreCase("yes") &&
                    !response.equalsIgnoreCase("no")) {
                System.out.println("You must answer 'yes' or 'no'...");
            }
        } while (!response.equalsIgnoreCase("yes") &&
                !response.equalsIgnoreCase("no"));

        return response;
    }
    //endregion
}
