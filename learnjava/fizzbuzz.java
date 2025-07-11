import java.util.ArrayList;
import java.util.Scanner;

public class fizzbuzz {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements: ");
        int n = sc.nextInt();

        ArrayList<String> result = fizzbuz(n);

        System.out.println(result);

    }

    public static ArrayList<String> fizzbuz (int n)
    {
        ArrayList<String> res = new ArrayList<>();
        int i = 0;
        res.add(0,"0");
        for(i = 1;i<n;i++)
        {
            if(i % 3 == 0 &&  i % 5 == 0)
            {
                res.add("FizzBuzz");
            }
            else if(i % 3 == 0)
            {
                res.add( "Fizz");
            }
            else if(i % 5 == 0)
            {
                res.add("Buzz");
            }
            else
            {
                res.add(i + "");
            }
        }
        return res;
    }
}
