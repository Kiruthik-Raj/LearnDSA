import java.util.*;

public class array {
    public static void main(String args[])
    {
        int[] arr1 = {1,2,3,4,5};

        int[] arr2 = new int[4];

        System.out.println(arr1[3]);

        arr2[2] = 4;

        System.out.println(arr1.length);

        int sum = 0;

        int i = 0;

        for(i = 0;i<arr1.length;i++){
            sum += arr1[i];
        }

        System.out.println("Sum: "+ sum);

    }

}
