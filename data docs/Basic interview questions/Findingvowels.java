public class Findingvowels {

    public static void main(String[] args) {
        

        String name = new String("Jashwanth");

        for (int i = 0; i < name.length(); i++) {

            if(name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o' || name.charAt(i) == 'u'){

                System.out.println("given string conatins " + name.charAt(i) + "at the index of " + i);
            }
            
        }
    }
    
}
