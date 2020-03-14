package chapter4;

import chapter2.AskUserForInput;

public class TimeCalculator {
    int seconds;

    public TimeCalculator() {
        inputUserData();
    }
    public String displayTime() {
        int localSeconds = getSeconds();

        String conversions = getSeconds()+ " Seconds is equal to: \n";

        // Append the String
        conversions = conversions+ " "+convertToDays(localSeconds)+ " days \n";

        // Update localSeconds to hold the remaining seconds after
        // the equivalent days are subtracted.
        localSeconds = remainingSecondsAfterDays(localSeconds);

        // Append the String
        conversions = conversions+" "+convertToHours(localSeconds) +" hours \n";

        // localSeconds now holds the remaining seconds after
        // the equivalent hours have been subtracted from the total.
        localSeconds = remainingSecondsAfterDaysHours(localSeconds);

        // Append the String
        conversions = conversions+" "+ convertToMinutes(localSeconds)+ " minutes \n";

        // localSeconds now holds the remaining seconds after
        // the equivalent hours and minutes have been subtracted
        // from the total.
        localSeconds = remainingSecondsAfterDaysHoursMinutes(localSeconds);

        // Append the String
        conversions = conversions+ " "+ localSeconds+ " seconds";

        return conversions;
    }
    public int remainingSecondsAfterDaysHoursMinutes(int anInt) {
        return ( anInt % 60);
    }
    public int remainingSecondsAfterDaysHours(int anInt) {
        return ( anInt % 3600 );
    }
    public int remainingSecondsAfterDays(int anInt) {
        return ( anInt % 86400);
    }
    public int convertToMinutes(int seconds) {
        seconds = ( seconds / 60 );
        return seconds;
    }
    public int convertToHours(int seconds) {
        seconds = ( seconds / 3600 );
        return seconds;
    }
    public int convertToDays(int seconds) {
        seconds = ( seconds / 86400 );
        return seconds;
    }
    public void inputUserData() {
        setSeconds(receiveUserInput());
    }
    public int receiveUserInput() {
        return AskUserForInput.askUserForInteger(userPrompt());
    }
    public String userPrompt() {
        return "Please enter the amount of minutes.";
    }
    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int minutes) {
        this.seconds = minutes;
    }
}
