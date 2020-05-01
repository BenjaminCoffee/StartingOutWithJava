package chapter2;

public class PracticeDriver {
    public static void main(String[] args) {

        //Create an instance of a Practice object
        Practice obj0 = new Practice();

        //Checkpoint 2.27
        //city within obj0 is initialized
        obj0.setCity("San Francisco");

        //city is returned with an accessor method and printed to the console
        System.out.println(obj0.getCity());

        //2.28
        //initialize int field stringLength to the length of city in obj0
        obj0.setStringLength(obj0.getCity().length());

        //2.29
        //store the first character of the String referenced
        //by 'city' in oneChar.
        obj0.setOneChar(obj0.getCity().charAt(0));

        //2.30
        //the toUpperCase returns the upper case version of the
        //calling string
        //The upper case version of the contents of 'city' are
        //stored in the String field 'upperCity'
        obj0.setUpperCity(obj0.getCity().toUpperCase());

        //2.31
        //store the lower case value of 'city' in a new String variable inside obj0
        obj0.setLowerCity(obj0.getCity().toLowerCase());

        //Display value of lowerCity within obj0
        System.out.println(obj0.getLowerCity());
    }
}
