import java.util.Scanner;

public class singlenumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] nums = {1,2,3,4,6,1,2,3,4};

        int res = singlenum(nums);

        System.out.println(res + " is the single number. ");
    }

    public static int singlenum(int[] nums)
    {
        int res = 0;

        for(int num : nums)
        {
            res = res ^ num;
        }
        return res;
    }
}
