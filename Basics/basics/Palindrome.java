public class Palindrome {
    public static void main(String[] args) {
        int n = 123454321;
        int original = n;
        int result= 0;
        while (n > 0){
            int rem = n % 10;
            n = n/10;
            result = result * 10 + rem;
        }
        if(original==result){
            System.out.println("Its a palindrome number");
        }
        else{
            System.out.println("No its not a palindrome number");
        }
    }
}
