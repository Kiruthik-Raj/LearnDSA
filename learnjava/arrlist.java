import java.util.ArrayList;

public class arrlist {
    public static void main(String args[])
    {
        ArrayList<Integer> mylist= new ArrayList<>();
        mylist.add(10);
        mylist.add(20);
        mylist.add(30);

        System.out.println(mylist);
        
        mylist.add(2,50);
        System.out.println(mylist.size());

        System.out.println(mylist);
        
        mylist.set(0, 4);
        System.out.println(mylist.size());
        
        System.out.println(mylist);
        
        System.out.println(mylist.size());
        System.out.println(mylist.get(3));
        
        mylist.remove(1);
        System.out.println(mylist);

        System.out.println(mylist.size());

        System.out.println(mylist.toString());
    }
}
