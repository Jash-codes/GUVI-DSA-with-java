import java.util.Arrays;
import java.util.HashSet;

public class duplicateremover {

    public static String[] removeDuplicatesUsingSet(String[] arrayWithDuplicates) {
        HashSet<String> uniqueStrings = new HashSet<>(Arrays.asList(arrayWithDuplicates));
        return uniqueStrings.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] originalArray = {"max", "lewis", "carlos", "ocon", "lewis", "max"};

        String[] uniqueArray = removeDuplicatesUsingSet(originalArray);

        System.out.println("Original array: " + Arrays.toString(originalArray));
        System.out.println("Array without duplicates: " + Arrays.toString(uniqueArray));
    }
}
