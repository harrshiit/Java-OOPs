package oops;

public class UseStudent {
    // this is driver class where the objects are created
    public static void main(String[] args) {
        Student s= new Student();
        s.roll = 10 ;
        s.name = "Harshit";
        s.per = 99.4;
        System.out.println("The  roll number is "+s.roll);
        System.out.println(" the nameis "+  s.name );
        System.out.println(" the percentage is "+s.per);
    }
    
}
