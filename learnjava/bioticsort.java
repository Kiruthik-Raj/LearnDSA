

import java.util.Scanner;





class Node{
    int data;
    Node prev;
    Node next;

    public Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class ll{
    Node head;
    public void insert(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
        }
        else{
            Node temp = head;
            while(temp.next!=null)
            {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    public void sort()
    {
        Node start = null;
        Node temp = head;
        Node end = null;
        ll sortedlist = new ll();
        start = temp;
        while(temp.next!=null)
        {
            temp = temp.next;
        }
        if(temp.next == null)
        {
            end = temp;
        }

        while(start!=end)
        {
            if(start.data > end.data)
            {
                sortedlist.insert(end.data);
                end = end.prev;
            }
            else{
                sortedlist.insert(start.data);
                start = start.next;
            }
        }

        sortedlist.traverse();

    }

    public void traverse()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}





public class bioticsort {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int i = 0;
        System.out.println("Enter the number of elements you want to be in the linked list: \n");
        n = sc.nextInt();
        ll linklist = new ll();
        for(i = 0;i<n;i++)
        {
            System.out.println("Enter the " + (i +  1) + " th element: \n");
            int val = sc.nextInt();
            linklist.insert(val);
        }

        System.out.println("\nThe Sorted Linked List is :\n");

        linklist.sort();


    }

}
