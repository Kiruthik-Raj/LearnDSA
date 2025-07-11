import java.util.*;

public class digitcount{
    public static void main(String args[])
    {
        int num = 43256;
        int copynum = num;
        int displayint = 0;
        int res = 0;

        while(copynum > 0)
        {
            displayint = copynum % 10;
            System.out.println(displayint);
            copynum /= 10;
            res += 1;
        }

        System.out.println(res);


    }
}