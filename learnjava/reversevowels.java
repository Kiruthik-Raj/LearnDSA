import java.util.Scanner;

public class reversevowels {
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string whose vowels you want to reverse: ");
        String s = sc.nextLine();

        int n = s.length();

        int i = 0;
        int j = n - 1;

        char[] charr = s.toCharArray();

        while(i<j)
        {
            while((charr[i] != 'a' && charr[i] != 'e' && charr[i] != 'i' && charr[i] != 'o' && charr[i] != 'u'))
            {
                i++;
            }
            while((charr[j] != 'a' && charr[j] != 'e' && charr[j] != 'i' && charr[j] != 'o' && charr[j] != 'u'))
            {
                j--;
            }

            if(i>=j)
            {
                break;
            }

            char temp = charr[i];
            charr[i] = charr[j];
            charr[j] = temp;

            i++;
            j--;
        }

        for(char c : charr)
        {
            System.out.print(c);
        }

        System.out.print("String after reversing vowels is: " + s);
    }
}
