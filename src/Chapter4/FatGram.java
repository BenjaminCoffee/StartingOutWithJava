package chapter4;

import chapter2.AskUserForInput;

public class FatGram {
    int calories;
    int fatGrams;

    public FatGram() {
        inputCalories();
        inputFatGrams();
        System.out.println(displayResults());
    }



    public String displayResults() {
        return " The total calories = "+
                getCalories()+'\n'+
                " The grams of fat = "+
                getFatGrams()+'\n'+
                " The calories from fat = "+
                calculateCaloriesFromFat(getFatGrams())+'\n'+
                " The percentage of fat calories = %"+
                returnPercentageOfFatCalories()+'\n'+
                isItLowFat();
    }



    //region Methods for calculating the output
    public String isItLowFat() {
        if (returnPercentageOfFatCalories() < 30.00) {
            return " Your food item is considered "+"\""+"low in fat\".";
        }
        else return "";
    }
    public double returnPercentageOfFatCalories() {
        return (calculatePercentageOfCaloriesFromFat(
                calories,
                calculateCaloriesFromFat(fatGrams)))
                * 100.00;
    }
    public double calculatePercentageOfCaloriesFromFat(int totalCalories,
                                                       int caloriesFromFat) {
        double totalCalories0 = totalCalories;
        double caloriesFromFat0 = caloriesFromFat;

        return (caloriesFromFat0 / totalCalories0);
    }
    public int calculateCaloriesFromFat(int gramsOfFat) {
        final int CALORIE_PER_FAT_GRAM = 9;
        return (gramsOfFat * CALORIE_PER_FAT_GRAM);
    }
    //endregion



    //region Methods used for input to fatGrams field.
    public void inputFatGrams() {
        setFatGrams(askUserForFatGrams());
    }
    public int askUserForFatGrams() {
        int userAnswer;

        do {
            userAnswer =
            AskUserForInput.askUserForInteger(
                    "Please enter the number of fat grams:");
            if(userAnswer < 0){
                System.out.println("Your answer must be a positive number...");
                System.out.println("Please try again.");
            }
            if(!checkMinimumInputForFatGrams(userAnswer)) {
                System.out.println(
                        "The calories from fat may not exceed the total calories...");
                String userAnswerForReEntry =
                AskUserForInput.askForString(
                        "If you would like to re-enter the total calories, press 'R'." +
                                " If you would like to re-enter the fat grams, " +
                                "press any other key.");
                if(userAnswerForReEntry.equalsIgnoreCase("r")) {
                    inputCalories();
                }
            }
        }while( (userAnswer < 0) || (!checkMinimumInputForFatGrams(userAnswer)));
        return userAnswer;
    }
    public boolean checkMinimumInputForFatGrams(int fatGrams) {
        int caloriesFromFat = calculateCaloriesFromFat(fatGrams);

        if(getCalories() < caloriesFromFat)
            return false;
        else return true;
    }
    //endregion



    //region Methods for input to calorie field
    public void inputCalories() {
        setCalories(askUserForCalories());
    }
    public int askUserForCalories() {
        int userAnswer = 0;
        do {
            userAnswer =
            AskUserForInput.askUserForInteger("Please enter the number of calories:");
            if ( userAnswer < 0) {
                System.out.println("You may not enter a negative number...");
                System.out.println("Please try again:");
            }
        }while(userAnswer < 0);
        return userAnswer;
    }
    //endregion



    //region Accessors and mutators
    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getFatGrams() {
        return fatGrams;
    }

    public void setFatGrams(int fatGrams) {
        this.fatGrams = fatGrams;
    }
    //endregion
}
