import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.print("Enter a number to calculate the factorial : ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int result = 1;
        for (int i = num; i > 1; i--) {
            result *= i;
        }
        System.out.println("The factorial of " + num + " is " + result);
    }
}
