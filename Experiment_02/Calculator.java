public class Calculator {
    // Attributes (for demonstration in parameterized constructor)
    int num1, num2;

    // Default Constructor (Constructor Overloading)
    Calculator() {
        System.out.println("Welcome to Calculator!");
    }

    // Parameterized Constructor (Constructor Overloading)
    Calculator(int a, int b) {
        num1 = a;
        num2 = b;
        int sum = num1 + num2;
        System.out.printf("Sum of %d and %d is: %d\n", num1, num2, sum);
    }

    // Method Overloading: add() with no parameters
    void add() {
        int a = 5, b = 10;
        int sum = a + b;
        System.out.printf("Sum of default numbers %d and %d is: %d\n", a, b, sum);
        // Print the summation over here
    }

    // Method Overloading: add() with two integer parameters
    void add(int a, int b) {
        int sum = a + b;
        System.out.printf("Sum of %d and %d is: %d\n", a, b, sum);
        // Add the summation over here as given in the document
    }

    // Method Overloading: add() with three float parameters
    void add(float a, float b, float c) {
        float sum = a + b + c;
        System.out.printf("Sum of %.1f, %.1f and %.1f is: %.1f\n", a, b, c, sum);
        // Add the summation over here as given in the document
    }
}
