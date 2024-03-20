package learnjava;

import java.util.Scanner;

class Stack{
    int arr[];
    int top;
    public Stack(int size)
    {
        arr = new int[size];
        top = -1;
    }

    public void push(int data)
    {
        if(top == arr.length - 1)
        {
            System.out.println("Stack OverFlow");
        }
        else
        {
            arr[top+1] = data;
        }
    }

    public void peek()
    {
        if(top == -1)
        {
            System.out.println("Empty Stack!");
        }
        else{
            System.out.println(arr[top]);
        }
    }

    public void pop()
    {
        if(top == -1)
        {
            System.out.println("Stack Underflow!");
        }
        else{
            System.out.println(arr[top--]);
        }
    }

    public void isEmpty()
    {
        boolean res = true;
        if(top == -1)
        {
            res = true;
        }

        else{
            res = false;
        }

        System.out.println(res);
    }

    public void display()
    {
        int j = 0;
        for(j = 0;j<arr.length;j++)
        {
            System.out.println(arr[j]);
        }
    }

    public void returnSize()
    {
        System.out.println(top++);
    }

}

public class stackprogram {
    public static void main(String args[])
    {
        Stack myStack = new Stack(6);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to enter in the stack");
        int data = sc.nextInt();

        int i = 0;
        for(i = 0;i<data;i++)
        {
            int val = sc.nextInt();
            myStack.push(val);
        }


        System.out.println("Printing the Stack");
        myStack.display();
        myStack.returnSize();
        myStack.pop();
        System.out.println("Printing the Stack after pop operation!");
        myStack.display();
        myStack.returnSize();
        myStack.isEmpty();

    }
}
