package oops;

public class StaticBlock1 {

    static{
        System.out.println("Static block executed");
    }
    StaticBlock1(){// default constructor 
      System.out.println("Default constructor executed ");
    }
    
    
}
class driver {
    public static void main(String[] args) {
        System.out.println(" main block started ");
        // here after creating a main block the static block stoll not executed becuse we stillnot use the stacticblock1 class in this class 
        // note:::--->> if we created the main in the same static block class the stactic block will executed 
        // so in order to use that  class in this class we createe the obj of that class 
        StaticBlock1 st = new StaticBlock1(); // here firstly static block executed because the class of staticblock use in this class
        // also the default constructor  executed because it executed automatically at the creation of object of  the class 
         
        //Here main block executed firt becuse static block in another class

        StaticBlock1 st2 = new StaticBlock1();
        StaticBlock1 st3 = new StaticBlock1();
        // here we created new objects of that class  but only default constructor runs because static block runs only once 
        
    }

    
}
