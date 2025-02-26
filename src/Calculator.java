import java.util.Scanner;

public class Calculator {
    static Scanner sc = new Scanner(System.in);

    public static void showMenu(){
        System.out.println("-------Calculator--------");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
    }
    public static double add(){
        System.out.println("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter second number: ");
        double num2 = sc.nextDouble();
        return num1 + num2;
    }

    public static double sub(){
        System.out.println("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter second number: ");
        double num2 = sc.nextDouble();
        return num1 - num2;
    }
    public static double multiply(){
        System.out.println("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter second number: ");
        double num2 = sc.nextDouble();
        return num1 * num2;
    }
    public static double divide(){
        System.out.println("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter second number");
        double num2 = sc.nextDouble();

        if(num2==0) {
            System.out.println("Error: Division by zero not allowed.");
            return Double.NaN;
        }
        return num1/num2;
    }
    public static void doCalculation(int input){
        double result = 0;
        boolean validOperation = true;

        switch (input){
            case 1:
                result = add();
                break;
            case 2:
                result = sub();
                break;
            case 3:
                result = multiply();
                break;
            case 4:
                result = divide();
                break;
            case 5:
                System.out.println("Closing Calculator....");
                return;
            default:
                System.out.println("Invalid choice! Enter choice between 1 to 5.");
                validOperation = false;
        }
        if(validOperation){
            System.out.println("Result: " +result);
        }

    }
    public static void main(String[] args) {
        while (true){
            showMenu();
            int input = sc.nextInt();
            if(input==5)
                break;
            doCalculation(input);
        }
        sc.close();
    }
}