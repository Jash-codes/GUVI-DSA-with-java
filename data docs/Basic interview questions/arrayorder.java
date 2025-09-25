import java.util.Arrays;
import java.util.Collections;

public class arrayorder {

    public static void main(String[] args) {

        int[] num = { 8, 6, 1, 5, 7, 15, 9, 4 };

        Arrays.sort(num);
        System.out.println("Ascennding order is : " + Arrays.toString(num));

        Integer [] numsDesc = { 5, 2, 9, 1, 7 };
        Arrays.sort(numsDesc, Collections.reverseOrder());
        System.out.println("Descending order is : " + Arrays.toString(numsDesc));

    }

}
