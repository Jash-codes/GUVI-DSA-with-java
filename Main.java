class Dog {

    //attributes
    String name;

    void bark(){ //function
        System.out.println(name + " barks!");
    } //behaviour
    
}

class cat {
    String catname;  //attribute

    void meow(){  //function
        System.out.println(catname + "meow");
    }
}

public class Main{
    public static void main(String[] args) {
        Dog myDog = new Dog(); //object declaration

        myDog.name  = "Rocky";

        myDog.bark();

        Dog anotherDog = new Dog(); //another object declaration

        anotherDog.name = "Ceaser";

        anotherDog.bark();


        cat mycat = new cat();

        // mycat.catname= "milly ";
        mycat.meow();

        
    }
    
}


