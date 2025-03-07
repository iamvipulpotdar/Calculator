import java.util.Scanner;

public class Multiplication {
    static Scanner sc = new Scanner(System.in);
    public static double multiply(){
        System.out.println("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter second number: ");
        double num2 = sc.nextDouble();
        return num1 * num2;
    }
}