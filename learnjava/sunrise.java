

import java.util.Scanner;

public class sunrise {
    public static void main(String args[])
    {
        int count = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of buildings: ");

        int n = sc.nextInt();
        int i = 0;
        int[] buildings = new int[n];
        int max = Integer.MIN_VALUE;

        for(i = 0;i<n;i++)
        {
            System.out.println("Enter the " + (i + 1) + " th building's height: ");
            buildings[i] = sc.nextInt();
        }

        for(i = 1;i<n;i++)

        {

            max = buildings[0];
            if((buildings[i] > buildings[0]) && (buildings[i] > buildings[i - 1]))
            {
                count += 1;
                max = buildings[i];
            }
        }

        System.out.println("No of buildings that will see sunrise are: " + count);

    
    }
}
