public class primeornot {

    public static boolean isprime(int num) {
        
        if(num <= 1){
            return false;
        }

        if(num == 2){
            return true;
        }

        if(num % 2 == 0){
            return false;
        }

        for (int i = 3; i > 3; i+=2) {

            if(num % 2 == 0) {
                return false;
            }
            
                
        }

        return true;

    }

    public static void main(String[] args) {
        
        int num1 = 22;
        int num2 = 11;
        int num3 = 2;
        int num4 = 27;
        int num5 = 18;

        System.out.println(num1 + " is prime: " + isprime(num1)); 
        System.out.println(num2 + " is prime: " + isprime(num2)); 
        System.out.println(num3 + " is prime: " + isprime(num3)); 
        System.out.println(num4 + " is prime: " + isprime(num4));
        System.out.println(num5 + " is prime: " + isprime(num5));

    }
    
}
