import java.util.ArrayList;

public class removeprime{
    public static void main(String args[])
    {
        int i = 0;

        ArrayList<Integer> mylist = new ArrayList<>();

        mylist.add(5);
        mylist.add(2);
        mylist.add(13);
        mylist.add(16);
        mylist.add(3);

        System.out.println(mylist);

        for(i = mylist.size() - 1;i>=0;i--)
        {
            int num = mylist.get(i);
            boolean isprime = true;

            if(isPrime(isprime, num))
            {
                mylist.remove(i);
            }
        }

        System.out.println("List after removing the prime numbers: ");
        System.out.println(mylist);
    }

    static boolean isPrime(boolean x, int a)
    {
        int i = 0;

        if(a <= 1)
        {
            x = false;
            
        }
        else{
            for(i = 2;i<a;i++)
            {
                if(a % i == 0)
                {
                    x = false;
                    break;
                }
            }
        }

        return x;
    }
}