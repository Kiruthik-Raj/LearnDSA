import java.util.Scanner;

public class fibonacci
{

    public static int fibonacciseries(int n)
    {
        if(n == 0)
        {
            return 0;
        }
        else if(n == 1)
        {
            return 1;
        }
        else
        {
            return fibonacciseries(n - 1) + fibonacciseries(n - 2);
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int res[] = new int[n];
        for(int i = 0;i<n;i++)
        {
            res[i] = fibonacciseries(i);

        }

        for(int j : res)
        {
            System.out.print(j + " ");
        }

        sc.close();



    }
}