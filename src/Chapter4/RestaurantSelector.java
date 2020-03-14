package chapter4;

import chapter2.AskUserForInput;

public class RestaurantSelector {
    private boolean vegetarian;
    private boolean vegan;
    private boolean glutenFree;

    public void receiveAndPrintBoolArray(boolean[] restaurants) {

        System.out.println("You following restaurants may accommodate your party:");
        int i;
        for(i=0; i<restaurants.length; i++) {
            if (restaurants[i] == true) {
                if(i == 0) {
                    System.out.println(" "+returnBurgers());
                }
                if(i == 1) {
                    System.out.println(" "+returnPizza());
                }
                if(i == 2) {
                    System.out.println(" "+returnCafe());
                }
                if(i == 3) {
                    System.out.println(" "+returnItalian());
                }
                if(i == 4) {
                    System.out.println(" "+returnKitchen());
                }
            }
        }
    }

    public boolean[] calculateBoolArray() {
        boolean burgers = true;
        boolean pizza = true;
        boolean cafe = true;
        boolean italian = true;
        boolean kitchen = true;
        int sum = 0;

        if (isVegetarian()) {
            burgers = false;
        }
        if (isVegan()) {
            burgers = false;
            pizza = false;
            italian = false;
        }
        if(isGlutenFree()) {
            burgers = false;
            italian = false;
        }

        boolean[] arr = {burgers, pizza, cafe, italian, kitchen};
        return arr;
    }
    /*
    public String configureStatement() {
        String statement = "";
        if(isVegetarian() && isVegan() && isGlutenFree()) {
            statement = " "+returnCafe()+ "\n"+
                    returnKitchen();
        }
        else if(isVegetarian() && !isVegan() && !isGlutenFree()) {

        }
    }

     */
    public void inputFieldValues() {
        setVegetarian(askForDietaryRestriction("Is anybody vegetarian?"));
        setVegan(askForDietaryRestriction("Is anybody vegan?"));
        setGlutenFree(askForDietaryRestriction("Is anybody gluten free?"));
    }
    public String returnKitchen() {
        return "The Chefs Kitchen.";
    }
    public String returnItalian() {
        return "Mama's Fine Italian";
    }
    public String returnCafe() {
        return "Corner Cafe.";
    }
    public String returnPizza() {
        return "Main Street Pizza Joint.";
    }
    public String returnBurgers() {
        return "Joe's Gourmet Burgers.";
    }
    public boolean askForDietaryRestriction(String question) {
        return AskUserForInput.askUserYesOrNo(question);
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public boolean isVegan() {
        return vegan;
    }

    public void setVegan(boolean vegan) {
        this.vegan = vegan;
    }

    public boolean isGlutenFree() {
        return glutenFree;
    }

    public void setGlutenFree(boolean glutenFree) {
        this.glutenFree = glutenFree;
    }
}
