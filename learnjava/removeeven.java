import java.util.ArrayList;

public class removeeven {
    public static void main(String args[])
    {
        ArrayList<Integer> mylist = new ArrayList<>();

        mylist.add(5);
        mylist.add(10);
        mylist.add(4);
        mylist.add(15);
        mylist.add(8);
        mylist.add(21);
        mylist.add(3);
        mylist.add(2);


        int i = 0;

        for(i = mylist.size() - 1;i>=0;i--)
        {
            if(mylist.get(i) % 2 == 0)
            {
                mylist.remove(i);
            }
        }

        System.out.println(mylist);
    }
}
