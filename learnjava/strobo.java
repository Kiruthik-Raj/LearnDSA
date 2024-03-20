package learnjava;
import java.util.*;
public class strobo {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String target = sc.nextLine();
        System.out.println("Enter the number: ");

        if(isStrobogrammatic(target))
        {
            System.out.println(target + "is a strobo number!!");
        }

        else
        {
            System.out.println(target + "is not a strobo number");
        }

        sc.close();

        
    }

    public static boolean isStrobogrammatic(String num)
    {
        Map<Character, Character> Strobodict= new HashMap<>();
        Strobodict.put('0','0');
        Strobodict.put('1','1');
        Strobodict.put('6','9');
        Strobodict.put('8','8');
        Strobodict.put('9','6');


        int n = num.length();
        for(int i= 0, j= n-1; i<=j; i++, j--)
        {
            char digit_left = num.charAt(i);
            char digit_right = num.charAt(j);
            char mapping = Strobodict.getOrDefault(digit_left, '-');
            if(mapping == '-'){
            return false;
            }
            if(mapping != digit_right){
            return false;
            }
            }
            return true;
        }

    }