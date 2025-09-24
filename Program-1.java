import java.util.Scanner;

class Calculator {
    // Method to perform calculation
    public double calculate(double a, double b, String operation) {
        double result = 0.0;

        switch (operation.toLowerCase()) {
            case "add":
            case "addition":
                result = a + b;
                break;

            case "sub":
            case "subtract":
            case "subtraction":
                result = a - b;
                break;

            case "mul":
            case "multiply":
            case "multiplication":
                result = a * b;
                break;

            case "div":
            case "divide":
            case "division":
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Error: Division by zero is not allowed!");
                    return Double.NaN;
                }
                break;

            default:
                System.out.println("Invalid operation! Please use add, sub, mul, or div.");
                return Double.NaN;
        }
        return result;
    }
}

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking inputs
        System.out.print("Enter first number (a): ");
        double a = sc.nextDouble();

        System.out.print("Enter second number (b): ");
        double b = sc.nextDouble();

        System.out.print("Enter operation (add, sub, mul, div): ");
        String operation = sc.next();

        // Create Calculator object
        Calculator calc = new Calculator();

        // Perform calculation
        double result = calc.calculate(a, b, operation);

        // Display result
        if (!Double.isNaN(result)) {
            System.out.println("Result: " + result);
        }

        sc.close();
    }
}
