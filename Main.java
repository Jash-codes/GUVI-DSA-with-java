class Dog {

    //attributes
    String name;

    void bark(){ //function
        System.out.println(name + " barks!");
    } //behaviour
    
}

public class Main{
    public static void main(String[] args) {
        Dog myDog = new Dog(); //object declaration

        myDog.name  = "Rocky";

        myDog.bark();

        Dog anotherDog = new Dog(); //another object declaration

        anotherDog.name = "Ceaser";

        anotherDog.bark();
        
    }
    
}


