


public class towerofhanoi {
    static void towerofhanoi(int n, char fromrod, char  torod, char auxrod)
    {
        if (n == 1)
        {
            System.out.println("Move disk " + (n) + " from " + fromrod + " to " + torod);

            return;
        }

        towerofhanoi(n - 1, fromrod, auxrod, torod);
        System.out.println("Move disk " + n + " from " + fromrod + " to " + auxrod);
        towerofhanoi(n - 1, auxrod, torod, fromrod);
    }

    public static void main(String args[])
    {
        int n = 4;
        towerofhanoi(n, 'A', 'B', 'C');
    }
}
