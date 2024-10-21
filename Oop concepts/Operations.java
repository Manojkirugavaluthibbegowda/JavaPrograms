import java.util.Arrays;
import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = in.nextInt();
        System.out.println("Enteer the array elements: ");
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = in.nextInt();
        }
        ArrayOperations INN = new ArrayOperations(numbers);
        System.out.println("The minimum value is: " + INN.minimum(numbers));
        System.out.println("The average is: " + INN.Average(numbers));
        System.out.println("The array elements are: " + Arrays.toString(numbers));
    }
}

class ArrayOperations{
    int[] array;

   ArrayOperations (int[] newArray){
        array = newArray;
    }

    int minimum(int[] Numbers){
       int min= array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
    int Average(int[] numm){
       int avg = 0;
        for (int i = 0; i < array.length; i++) {
            avg += array[i];
        }
        avg = avg/array.length;
        return avg;
    }
}