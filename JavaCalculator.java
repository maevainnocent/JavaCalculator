import java.util.Scanner;

public class JavaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter operation (add, subtract, multiply, divide) or 'exit' to quit:");
            String operation = scanner.nextLine();

            if (operation.equals("exit")) {
                break;
            }

            System.out.println("What is the first number of your choice?");
            double num1 = scanner.nextDouble();
            System.out.println("What is the second number of your choice?");
            double num2 = scanner.nextDouble();
            scanner.nextLine();

            try {
                switch (operation) {
                    case "add":
                        System.out.println("Result: " + (num1 + num2));
                        break;
                    case "subtract":
                        System.out.println("Result: " + (num1 - num2));
                        break;
                    case "multiply":
                        System.out.println("Result: " + (num1 * num2));
                        break;
                    case "divide":
                        if (num2 == 0) {
                            throw new ArithmeticException("Cannot divide by zero");
                        }
                        System.out.println("Result: " + (num1 / num2));
                        break;
                    default:
                        System.out.println("Invalid operation");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error occurred: " + e.getMessage());
            }
        }

        scanner.close();
        System.out.println("Calculator closed.");
    }
}
