package oops;

public class ConstructorProperties {
    String type ;
    int age ;

    ConstructorProperties(){// default
     type = " unknown";
     age = 0;
     System.out.println("Default constructor called.");
    }

    ConstructorProperties( String tipe , int umar){// parametrized constructer 
        type = tipe;
        age = umar; // here no need to assign this keyword 
        System.out.println("Parameterized constructor called.");
    }

    public void breath(){
        System.out.println(type + " breath through lungs and gills.");
    }

   public void display(){
    System.out.println("Animal type " + type + " age is " + age);
   }

   class dog extends ConstructorProperties{
    // child class 
    String breed ;
    dog( String type  , int age  , String breed){
        super( type  , age  ); // calls parent constructor of (String , int )
        this.breed = breed;
        System.out.println("Child class constructor (Dog) called.");
    }

    void show(){
        System.out.println("Dog breed is " + breed);
    }
   }

   // main function to demonstrate constructor properties
   public static void main(String[] args) {
       // creating object of outer class
       ConstructorProperties a1 = new ConstructorProperties(); // default constructor
       a1.display();
       a1.breath();

       ConstructorProperties a2 = new ConstructorProperties("Fish", 2); // parameterized constructor
       a2.display();
       a2.breath();

       // creating object of inner class dog
       ConstructorProperties outer = new ConstructorProperties(); // need outer object for inner class
       ConstructorProperties.dog d1 = outer.new dog("Dog", 5, "Labrador"); // child class constructor called
       d1.display();
       d1.show();
       d1.breath();
   }
}
