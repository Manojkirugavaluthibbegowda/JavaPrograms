import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args){
        System.out.print("Enter a valid integer: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("The number you Entered is: " + a);
    }
}
