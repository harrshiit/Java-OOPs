package oops;

public class CallingCurrentClassMethodbyThis {
    private String username ; 
    private String password ; 
    public CallingCurrentClassMethodbyThis( String username , String password){
        this.username= username ; 
        this.password = password;
    }

    void  greet(){
        System.out.println("welcome  "+username);
    }
    void logaction( String action )
{
    System.out.println("log action for user  "+username+" that is"+action);
}

void authenticaltion ( String enterpassword){
    if(this.password.equals(enterpassword))// here we are comparing the current object refrence memory refrence stored value by "this keyword "  with  argument passed to it  
    { System.out.println(" Authetication sucessfull  ");
     this.logaction("congrass u sucessfully loged in ");
        // here by using this keyword we call another method inside a method  also can passedargument to it 
        this.greet(); // calling another method
         }
     else{
        System.out.println(" log in failed ");
        this.logaction("failed login attempt");;
       
     }

     }

     public static void main(String[] args) {
        CallingCurrentClassMethodbyThis objt = new CallingCurrentClassMethodbyThis("Harshit", "12345");
        System.out.println("trying one password ");
        objt.authenticaltion("00000");

        System.out.println();

        System.out.println(" trying correct password");
        objt.authenticaltion("12345");


     }

    }
 
    