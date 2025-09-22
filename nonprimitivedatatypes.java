//Non primitive datatypes ---> String and arrays

import java.util.Arrays;

public class nonprimitivedatatypes {
    public static void main(String[] args) {

        String name = "jashwanth";

        int numbers_arr[] = {1,2,3,4,5};
        String names_arr[] = {"Max","lewis"};


        System.out.println("String_Name : " + name);
        System.out.println("interger_array : " + Arrays.toString(numbers_arr));
        System.out.println("names_array : " + Arrays.toString(names_arr));
        
    }
    
}
