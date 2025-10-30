package oops;

// ======= ABSTRACT CLASS EXAMPLE =======
abstract class Animal {
    // 1️⃣ Instance variable (possible in abstract class)
    String name;

    // 2️⃣ Constructor (allowed)
    Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor called for: " + name);
    }

    // 3️⃣ Abstract method (must be implemented by subclass)
    abstract void makeSound();

    // 4️⃣ Concrete method (fully implemented)
    void sleep() {
        System.out.println(name + " is sleeping...");
    }

    // 5️⃣ Static method (allowed)
    static void type() {
        System.out.println("All animals belong to the Animal kingdom.");
    }
}

// Subclass of Abstract Class
class Dog extends Animal {
    Dog(String name) {
        super(name); // calling abstract class constructor
    }

    // Implementing abstract method
    void makeSound() {
        System.out.println(name + " barks: Woof! Woof!");
    }
}

// ======= INTERFACE EXAMPLE =======
interface Pet {
    // 1️⃣ Constant variable (public static final by default)
    int AGE = 5;

    // 2️⃣ Abstract method (no implementation)
    void play();

    // 3️⃣ Default method (introduced in Java 8)
    default void friendly() {
        System.out.println("Pets are usually friendly!");
    }

    // 4️⃣ Static method (introduced in Java 8)
    static void info() {
        System.out.println("This is a Pet interface.");
    }
}

// Another interface to demonstrate multiple inheritance
interface Trainable {
    void train();
}

// Class implementing multiple interfaces
class Cat implements Pet, Trainable {
    public void play() {
        System.out.println("Cat plays with a ball of yarn.");
    }

    public void train() {
        System.out.println("Cat can be trained to use a litter box.");
    }

    // Overriding default method
    public void friendly() {
        System.out.println("Cat purrs when it's friendly.");
    }
}

// ======= MAIN CLASS =======
public class AbstractVsInterfaceDemo {
    public static void main(String[] args) {
        System.out.println("=== Abstract Class Demonstration ===");
        Animal dog = new Dog("Buddy");  // abstract class reference
        dog.makeSound();
        dog.sleep();
        Animal.type(); // static method

        System.out.println("\n=== Interface Demonstration ===");
        Cat cat = new Cat();
        cat.play();
        cat.train();
        cat.friendly();
        Pet.info(); // static method from interface
        System.out.println("Pet constant AGE: " + Pet.AGE);

        // Multiple inheritance shown (Cat implements 2 interfaces)
    }
}
