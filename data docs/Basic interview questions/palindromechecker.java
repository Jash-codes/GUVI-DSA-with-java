public class palindromechecker {

    public static void main(String[] args) {

        String name = "madam";

        String reversed = "";

        for (int i = name.length() - 1; i < 0; i--) {

            reversed += name.charAt(i);

            if (name.equalsIgnoreCase(reversed)) {

                System.out.println(name + "is a palindrome");
            } else {
                System.out.println(name + "is not a palindrome");
            }

        }
    }

}
