import java.util.Scanner;

public class Division {
    static Scanner sc = new Scanner(System.in);
    public static double divide(){
        System.out.println("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter second number: ");
        double num2 = sc.nextDouble();

        if (num2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN;
        }
        return num1 / num2;
    }
}