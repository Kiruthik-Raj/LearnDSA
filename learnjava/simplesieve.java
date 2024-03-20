package learnjava;
import java.util.Scanner;
public class simplesieve {
    static void sievesolution(int n){
        boolean prime[] = new boolean[n+1];
        for(int i =2; i<n;i++)
        {
            if(prime[i] == false)
            {
                for(int j = i*i;j<n;j+=i)
                {
                    prime[j] = true;
                }
            }
        }

        for(int i = 2; i<n;i++)
        {
            if(prime[i] == false)
            {
                System.out.println(i);
            }
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();

        sievesolution(n);
        sc.close();
    }
}
