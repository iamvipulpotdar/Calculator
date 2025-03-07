import java.util.Scanner;

public class Subtraction {
    static Scanner sc = new Scanner(System.in);
    public static double sub(){
        System.out.println("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter second number: ");
        double num2 = sc.nextDouble();
        return num1 - num2;
    }
}