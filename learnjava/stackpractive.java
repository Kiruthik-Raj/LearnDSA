package learnjava;

import java.util.Scanner;
import java.util.Stack;
public class stackpractive {

    public static void main(String[] args)
    {
        Stack<Integer> stack = new Stack<Integer>();
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Search");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");

            int choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.println("Enter the element to be pushed: ");
                    int val = sc.nextInt();
                    stack.push(val);

                case 2:
                    System.out.println("Popping element: "+ stack.pop());
            }
        }
    }
}
