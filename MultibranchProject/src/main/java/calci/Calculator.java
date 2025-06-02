import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double num1, num2, result;
        char operator;

        Scanner scanner = new Scanner(System.in);

        // Input first number
        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();

        // Input operator
        System.out.print("Enter an operator (+, -, *, /): ");
        operator = scanner.next().charAt(0);

        // Input second number
        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();

        // Perform operation
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Cannot divide by zero!");
                }
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }

        scanner.close();
    }
}
