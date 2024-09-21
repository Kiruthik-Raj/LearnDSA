import java.util.Scanner;

public class arrays {
    public static void printArray(int[] nums)
    {
        System.out.println("Printing an array!!\n");

        for(int r : nums)
        {
            System.out.print(r);
        }

        System.out.print('\n');
    }

    public static int sumofArray(int[] nums)
    {
        System.out.println("Sum of array elements!!\n");

        int sum = 0;

        for(int i : nums)
        {
            sum += i;
        }

        return sum;
    }

    public static int maxofArray(int[] nums)
    {
        System.out.println("Max of array elements!\n");

        int result = Integer.MIN_VALUE;

        for(int i : nums)
        {
            if (i > result) {
                result = i;
            }
        }

        return result;
    }

    public static int minofArray(int[] nums)
    {
        System.out.println("Minimum of array elements!!\n");

        int result = Integer.MAX_VALUE;

        for (int i : nums)
        {
            if(i < result)
            {
                result = i;
            }
        }

        return result;
    }

    public static int[] reverseofArray(int[] nums)
    {
        System.out.println("Reverse of array elements!!\n");

        int n = nums.length;

        int i = 0 , j = n - 1;

        int temp = 0;

        while(i < j)
        {
            temp = nums[i];

            nums[i] = nums[j];

            nums[j] = temp;

            i++;
            j--;
        }

        return nums;
    }

    public static void subArrays(int[] nums)
    {
        System.out.println("Subarrays of array!!\n");

        int i = 0, j = 0;

        int n = nums.length;

        for(i = 0;i<n;i++)
        {
            for(j = i;j<n;j++)
            {
                System.out.print(nums[j] + " ");
            }
            System.out.println('\n');
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[5];

        System.out.println("Printing empty array: ");

        printArray(num);

        int[] nums = {4,5,6,7,8};

        printArray(nums);

        int result = sumofArray(nums);

        System.out.println(result);

        int[] nums2 = {3,6,546,8,54,36};

        int max = maxofArray(nums2);

        System.out.println(max);

        int[] nums3 = {56,7,43,6,9,54,63,73};

        int min = minofArray(nums3);

        System.out.println(min);

        int[] nums4 = {3,5,2,8,9,7,1};

        int[] revarr = reverseofArray(nums4);

        printArray(revarr);

        int[] nums5 = {5,8,2,7,6};

        subArrays(nums5);

    }
}