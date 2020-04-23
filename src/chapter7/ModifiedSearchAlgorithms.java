package chapter7;

public class ModifiedSearchAlgorithms {
    // this method from the book has been modified
    // to count the number of indices checked before
    // returning the matching index.
    public static int binarySearch(int[] array, int value) {

        int first, last, middle, position;
        boolean found;

        first = 0;
        last = array.length - 1;
        position = -1;
        found = false;
        int indicesChecked = 0;

        // Search for the value.
        while (!found && first <= last) {
            middle = (first + last) / 2;
            if (array[middle] == value) {
                found = true;
                position = middle;
            } else if (array[middle] > value)
                last = middle - 1;
            else first = middle + 1;

            indicesChecked++;
        }
        System.out.println("amount of indices checked = " + indicesChecked);
        return position;
    }

    public static int sequentialSearch(int[] array, int value) {
        int index, element;
        boolean found;
        index = 0;
        element = -1;
        int indicesChecked = 0;

        found = false;
        while (!found && index < array.length) {
            if (array[index] == value) {
                found = true;
                element = index;
            }
            index++;
            indicesChecked++;
        }
        System.out.print("indices checked = ");
        System.out.println(indicesChecked);
        return element;
    }
}
