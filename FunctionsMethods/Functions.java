import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        sum();
    }
    static void sum() {
        int result;
        Scanner in = new Scanner(System.in);
        System.out.println("enter two numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println(result = num1 + num2);

    }
}
