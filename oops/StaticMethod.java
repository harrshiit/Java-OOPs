package oops;
 class smaple1{
    int a = 10 ;
    static int b= 20 ;
    public static void show(){
       // System.out.println(a);---> here it is an static method and try to acces non static data members  its throw the error
        System.out.println("static variable value access in static mehtod is  "+b); // willnot show error Static method can access only static data directly
         
        // now the correct way to acces the non static variable in static method 
        smaple1 obj = new smaple1();
        System.out.println("instance variable value access by obj in static method is  "+obj.a); 
            }
        public void show2(){
    // this is instance method able to access both static and non  static vriables will no throw error 
       System.out.println("access the value of instance variable in nonstatic method directrly "+a);
       System.out.println("acces the value of static variable in non static method directly "+b);
        }
    }

      class sample2{
        public static int  add( int x , int y  ){
            // its is the utility method work on only its parameter it can be  acces without creating object
            // to call this method we do not need to create this class object refrence because this method uses its 
            // own argument variable inside the method
            return x+y;
        }

        public int add2( int x  , int y){
            return  x*y;
        }
    }

    //driver class 
public class StaticMethod {
    public static void main(String[] args) {
        // here i am calling static method just by using class name note if it is in the same class we  dont need that also like writing class name
        smaple1.show();
       
        // now going to call a non-static method after creating the object of the class 
        smaple1 obj2 = new  smaple1();// as we already crreated the object of that class but in another class that is 'obj"
        // so that scope only limits upto that class only itsend  with that method who uses that object ends 
        // but this obj exict until main ends 
        obj2.show2();


        // now going to call static  utility method no object needed
        int result = sample2.add(5, 10);// access by class 
        System.out.println(" the result through static utility method is "+result);

        // now going to call a non-static method  then we have to firstly create the object 
         sample2 s2 = new sample2();
         int result2 = s2.add2(5, 10);// access by object 
        System.out.println(" the result through non static method is "+result2);

         

        
    }
    
}
