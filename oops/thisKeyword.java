package oops;

public class thisKeyword {
    
    public void show(){
        // here if  we made method static then static refers to a  particular class not nay object

        System.out.println("the reference from this keyword is " +this);// here this keywords used to refer the unique refrence id of the class
        // which is basically the memory refrence of the object of that class created 
        }
    }

    class driverClass1{
        public static void main(String[] args) {
            thisKeyword obj  = new thisKeyword();
            obj.show();

          //System.out.println(" the refrence of this keyword is " +obj.show()); we cant do like this because show has void return type we can't directly print it 
          // here java autimatically sends obj as a hideeden argument to this method like show(obj)
             System.out.println();
            System.out.println("the reference of obj of class is "+obj);
            // here both will gonna print same object memory refrence hashcode 
        
    }
    }

