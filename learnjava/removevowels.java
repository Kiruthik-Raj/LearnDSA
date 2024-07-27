import java.util.Scanner;

public class removevowels {
    public static void main(String args[])
    {
        Scanner sc =  new Scanner(System.in);

        //method 1

        System.out.println("Enter the sentence: ");

        String newstr = sc.nextLine();

        int i = 0;

        for(i = 0;i<newstr.length();i++)
        {
            char ch = newstr.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                continue;
            }
            System.out.print(ch);
        }

    }
}
