package chapter2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FormatOutput {

    //============================================================================//
    // Chapter 2 - Checkpoint Exercises
    //============================================================================//

    //region - fields
    private double aDouble;
    private int anInt;
    private String aString;
    //endregion

    //region accessors and mutators
    public double getaDouble() {
        return aDouble;
    }

    public void setaDouble(double aDouble) {
        this.aDouble = aDouble;
    }

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    public String getaString() {
        return aString;
    }

    public void setaString(String aString) {
        this.aString = aString;
    }
    //endregion

    //region - static methods
    /**
     * This method will receive a double.
     * It will print out the integer delimited with ','.
     * it will format the double to 2 decimal spaces.
     * @param x - The double to be formatted.
     */
    public static void formatDouble0(double x) {
        System.out.printf("%,.2f", x);
    }

    /**
     * This method will receive a double
     * It will print out the integer in a field of ten spaces.
     * It will round the decimal to 1 space.
     * @param x - The double to be formatted
     */
    public static void formatDouble1(double x) {
        System.out.printf("%10.1f", x);
    }

    /**
     * This method will receive a double.
     * It will print out the double in a field of 8 spaces.
     * It will pad the white spaces with '0'
     * It will round the decimal to 1 space.
     * @param x - The double to be formatted
     */
    public static void formatDouble2(double x) {
        System.out.printf("%08.1f", x);
    }

    /**
     * This method will receive a double.
     * It will print out the double delimited with ','.
     * It will print out the double in a field of 20 spaces.
     * It will print out the decimal rounded to 2 decimal places.
     * @param x - The double to be formatted.
     */
    public static void formatDouble3(double x) {
        System.out.printf("%,20.2f", x);
    }

    /**
     * This method will receive an integer
     * It will print out the integer delimited with ','.
     * It will print out the integer in a field of 10 spaces.
     * @param x - The integer to be formatted.
     */
    public static void formatInteger(int x) {
        System.out.printf("%,10d", x);
    }

    /**
     * This method will receive a string.
     * It will print out the string in a field of 20 spaces.
     * @param x - The string to be formatted.
     */
    public static void formatString(String x) {
        System.out.print(String.format("%20s", x));
    }
    //endregion

    //============================================================================//
    // Chapter 2 - Review / Programming Challenges
    //============================================================================//

    //Programming Challenge 4.

    /**
     * This method prints out a pattern of '*' using printf.
     */
    public static void printStars() {
        char ch = '*';
        System.out.printf("%3c\n", ch);

        String str = "***";
        System.out.printf("%4s\n", str);

        str = "*****";
        System.out.printf("%6s\n", str);

        str = "*******";
        System.out.printf("%7s\n", str);

        str = "*****";
        System.out.printf("%6s\n", str);

        str = "***";
        System.out.printf("%4s\n", str);

        ch = '*';
        System.out.printf("%3c\n", ch);
        }

    //#5. Cookie Calories

    /**
     * This function receives an integer representing the total amount of cookies consumed.
     * It will return the total amount of calories consumed.
     * @param x - The amount of cookies consumed
     * @return caloriesConsumed - the total amount of calories consumed.
     */
    public static double cookiesConsumed(int x) {
        int bag = 40;
        int cookies = x;
        int serving = 10;
        int calPerServing = 300;
        double caloriesConsumed = cookies * (serving * calPerServing)/bag;
        return caloriesConsumed;
    }

    //#6. Sales Prediction

    /**
     * This method receives a double representing the total amount of sales
     * It will return a double representing 65% of the sales.
     * @param x - Represents the total amount of sales.
     * @return 65% of the total amount of sales.
     */
    public static double salesPrediction(double x) {
        double eastCoastSalesDivisionPercentage = 0.65;
        return x * eastCoastSalesDivisionPercentage;
    }

    //#7. Land Calculator

    /**
     * This method receives a double representing the total amount of square feet
     * it will return the square feet converted to acres.
     * @param x - The amount of square feet to be converted.
     * @return The square feet converted to acres.
     */
    public static double howManyAcres(double x) {
        int squareFeetPerAcre = 43560;
        return x / squareFeetPerAcre;
    }

    //#8. Sales Tax

    /**
     * This method recieves a double representing the sale price of a purchase.
     * It prints out the state tax, county tax and transaction total.
     * @param x - The double representing the purchase price.
     */
    public static void enterSalePrice( double x) {
        double stateSaleTax = 0.055;
        double countySaleTax = 0.02;

        System.out.print("The sale price = $" + x + "\n" +
                "The State sales tax = $" + x * stateSaleTax + "\n" +
                "The County sales tax = $" + x * countySaleTax + "\n");
        System.out.printf("The total transaction amount = $%.2f", ((x*stateSaleTax) + (x*countySaleTax) + (x)));
    }

    //#9. Miles-per-Gallon

    /**
     * This method takes miles driven and divides it by gallons consumed.
     * it returns the miles per gallon.
     * @param milesDriven - A double representing the amount of miles driven.
     * @param gallonsConsumed - A double representing the amount of gallons consumed.
     * @return miles divided by gallons
     */
    public static double milesPerGallon(double milesDriven, double gallonsConsumed) {
        return milesDriven/ gallonsConsumed;
    }

    //#10. Test Average

    /**
     * This method takes input from the user three times.
     * Each score is added and the average of the scores is returned.
     * @return - A double, the average of the 3 numbers input from the user.
     */
    public static double averageOfThreeScores() {
        Scanner in = new Scanner(System.in);
        double score = 0;
        double total = 0;
        int i = 1;

        do{
            System.out.println("Please enter score #" + i + ": ");
            while(!in.hasNextDouble()){
                in.next();
                System.out.println("That is not a number, please try again.");
            }
            score = in.nextDouble();
            total = total + score;
            i++;
        }while(i <= 3);

        return total / 3;
    }

    //#11. Male and Female Percentages

    /**
     * This static method takes input from the user
     * The amount of males and females is entered.
     * Their respective percentages are printed to the console.
     */
    public static void genderPercentage() {
        Scanner in = new Scanner(System.in);
        int males = 0;
        int females = 0;
        int i=0;
        String gender = "";
        double total = 0;

        while(i < 2) {
            if (i == 0) {
                gender = "Males";
            }
            if (i == 1) {
                gender = "Females";
            }
            System.out.println("Please enter the amount of " + gender + ":");
            while(!in.hasNextInt()) {
                System.out.println("That is not a number, please try again.");
                in.next();
            }
            if(i==0) {
                males = in.nextInt();
            }
            if(i==1) {
                females = in.nextInt();
            }

            i++;
        }

        total = females + males;

        System.out.println("The percentage of males in the class room = %" +
                (males / total) * 100);

        System.out.println("The percentage of females in the class room = %" +
                (females / total) * 100);
    }

    //#12. String Manipulator

    /**
     * This static method takes a string from the user.
     * The string is then printed to the console in different ways.
     */
    public static void manipulateString() {
        Scanner in = new Scanner(System.in);
        String city;
        String confirmation;

        do {
            System.out.println("Please enter your favorite city: ");
            city = in.nextLine();

            while(city.isEmpty()) {
                System.out.println("You did not type anything, please try again.");
                System.out.println("Please enter your favorite city: ");
                city = in.nextLine();
            }

            System.out.println("You entered '"+ city + "'.");
            System.out.println("Is This correct? Press 'Y' or 'N'.");
            confirmation = in.nextLine();

            while(confirmation.isEmpty()) {
                System.out.println("You did not type anything, please try again.");
                System.out.println("You entered '"+ city + "'.");
                System.out.println("Is This correct? Press 'Y' or 'N'.");
                confirmation = in.nextLine();
            }

        }while(confirmation.equalsIgnoreCase("N"));

        System.out.println("Thank you!");
        System.out.println("So, "+ city + " is your favorite city. Great!");

        System.out.println("The string, '"+ city + "' is  " + city.length() + " characters long.");
        System.out.println("The all upper case version of '" + city + "' is '" + city.toUpperCase() +"'.");
        System.out.println("The all lower case version is '" +city.toLowerCase()+"'." );
        System.out.println("The first character in the string '"+city+ "' is '"+city.charAt(0)+ "'.");
    }


    //#13. Restaurant Bill

    /**
     * This static method takes a double from the user representing a restaurant bill.
     * The tax and tip are calculated.
     * The respective amounts are printed and formatted with a DecimalFormat object.
     */
   public static void taxAndTip() {
        final double TAB_TAX = .075;
        final double TAB_TIP = .20;
        Scanner in = new Scanner(System.in);
        DecimalFormat currency = new DecimalFormat("$00.00");
        double tab;
        String input;
        String confirmation;

        do {
            System.out.println("Please enter the total amount of the bill: ");
            while (!in.hasNextDouble()) {
                input = in.next();
                System.out.println("'" + input + "' " + "is not a decimal, try again.");
            }
            tab = in.nextDouble();

            do {
                System.out.println("You entered '"+ currency.format(tab)+
                        "' is that correct?");
                System.out.println("Enter 'Y' or 'N'...");
                confirmation = in.next();
            } while(!confirmation.equalsIgnoreCase("Y") &&
                    !confirmation.equalsIgnoreCase("N"));
        }while(tab < 0 || confirmation.equalsIgnoreCase("N"));

       System.out.println("So, the bill = "+ currency.format(tab)+ "', yikes!.");
       System.out.println("The appropriate tip = "+currency.format(tab*TAB_TIP));
       System.out.println("The tax on the bill = "+currency.format(tab*TAB_TAX));
       System.out.println("The grand total = "+currency.format(tab +
               (tab*TAB_TIP) +
               (tab*TAB_TAX)));
    }

    //#14. Ingredient Adjuster

    /**
     * This program recieves an int and a double.
     * The int represents the amount of shares of stock purchased.
     * The double represents the price of each share of stock.
     * @param shares - The amount of shares purchased.
     * @param pricePerShare - The price per share of stock.
     */
    public static void stockCommission(int shares, double pricePerShare) {
       final double COMMISSION_PERCENTAGE = .02;
       DecimalFormat currency = new DecimalFormat("$00.00");

        System.out.println("Original transaction total before commission costs = "+
                            currency.format(shares*pricePerShare));
        System.out.println("cost of commission = "+
                currency.format(shares*pricePerShare*COMMISSION_PERCENTAGE));

        System.out.println("Transaction total after commission costs = "+
                currency.format((  (shares*pricePerShare) * (COMMISSION_PERCENTAGE)  ) +
                        (shares*pricePerShare) ) );
    }

    //#15. Ingredient Adjuster

    /**
     * This static method receives an integer.
     * The integer represent the amount of cookies to be baked.
     * The amount of ingredients are calculated based on the original recipe
     * @param numberOfCookies - The amount of cookies desired.
     */
    public static void cookieAdjuster(int numberOfCookies) {
       final double BASE_COOKIE_AMOUNT = 48.0;
       final double CUPS_SUGAR = 1.5;
       final double CUPS_BUTTER = 1.0;
       final double CUPS_FLOUR = 2.75;
       double percentageConversion;

       percentageConversion = (numberOfCookies/BASE_COOKIE_AMOUNT);
        System.out.println("You are making "+ (percentageConversion*100)+ "%"+ " of the original recipe.");
        System.out.println("This will call for:");
        System.out.println(CUPS_SUGAR * percentageConversion+ " cups of sugar.");
        System.out.println(CUPS_BUTTER * percentageConversion+ " cups of butter.");
        System.out.println(CUPS_FLOUR * percentageConversion+ " cups of flour.");
    }

    //#16. energy Drink Consumption

    /**
     * This static method will print out -
     * 18% of the 15000 customers surveyed.
     * 58% of the 18% surveyed.
     */
    public static void consumerPercenage() {
        final int CUSTOMERS_SURVEYED = 15000;
        final double PURCHASED_ONE_OR_MORE_PERCENTAGE = 0.18;
        final double CUSTOMERS_PREFERING_CITRUS = (CUSTOMERS_SURVEYED*0.58) *
                (PURCHASED_ONE_OR_MORE_PERCENTAGE);

        System.out.println(CUSTOMERS_SURVEYED * PURCHASED_ONE_OR_MORE_PERCENTAGE+
                " customers purchase one or more energy drinks per week.");
        System.out.println(" of those customers purchasing one or more per week, "+
                CUSTOMERS_PREFERING_CITRUS+ " prefer citrus-flavored drinks.");
    }

    //#17. Word Game

    /**
     *
     * @return String - story - The consolidated string consisting of all other
     * string input from the user.
     */
    public static String wordGame() {
        //Scanner in = new Scanner(System.in);
        String name,
                city,
                college,
                profession,
                animal,
                petName,
                story;
        int age;

        //input name from the user

        //The pattern of this jumbled mess of do while loops was
        // originally used for all String variable user inputs.
        // I replaced the giant do while loop with three functions -
        // wordGameInputStrVar, wordGameConfirmStrVar and wordGameReceiveUserInput.
        // The third method, wordGameReceiveUserInput, encapsulates the first two
        // in a do while loop.
        //The function is called after this commented-out code block below.

        //Take the user's name.
        //The loops will repeat until something is typed.
        //The user is then asked to confirm the input.

        /*
        do {
            do {
                System.out.println("Please enter your first name: ");
                name = in.nextLine();
            } while (name.isEmpty() || name.isBlank());

            System.out.println();
            System.out.println("You entered '"+ name+ "', is that correct?");

            do {
                System.out.println("Press 'Y' or 'N'.");
                confirm = in.nextLine();
            } while ((confirm.isEmpty() || confirm.isBlank())
                    ||
                    (!confirm.equalsIgnoreCase("Y") &&
                    !confirm.equalsIgnoreCase("N")));
        } while (confirm.equalsIgnoreCase("N"));
         */

        //Here is the function call replacing the above code.
        //The function takes the user prompt as its argument.
        name = wordGameReceiveUserInput("Please enter your name: ");
        System.out.println();
        System.out.println("Thank you for entering your name.");
        System.out.println("Now if you would be so kind as to turn your attention to the" +
                " dialogue box.");
        System.out.println("It is displaying somewhere on your screen.");
        System.out.println("Try minimizing your IDE if you do not see it :)");
        System.out.println();

        //input age from the user.

        //For this next section, the user is asked to input their age.
        //I have chosen to use some of the pre defined methods from JOptionPaneClass.java.
        //The methods are not static.
        //That is why there is an object declaration from that class below.

        //Create a new JOPtionPaneClass object
        JOptionPaneClass objectJOPC = new JOptionPaneClass();

        //Call the displayInputDialogueForAge method to input an integer.
        objectJOPC.displayInputDialogForAge();

        //Verify the input of age with another method from JOptionPaneClass.java
        objectJOPC.validateInputAge();

        //Transfer the contents of age within objectJOPC
        //to the local variable 'age' in here.
        age = objectJOPC.getAge();
        System.out.println();

        //Input the name of a city from the user.
        city = wordGameReceiveUserInput("Please enter the name of a city: ");
        System.out.println();

        //input college from the user.
        college = wordGameReceiveUserInput("Please enter the name of a college: ");
        System.out.println();

        //input a profession from the user.
        profession = wordGameReceiveUserInput("Please enter a profession: ");
        System.out.println();

        //input animal from the user.
        animal = wordGameReceiveUserInput("Please enter a type of animal: ");
        System.out.println();

        //input petName from user.
        petName = wordGameReceiveUserInput("Please enter a name for a pet: ");
        System.out.println();

        //Capitalize the proper nouns using the functions we wrote below.
        //Prepend the appropriate articles 'a' or 'an' before certain nouns
        //using the aOrAn function.
        story = "There once was a goober named "+ capitalizeFirstLetter(name)+ ".\n"+
                capitalizeFirstLetter(name)+ " was "+ age+ " years old.\n"+
                capitalizeFirstLetter(name)+ " moved to " + capitalizeFirstLetter(city)+
                " after graduating from "+ capitalizeFirstLetter(college)+ " college.\n"+
                "Soon after finding work as "+ aOrAn(profession)+ ", "+
                capitalizeFirstLetter(name)+ " was able to save a large "+
                "sum of money.\n"+
                "With their newly acquired wealth, "+ capitalizeFirstLetter(name)+
                                    //aOrAn function used here
                " was able to purchase "+ aOrAn(animal)+ ".\n"+
                capitalizeFirstLetter(name)+ " named the "+ animal+
                ", "+ capitalizeFirstLetter(petName)+ "."+ "\nThe end : )";

        return story;
    }

    /**
     * This method receives a string to be displayed to the user as a prompt.
     * It will then echo the user input and return it as a string.
     * @param prompt - The prompt to be displayed to the user.
     * @return The input from the user stored in strVar.
     */
    public static String wordGameInputStrVar(String prompt) {
        Scanner in = new Scanner(System.in);
        String strVar;
        do {
            System.out.println(prompt);
            strVar = in.nextLine();
        } while (strVar.isEmpty() || strVar.isBlank());

        System.out.println();
        System.out.println("You entered '" + strVar + "', is that correct?");

        return strVar;
    }

    /**
     * This method loops until an input of Y or N is taken from the user.
     * @return confirmation - The string input from the user.
     */
    public static String wordGameConfirmStrVar() {
        Scanner in = new Scanner(System.in);
        String confirmation;

        do {
            System.out.println("Press 'Y' or 'N'.");
            confirmation = in.nextLine();
        } while ((confirmation.isEmpty() || confirmation.isBlank())
                ||
                (!confirmation.equalsIgnoreCase("Y") &&
                        !confirmation.equalsIgnoreCase("N")));

        return confirmation;
    }

    /**
     * This method receives a string to be passed to the wordGameInputStrVar()
     * to be used a user prompt.
     * This method encapsulates wordGameInputStrVar() and wordGameConfirmStrVar()
     * in a do while loop.
     * @param userPrompt - The prompt to be displayed to the user.
     * @return str0 - a String containing the validated input from the user.
     */
    public static String wordGameReceiveUserInput(String userPrompt) {
        String str0;
        String str1;

        do {
            str0 = wordGameInputStrVar(userPrompt);
            str1 = wordGameConfirmStrVar();
        } while(str1.equalsIgnoreCase("N"));

        return str0;
    }

    //This method was originally written for use in the wordGame function.
    /**
     * This method accepts a String.
     * The string is returned with the first letter capitalized.
     * @param aString - The string to be manipulated
     * @return The string with a capitalized first letter.
     */
    public static String capitalizeFirstLetter(String aString) {

        return aString.substring(0, 1).toUpperCase()+aString.substring(1);
    }

    //This method was also originally written for the wordGame function
    /**
     * This static method accepts a String.
     * If the String begins with a vowel 'an ' is appended to the front of the String.
     * @param aString - The string to be tested.
     * @return aString with the proper article before it.
     */
    public static String aOrAn(String aString) {

        switch(aString.substring(0, 1)) {
            case "A":
            case "a":

            case "E":
            case "e":

            case "I":
            case "i":

            case "O":
            case "o":

            case "U":
            case "u":
                aString = "an "+ aString;
                break;

            default:
                aString = "a "+aString;
                break;
        }

        return aString;
    }

    //#18 Stock Transaction Program

    public static void stockProgram() {
        final double COMMISSION_PERCENTAGE = 2.00/100;

        double totalSpent = (priceTimesShares(32.87, 1000))+
                (priceTimesShares(32.87, 1000)*COMMISSION_PERCENTAGE);
        double gain = differenceBetween(totalSpent,
                (priceTimesShares(33.92, 1000)-
                        (priceTimesShares(33.92, 100)*COMMISSION_PERCENTAGE)));

        //Joe purchases 1000 shares at $32.87 per share.
        System.out.println("Joe spent a total of "+
                displayAsCurrency(priceTimesShares(32.87, 1000)+
                        priceTimesShares(32.87, 1000)* COMMISSION_PERCENTAGE)+
                " on the his stock purchase.");

        //The cost of the stocks alone and how much he paid his broker.
        System.out.println("He spent "+
                displayAsCurrency(priceTimesShares(32.87, 1000))+
                        " on the stocks and paid his broker "+
                displayAsCurrency(priceTimesShares(32.87, 1000)*
                        COMMISSION_PERCENTAGE));

        //Joe sells 1000 shares at $33.92 per share.
        System.out.println("Joe sold 1000 shares at $33.92 per share.");
        System.out.println("Joe made a total of "+
                displayAsCurrency(gain));

    }
    public static double differenceBetween(double aDouble0, double aDouble1) {
        return aDouble0 - aDouble1;
    }
    public static double priceTimesShares(double price, int shares) {
        return price * shares;
    }
    public static double percentOf(double aDouble, double percentage) {
       return aDouble * (percentage / 100);
    }
    public static String displayAsCurrency(double aDouble) {
        DecimalFormat cashMoney = new DecimalFormat("'$'0.00");
        return cashMoney.format(aDouble);
    }

    //#19. Planting Grapevines

    /**
     * This method takes the length of a row from a user in feet,
     * the amount of space used by an end post in feet and
     * the required space between each grapevine in feet.
     * The program then calculates how many grapevines may be planted in the
     * allotted space.
     */
    public static void grapeVines() {
        double lengthOfRow;
        double endPost;
        double spaceBetweenVines;

        lengthOfRow =
                AskUserForInput.askUserForInteger
                        ("Please enter the length of the row in feet.");
        endPost =
                AskUserForInput.askUserForDouble
                        ("Please enter the amount of space used by an end post in feet.");
        spaceBetweenVines =
                AskUserForInput.askUserForDouble
                        ("Please enter the required space between the vines in feet.");
        //calculate the amount of grapevines.
        System.out.print("You have enough room for ");
        System.out.print(calculateGrapevines(lengthOfRow, endPost, spaceBetweenVines));
        System.out.println(" grapevines.");

    }

    /**
     * This method is meant to be used inside the grapeVines method
     * after user input is received.
     * @param l - a double, The length of the grapevine row in feet.
     * @param e - a double, the required space of one end post in feet.
     * @param s - a double, the required space between each grapevine in feet.
     * @return the calculation casted to an integer representing the
     * amount of grapevines allotted in the space.
     */
    public static int calculateGrapevines(double l, double e, double s) {
        final int formulaSpecificNum = 2;

        return (int) (l-(formulaSpecificNum * e * s));
    }

    /**
     * This method takes input from the user and calculates
     * the total amount of money after compounding interest
     * has occurred over n number of years.
     */
    public static void  compoundInterest() {
        double principal;
        double interestRate;
        double numTimesPerYearCompounded;
        int numOfYears;

        principal =
                AskUserForInput.askUserForDouble(
                        "Enter the principle deposit.");
        interestRate =
                AskUserForInput.askUserForDouble(
                        "Enter the interest.");
        numTimesPerYearCompounded =
                AskUserForInput.askUserForDouble(
                        "Enter the number of times the interest"+
                                " is compounded in one year.");
        numOfYears =
                AskUserForInput.askForInt(
                        "Enter the number of years since the"+
                        " principle deposit.");

        //convert percentage to a decimal.
        interestRate = interestRate/100;

        //pass the values to the calculation method
        //and display results to the console.
        System.out.println(calculateCompoundInterest(
                principal,
                interestRate,
                numTimesPerYearCompounded,
                numOfYears
        ));
    }

    /**
     * This method was designed to be used inside
     * the compoundInterest method to calculate the compound interest
     * using the formula an the variables.
     * @param p - The principle amount of money deposited in to the account.
     * @param r - The interest rate.
     * @param n - The number of times per year the interest is compounded.
     * @param t - The number of years the money remains in the account.
     * @return a String containing the results of the
     * calculation formatted to USD.
     */
    public static String calculateCompoundInterest(double p, double r, double n, int t ) {

        DecimalFormat currency = new DecimalFormat("'$'.00");
        return currency.format(p * Math.pow((1+(r/n)), (n*t)));
    }
}