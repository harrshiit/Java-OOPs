package oops;

// Step 1️⃣: First Interface
interface Animal { // interface keyword used
    int LEGS = 4;  // Constant variable (public static final by default)

    // Abstract methods (public and abstract by default)
    void eat();
    void sleep();

    // Default method (introduced in Java 8)
    default void sound() {
        System.out.println("Every animal makes a sound (default behavior).");
    }

    // Static method (introduced in Java 8)
    static void info() {
        System.out.println("This is the Animal interface - defines general animal behavior.");
    }
}

// Step 2️⃣: Second Interface to demonstrate multiple inheritance
interface Pet {
    void play(); // abstract method

    // Default method
    default void friendly() {
        System.out.println("Pets are friendly by nature.");
    }
}

// Step 3️⃣: Dog implementing MULTIPLE interfaces
class Dog implements Animal, Pet {  // multiple inheritance using interfaces
    public void eat() {
        System.out.println("Dog eats meat.");
    }

    public void sleep() {
        System.out.println("Dog sleeps at night.");
    }

    // Overriding default method from Animal
    @Override
    public void sound() {
        System.out.println("Dog barks: Woof! Woof!");
    }

    // Implementing Pet interface method
    public void play() {
        System.out.println("Dog loves to play fetch.");
    }

    // Overriding Pet default method (optional)
    @Override
    public void friendly() {
        System.out.println("Dog wags tail to show friendliness!");
    }
}

// Step 4️⃣: Cow implementing only Animal
class Cow implements Animal {
    public void eat() {
        System.out.println("Cow eats grass.");
    }

    public void sleep() {
        System.out.println("Cow sleeps even during the day.");
    }

    // Using default sound() from Animal (not overriding)
}

// Step 5️⃣: Interface Inheritance Example
interface Mammal extends Animal { // one interface extending another
    void giveBirth(); // new abstract method
}

// Step 6️⃣: Human class implementing extended interface
class Human implements Mammal {
    public void eat() {
        System.out.println("Human eats both vegetarian and non-vegetarian food.");
    }

    public void sleep() {
        System.out.println("Human sleeps mostly at night.");
    }

    public void giveBirth() {
        System.out.println("Human gives birth to live young ones.");
    }
}

// Step 7️⃣: Main class demonstrating all interface features
public class InterfaceDemo {
    public static void main(String[] args) {
        // Interface references (Upcasting)
        Animal dog = new Dog(); 
        Animal cow = new Cow(); 
        Pet petDog = new Dog();
        Mammal human = new Human();

        System.out.println("=== Dog Behavior ===");
        dog.eat();
        dog.sleep();
        dog.sound();  // Overridden sound()
        ((Pet) dog).play(); // calling play() using type casting
        ((Pet) dog).friendly();

        System.out.println("\n=== Cow Behavior ===");
        cow.eat();
        cow.sleep();
        cow.sound(); // default sound() from Animal

        System.out.println("\n=== Human (Mammal Interface Inheritance) ===");
        human.eat();
        human.sleep();
        human.giveBirth();

        System.out.println("\n=== Interface Static Method ===");
        Animal.info(); // static method called using interface name

        System.out.println("\n=== Interface Constant Variable ===");
        System.out.println("All animals have " + Animal.LEGS + " legs.");

        System.out.println("\n=== Multiple Inheritance Example ===");
        petDog.play();       // from Pet interface
        petDog.friendly();   // overridden default method
    }
}
