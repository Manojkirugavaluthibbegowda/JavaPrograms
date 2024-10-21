import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] num = {34, 7, 23, 32, 5, 62, 15, 89, 48, 11, 98, 142};
        //Maximum M1 = new Maximum();
        Maximum MAX = new Maximum(num);
        System.out.println("Greatest Number:" + MAX.Greater());

        System.out.println(Arrays.toString(num));
    }
}


class Maximum {
    int[] Num;

    Maximum()
    {
        System.out.println("Empty Constructor");
    }

    Maximum(int[] um){
        Num = new int[um.length];
        Num = um;
    }

    int Greater()
    {
        int result = 0;
        for(int i=0;i<Num.length;i++)
        {
            if(Num[i]>result)
                result = Num[i];
        }

        Num[0]=0;

        //System.out.println(Arrays.toString(Num));

        return result;
    }

}