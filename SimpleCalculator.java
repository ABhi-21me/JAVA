import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean keepGoing = true;

        while (keepGoing) {
            System.out.println("\nChoose operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");

            System.out.print("Enter choice (1-5): ");
            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Calculator closed.");
                break;
            }

            if (choice < 1 || choice > 5) {
                System.out.println("Invalid choice! Try again.");
                continue;
            }

            System.out.print("Enter first number: ");
            double a = sc.nextDouble();

            System.out.print("Enter second number: ");
            double b = sc.nextDouble();

            double result = 0;
            switch (choice) {
                case 1: result = a + b; break;
                case 2: result = a - b; break;
                case 3: result = a * b; break;
                case 4: 
                    if (b == 0) {
                        System.out.println("Cannot divide by zero!");
                        continue;
                    }
                    result = a / b; 
                    break;
            }

            System.out.println("Result: " + result);

            // Continue / Exit menu with error handling
            boolean validInput = false;
            while (!validInput) {
                System.out.print("\nDo you want to continue? (1 = Yes, 2 = No): ");
                int cont = sc.nextInt();

                if (cont == 1) {
                    validInput = true; // continue loop
                } else if (cont == 2) {
                    keepGoing = false;
                    validInput = true;
                    System.out.println("Thanks for using the calculator!");
                } else {
                    System.out.println("Invalid option! Wrong choice.");
                }
            }
        }
        sc.close();
    }
}
