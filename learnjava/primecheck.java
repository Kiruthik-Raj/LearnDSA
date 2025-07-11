import java.util.Scanner;

public class primecheck {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int flag = 0;
        int i = 0;


        if (num == 0 || num == 1)
        {
            flag = 1;
        }
        else{
            for(i = 2 ; i <= num /2; i++)
            {
                if(num % i == 0)
                {
                    flag = 1;
                    break;
                }
            }
        }

        if(flag == 1)
        {
            System.out.println("Not a prime number");

        }

        else{
            System.out.println("Prime number");
        }

    }
}
