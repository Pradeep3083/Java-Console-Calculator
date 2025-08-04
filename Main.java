import java.util.*;

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public double div(int a, int b) {
        if (b == 0) {
            if (a == 0) return 0.0;
            System.out.println("Error: Cannot divide with zero");
            return Double.NaN;
        }
        return (double) a / b;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        while (true) {
            System.out.println("\n--- Calculator Menu ---");
            System.out.println("1. Add");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Choose an option from (1-5): ");
            
            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Exiting Calculator. GoodBye!!");
                break;
            }

            if (choice < 1 || choice > 5) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Result: " + calc.add(num1, num2));
                    break;
                case 2:
                    System.out.println("Result: " + calc.sub(num1, num2));
                    break;
                case 3:
                    System.out.println("Result: " + calc.mul(num1, num2));
                    break;
                case 4:
                    System.out.println("Result: " + calc.div(num1, num2));
                    break;
            }
        }
    }
}
