import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        IsPrime(num);
        System.out.println(IsPrime(num));
    }

    static boolean IsPrime(int n){
        if(n<=1){
            return false;
        }
        int c = 2;
        while(c*c <= n){
            if(n%c == 0){
                return false;
            }
            c++;
        }
        return c*c > n;
    }
}
