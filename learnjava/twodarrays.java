import java.util.Scanner;

public class twodarrays {

    public static int[][] transpose(int[][] nums)
    {
        int temp = 0;
        int i = 0, j = 0;

        for(i = 0;i<nums.length;i++)
        {
            for(j = 0;j<i;j++)
            {
                temp = nums[i][j];

                nums[i][j] = nums[j][i];

                nums[j][i] = temp;
            }
        }
        
        return nums;
    }

    public static int[][] rotate90(int[][] nums)
    {
        System.out.println("90 deg rotation of array!!");
        
        int[][] res = new int[nums.length][nums[0].length];

        int i = 0, j = 0;

        nums = transpose(nums);

        for(i = 0;i<nums.length;i++)
        {
            for(j = nums[0].length - 1;j>=0;j--)
            {
                res[i][j] = nums[i][nums[0].length - j - 1];
            }
        }

        return res;

    }


    public static void printArray(int[][] nums)
    {
        int i = 0, j = 0;
        
        for(i = 0;i<nums.length;i++)
        {
            for(j = 0;j<nums[0].length;j++)
            {
                System.out.print(nums[i][j]);
            }
            System.out.println('\n');
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of rows: ");
        int n = sc.nextInt();

        int i = 0, j = 0;

        System.out.println("Enter no of columns: ");

        int m = sc.nextInt();

        int[][] newarr = new int[n][m];

        System.out.println("Enter the array elements: ");

        for(i = 0;i<n;i++)
        {
            for(j = 0;j<m;j++)
            {
                newarr[i][j] = sc.nextInt();
            }
        }

        //row wise traversal

        System.out.println("Row wise traversal!!");

        for(i = 0;i<n;i++)
        {
            for(j = 0;j<newarr[0].length;j++)
            {
                System.out.print(newarr[i][j]);
            }
        }

        System.out.println('\n');

        //columnwise traversal

        System.out.println("Column wise traversal!!");


        for(i = 0;i<n;i++)
        {
            for(j = 0;j<newarr[0].length;j++)
            {
                System.out.print(newarr[j][i]);
            }

        }

        System.out.println("\n");

        int[][] nums = {{1,2,3}, {4,5,6} , {7,8,9}};

        printArray(nums);

        int[][] res = rotate90(nums);

        printArray(res);

        

    }
}
