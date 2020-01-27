package Chapter4;

import Chapter2.AskUserForInput;

public class FreezingAndBoilingPoints {
    private int temperature;

    public void wrapper() {
        askUserForTemperature();
        System.out.println(displaySubstances());
    }

    public String displaySubstances() {
        String conclusion = " Substances that will freeze at your temperature: \n";

        if (isEthylFreezing(getTemperature())== true)
            conclusion = conclusion + " Ethyl Aclohol \n";

        if (isOxygenFreezing(getTemperature()) == true)
            conclusion = conclusion + " Oxygen \n";

        if (isWaterFreezing(getTemperature()) == true)
            conclusion = conclusion + " Water \n";

        conclusion = conclusion + "\n";
        conclusion = conclusion + " Substances that will boil at your temperature: \n";

        if (isEthylBoiling(getTemperature()) == true)
            conclusion = conclusion + " Ethyl Alcohol \n";

        if(isOxygenBoiling(getTemperature()) == true)
            conclusion = conclusion + " Oxygen \n";

        if(isWaterBoiling(getTemperature()) == true)
            conclusion = conclusion + " Water";

        return conclusion;
    }
    public void askUserForTemperature() {
        temperature = AskUserForInput.askUserForInteger(
                "Please enter a temperature."
        );
    }
    public boolean isWaterBoiling(int temp) {
        if(temp >= 212) {
            return true;
        }
        return false;
    }
    public boolean isWaterFreezing(int temp) {
        if(temp <= 32) {
            return true;
        }
        return false;
    }
    public boolean isOxygenBoiling(int temp) {
        if(temp >= -306) {
            return true;
        }
        return false;
    }
    public boolean isOxygenFreezing(int temp) {
        if(temp <= -362) {
            return true;
        }
        return false;
    }
    public boolean isEthylBoiling(int temp) {
        if(temp >= 172) {
            return true;
        }
        return false;
    }
    public boolean isEthylFreezing(int temp) {
        if(temp <= -173) {
            return true;
        }
        return false;
    }
    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
