

import java.util.Scanner;

import java.util.Arrays;



public class fizzbuzz {

    public void fizzbuzzmethod(int count){
        int i = 0;
        int arr[] = new int[count];

        for(i = 0;i<count;i++)
        {
            arr[i] = i + 1;
        }
        
        String[] resarr = new String[count];
        for(i = 0;i<count;i++)
        {
            if(arr[i]%3 == 0)
            {
                resarr[i] = "Fizz";
            }
            else if(arr[i]%5 == 0)
            {
                resarr[i] = "Buzz";

            }
            else if(arr[i]%3 == 0 && arr[i]%5 == 0)
            {
                resarr[i] = "FizzBuzz";
            }
            else
            {
                resarr[i] = Integer.toString(i);
            }
        }

        String result = Arrays.toString(resarr);

        System.out.println(result);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: \n");
        int n = sc.nextInt();

        fizzbuzz obj = new fizzbuzz();
        obj.fizzbuzzmethod(n);


    }
}
