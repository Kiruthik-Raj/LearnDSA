import java.util.Scanner;

public class uppertolower {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();

        char[] charr = s.toCharArray();

        int i = 0;

        for(i = 0;i<charr.length;i++)
        {
            if(charr[i]>='A' && charr[i]<='Z')
            {
                char res = (char)(charr[i]-'A' + 'a');
                charr[i] = res;
            }
        }

        for(char ch : charr)
        {
            System.out.print(ch);
        }

    }
}
