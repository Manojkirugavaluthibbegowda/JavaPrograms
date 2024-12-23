import java.sql.SQLOutput;
import java.util.Scanner;

public class ThreeDigitArmstronNum {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner in =  new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(IsArmstrong(num));
    }
    static boolean IsArmstrong(int num) {
        int n = num;
        int sum = 0;
        while(n > 0){
            int rem = n % 10;
            sum += rem * rem * rem;
            n /= 10;
        }
        return num == sum;
    }

}
