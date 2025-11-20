package oops;

public class StaticBlock2 {
    static{
        System.out.println(" 1st static block executed ");
    }
    static{
        System.out.println(" 2nd static block executed ");
    }

    public static void show(){
        System.out.println(" static method called ");
    }
    }
    class mainmethod  {
        public static void main(String[] args) {
            System.out.println(" main block executed");
             StaticBlock2.show(); // fisrt static block  of that class execute then static method will gonna execute 
             // becuse when JVM loads a particular class it firstly execute the static block
             // here we did not create the object of the class where the static block exist but  still static block will execute because we called the 
             // static method of that class 
             System.out.println(" main block executed ");
    
        }
    }
