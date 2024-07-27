
import java.util.Scanner;


//creating a class to declare the node structure
class Node{
    int data;
    Node next;

//constructor to assign values to variables in the node
    public Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}


//class containing the methods to be performed on the linked list created
class ll {
    Node head;

    public void insert(int data)
    {
        Node newNode = new Node(data);

        //check whether linked list is empty or not
        if(head == null)
        {
            head = newNode;
        }
        //if note, proceed to insert element in the last
        else{
            Node temp = head;
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newNode;

        }
    }

    public void insertAtStart(int data)
    {
        Node newNode = new Node(data);

        if(head == null)
        {
            head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }
    //methos to traverse through the linked list
    public void traverse()
    {
        Node temp = head;
        //traverse till the end of the linked list, printing all the 
        while(temp != null)
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

    }
}

public class linkedlist{
    public static void main(String[] args)
    {
        ll linklist = new ll();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to insert in the linked list: ");
        int n = sc.nextInt();

        int i = 0;
        //method to take elements as input
        for(i = 0;i<n;i++)
        {
            System.out.println("Enter the " + ( i + 1) + "th element: ");
            int val = sc.nextInt();
            linklist.insert(val);
        }


        System.out.println("Printing the inserted data in the linked list!!");

        linklist.traverse();

    }
}