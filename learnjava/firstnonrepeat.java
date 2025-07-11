import java.util.*;

public class firstnonrepeat {
    public static char firstNonRepeatChar(String str)
    {
        Map <Character, Integer> myMap = new LinkedHashMap<>();

        for(char c : str.toCharArray())
        {
            myMap.put(c, myMap.getOrDefault(c,0) + 1);
        }

        for(Map.Entry<Character, Integer> entry : myMap.entrySet())
        {
            if(entry.getValue() == 1)
            {
                return entry.getKey();
            }
        }
        return '-';
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String str = sc.nextLine();


        char result = firstNonRepeatChar(str);
        System.out.println(result);

    }
}
