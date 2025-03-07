import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            Menu.showMenu();
            int input = sc.nextInt();

            if (input == 5) {
                System.out.println("Closing Calculator...");
                break;
            }

            double result = 0;
            boolean validOperation = true;

            switch (input) {
                case 1:
                    result = Addition.add();
                    break;
                case 2:
                    result = Subtraction.sub();
                    break;
                case 3:
                    result = Multiplication.multiply();
                    break;
                case 4:
                    result = Division.divide();
                    break;
                default:
                    System.out.println("Invalid choice! Enter choice between 1 to 5.");
                    validOperation = false;
            }

            if (validOperation) {
                System.out.println("Result: " + result);
            }
        }
        sc.close();
    }
}