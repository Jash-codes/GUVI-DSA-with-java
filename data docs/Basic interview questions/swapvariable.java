public class swapvariable {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        
        System.out.println("BEFORE SWAPPING" + "\na = " + a + "\nb = " + b);

        a = a + b; // new a value = 30

        b = a - b;  //now a is 30 , we implemented b = a - b , so 30 - 20 = 10 , now the a value is assigned to b

        a = a - b;  // as now a is 30 , a = 30 - 10 = 20 , so a = 20

        System.out.println("\nAFTER SWAPPING " + "\na = " + a + " \nb = " + b);

    
        }
    
}
