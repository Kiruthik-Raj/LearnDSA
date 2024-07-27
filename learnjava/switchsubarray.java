
import java.util.Scanner;

public class switchsubarray {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements  : ");

        int n = sc.nextInt();
        int i,j,k = 0;

        int[] inputarr = new int[n];

        int[] resarr = new int[n];

        for(i = 0;i<n;i++)
        {
            System.out.println("Enter the " + (i + 1) + " th element of the array: ");
            inputarr[i] = sc.nextInt();
        }


        for(i = 0;i<n;i++)
        {
            System.out.println((i + 1) + " th element is: " + inputarr[i]);
        }


        for(i = 0;i<n;i++)
        {
            if(inputarr[i] == inputarr[i+2] && inputarr[i] % 2 == 0)
            {
                resarr[i] = inputarr[i];
                resarr[i + 2] = inputarr[i+2];
            }
            else
            {
                continue;
            }

            if(i == n-1)
            {
                if(inputarr[i] == inputarr[i - 2])
                {
                    resarr[i] = inputarr[i];
                    resarr[i + 2] = inputarr[i - 2];
                }
            }
        }

        //LOL

       
    }
}
