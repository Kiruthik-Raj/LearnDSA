package learnjava;

import java.util.*;

public class twosum {

    static int[] TwoSum(int[] nums, int target)
    {
        Map<Integer, Integer> map = new HashMap<>();

        int[] res = new int[nums.length];

        for(int i = 0;i<nums.length;i++)
        {
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                res = new int[] {(map.get(complement)),i};
            }

            map.put(nums[i],i);
        }

        return res;

    }

    
    public static void main(String args[])
    {
       int[] arr = {2,7,11,15};
       int target = 9;
       int[] result = TwoSum(arr,target);
       System.out.println("Result is: " + Arrays.toString(result));
    }
}
