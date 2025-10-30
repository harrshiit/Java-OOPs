package oops;
class Calculator {
    // Method 1: Add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method 2: Add three integers (different number of parameters)
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: Add two doubles (different data types)
    double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloadingDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Sum of 2 ints: " + calc.add(10, 20));           // calls add(int, int)
        System.out.println("Sum of 3 ints: " + calc.add(10, 20, 30));       // calls add(int, int, int)
        System.out.println("Sum of 2 doubles: " + calc.add(10.5, 20.5));    // calls add(double, double)
    }
}
