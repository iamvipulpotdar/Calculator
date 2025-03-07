import java.util.Scanner;

public class Addition {
    static Scanner sc = new Scanner(System.in);
    public static double add(){
        System.out.println("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter second number: ");
        double num2 = sc.nextDouble();
        return num1 + num2;
    }
}