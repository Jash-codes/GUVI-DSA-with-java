public class factorialchecker {

    public static void main(String[] args) {
        
        int num = 5;
        int factorial = 1;

        if (num == 0 || num == 1) {
            System.out.println("The factorial of " + num + " is: 1");
        } else {
            for (int i = 2; i <= num; i++) {
                factorial *= i;
            }
            System.out.println("The factorial of " + num + " is: " + factorial);
        }
    }
}
