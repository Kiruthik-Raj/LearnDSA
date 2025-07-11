import java.util.Scanner;
import java.util.*;

public class armstrongnumber {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int res = 0;
        int sum = 0;
        int checksum = 0;
        int power = 0;

        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        int copy = num;

        while(num != 0)
        {
            sum = num % 10;
            power += 1;
            num /= 10;
        }


        System.out.println(power);

        num = copy;

        while(num != 0)
        {
            sum = num % 10;
            checksum = checksum + (int)Math.pow(sum, power);
            num /= 10;

        }

        if(checksum == copy)
        {
            System.out.println("Armstrong number!!");
        }
        else{
            System.out.println("Not a armstrong number!!");
        }



    }
}
