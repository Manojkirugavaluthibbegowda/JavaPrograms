public class ReverseNum {
    public static void main(String[] args) {
        int n = 123727127;
        int result= 0;
        while (n > 0){
            int rem = n % 10;
            n = n/10;
            result = result * 10 + rem;
        }
        System.out.println(result);
    }

}
