import java.util.Scanner;

public class transpose {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the row size: ");
        
        int n = sc.nextInt();
        System.out.println("Enter the column size: ");
        int m = sc.nextInt();

        int[][] twodarr = new int[n][m];

        int i = 0;
        int j = 0;
        int temp = 0;

        for(i = 0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                twodarr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Transpose operation on the same array! ");

        for(i = 0;i<n;i++)
        {
            for(j=0;j<i;j++)
            {
                temp = twodarr[i][j];
                twodarr[i][j] = twodarr[j][i];
                twodarr[j][i] = temp;
            }
        }

        System.out.println("Transpose of the array is: ");

        for(i = 0;i<n;i++)
        {
            for(j = 0;j<m;j++)
            {
                System.out.print(twodarr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matrix after 90 deg rotation is: ");

        for(i = 0;i<n;i++)
        {
            int start = 0;
            int end = m - 1;
            while(start < end)
            {
                temp = twodarr[i][start];
                twodarr[i][start] = twodarr[i][end];
                twodarr[i][end] = temp;
                start++;
                end--;
            }
        }


        for(i = 0;i<n;i++)
        {
            for(j = 0;j<m;j++)
            {
                System.out.print(twodarr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
