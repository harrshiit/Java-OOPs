package oops;

public class UseAbstraction1 {
    public static void main(String[] args) {
        Abstraction1 c = new car();// craeting object by upcasting note here we afre notcreating the object of  abstract class 
        // we are creatinh here the objrct of sub class 
        c.start();
        c.stop();

        Abstraction1 b = new bike();
        b.start();
        b.stop();
      }
    
}
