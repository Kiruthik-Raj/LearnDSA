import java.util.Scanner;

public class LCM {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int res = 0;
        int i = 1;
        System.out.println("Enter the first number: ");
        int A = sc.nextInt();
        System.out.println("Enter the second number: ");
        int B = sc.nextInt();

        int a = (A > B) ? A : B;

        for(i = a; i <= A*B; i = i + a)
        {
            if((i%A == 0) && (i%B == 0))
            {
                res = i;
                break;
            }

        }

        System.out.println("LCM of " + A+ " and "+ B+ " is : "+ res);
        sc.close();

    }
}
