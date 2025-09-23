public class Stringbuilderexample {

    public static void main(String[] args) {

        // String name = "Jashwanth";

        StringBuilder builtin = new StringBuilder("Jashwanth");

        builtin.append("is a good boy");
        System.out.println("After append " + builtin);

        builtin.insert(3, "MAX");
        System.out.println("after insert " + builtin);

        builtin.delete(1,3);
        System.out.println("after deletion " + builtin);

        builtin.replace(6, 8,"is a boy");
        System.out.println("After replacing : " + builtin);

        builtin.reverse();
        System.out.println(builtin);

        
        
    }
    
}
