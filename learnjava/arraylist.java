import java.util.*;

public class arraylist {

    public static ArrayList<Integer> removeeven(ArrayList<Integer> nums)
    {
        int i = 0;

        for(i = nums.size() - 1;i>= 0;i--)
        {
            if(nums.get(i) % 2 == 0)
            {
                nums.remove(i);
            }
        }
        
        return nums;
    }
    public static void main(String args[])
    {
        ArrayList<String> str = new ArrayList<>();

        str.add("Ghost ");
        str.add("Of ");
        str.add("Tsushima");

        System.out.println(str);

        str.add(2, "the ");

        System.out.println(str);

        System.out.println(str.get(1));

        str.set(1, "in ");

        System.out.println(str);

        str.remove(2);

        System.out.println(str);

        System.out.println(str.size());

        System.out.println(str.toString());

        str.clear();

        System.out.println(str);

        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(1);
        nums.add(5);
        nums.add(2);
        nums.add(7);
        nums.add(8);
        nums.add(0);
        nums.add(3);
        nums.add(6);
        nums.add(33);
        nums.add(12);
        nums.add(77);
        nums.add(55);
        nums.add(14);

        ArrayList<Integer> res = removeeven(nums);

        System.out.println(nums);
    }
}
