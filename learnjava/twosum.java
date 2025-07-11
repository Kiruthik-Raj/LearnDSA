import java.util.*;

public class twosum {

    public static int[] TwoSum(int[] arr, int target)
    {
        Map<Integer, Integer> mymap = new HashMap<>();

        int i = 0;
        for(i = 0;i<arr.length;i++)
        {
            int complement = target  - arr[i];
            if(mymap.containsKey(complement))
            {
                return new int[] {mymap.get(complement), i};
            }
            mymap.put(arr[i], i);
        }

        return new int[]{};
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n , i= 0;
        System.out.println("Enter no of elements: ");
        n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements: ");
        for(i = 0;i<n;i++)
        {
            System.out.println("Enter the " + (i + 1) + " th element: ");

            arr[i] = sc.nextInt();

        }

        System.out.println("Enter the target: ");
        int target = sc.nextInt();


        sc.close();

        int[] res = TwoSum(arr, target);

        if(res.length == 0)
        {
            System.out.println(-1);
        }
        else{
            System.out.print(Arrays.toString(res));
        }

    }
}
