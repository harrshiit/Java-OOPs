package oops;

public class thisKeyword2 {

    int age ; // instancevarible its default value is zero 

    thisKeyword2( int age ){
        // note suppose if we change the name of local variable name so that problelm will not gonna arise but according to industry standards 
        // those paramater which gonna initlize the value of data member there name should be same and identiacl it increases the readability  of code save memory 
        
        age = age ;
         // the left one is instance variable andright onw is local here we assign the value to instance varible whosee variable compied in memoryv 
         // and a value for a object 
     }
    void show(){
        // this method use instance variable value to print 
        System.out.println(" the value of varible  is "+age);
    }
    }
     class thisKeyword3 {

    int age = 10  ; // instancevarible value is 10 

    thisKeyword3( int age ){

        this.age = age ;
        
     }
    void show2(){
        // this method use instance variable value to print 
        System.out.println(" the value of varible  is "+age);
    }
    }



    class mainclass{
        public static void main(String[] args) {
            thisKeyword2 object= new thisKeyword2(50);// here we passed the value of a  as 50  as a argument 
             object.show(); // it will gonna still print 0 all because our compiler gets confuse which one is instance variable and which one is local 
            // so it gonna print the default value of that variable 

            thisKeyword3 object2 = new thisKeyword3(60);
            object2.show2();// but this will surely print 60 
        }
    }
