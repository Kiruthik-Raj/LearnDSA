
import java.util.Scanner;

public class palindrome {
    public static void main(String args[])
    {
        Scanner sc=  new Scanner(System.in);

        System.out.println("Enter the string whose symbols has to be removed: ");
        String newstr = sc.nextLine();

        newstr.toLowerCase();

        newstr.replaceAll("[/,.,,,$,@,!,~,%,^,*]", " ");

        System.out.print("String after modification is: "+ newstr);
    }
}
