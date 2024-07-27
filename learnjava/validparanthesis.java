
import java.util.Scanner;

public class validparanthesis {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int squareopencount = 0, squareclosecount = 0, curlyopencount = 0, curlyclosecount = 0, normalopencount = 0, normalclosecount = 0;

        System.out.println("Enter the expression: \n");

        String inputstr = sc.nextLine();

        boolean result = true;

        int i = 0;

        //a big ass if else nested inside a for loop for expression validation, with count increments for each variable declared above

        for(i = 0;i<inputstr.length();i++)
        {
            if(inputstr.charAt(i) == '[')
            {
                squareopencount += 1;
            }
            else if(inputstr.charAt(i) == ']')
            {
                squareclosecount += 1;
            }
            else if(inputstr.charAt(i) == '{')
            {
                curlyopencount += 1;
            }
            else if(inputstr.charAt(i) == '}')
            {
                curlyclosecount += 1;
            }
            else if(inputstr.charAt(i) == '(')
            {
                normalopencount += 1;
            }
            else if(inputstr.charAt(i) == ')')
            {
                normalclosecount += 1;
            }
        }

        //a small if loop to check if the parantheses are balanced 

        if((squareopencount != squareclosecount) || (curlyopencount != curlyclosecount)  || (normalopencount != normalclosecount))
        {
            result = false;
        }

        //return the result

        System.out.println("Does the input string contain valid parantheses? " + result);
    }
}
