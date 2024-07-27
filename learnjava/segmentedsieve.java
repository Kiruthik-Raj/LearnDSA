
import java.util.*;
public class segmentedsieve {
    static void segsievesolution(int n, int m){
        boolean prime[] = new boolean[n+1];
        for(int i =m; i<n;i++)
        {
            if(prime[i] == false)
            {
                for(int j = i*i;j<n;j+=i)
                {
                    prime[j] = true;
                }
            }
        }

        for(int i = m; i<n;i++)
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
        System.out.println("Enter value of m: ");
        int m = sc.nextInt();
        sc.close();
        segsievesolution(n,m);
    }
}
