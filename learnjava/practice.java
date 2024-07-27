
import java.util.Scanner;

public class practice {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String word = sc.nextLine();
        String revword = new StringBuilder(word).reverse().toString();
        if(revword.equals(word))
        {
            System.out.println("Palindrome found!!");
        }
        else
        {
            System.out.println("Not a palindrome!");
        }
        sc.close();

        StringBuilder str = new StringBuilder(word);
        str.setCharAt(3, 'r');

        System.out.println(str);

        int numone = 500;
        int numtwo = 8;
        int divresult=  numone / numtwo;

        System.out.println("Division result: " + divresult);
    }
}
