package learnjava;

import java.util.*;
public class clockshift {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        String binaryString = Integer.toBinaryString(number);
        System.out.println(binaryString);
        String revstring = new StringBuilder(binaryString).reverse().toString();
        if(binaryString.equals(revstring))
        {
            System.out.println("Palindrome!!");
        }
        else{
            System.out.println("Not a palindrome!!");
        }
        sc.close();
    }
}