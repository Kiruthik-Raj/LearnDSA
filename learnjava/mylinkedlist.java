import java.util.Scanner;

class myNode{
    int data;
    myNode next;

    public myNode(int val)
    {
        this.data = val;
    }
}

class myll{
    myNode head;

    public void insert(int data)
    {
        myNode temp = head;

        myNode newNode = new myNode(data);

        if(head == null)
        {
            head = newNode;
        }
        else{
            while(temp.next!=null)
            {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void insertAtStart(int data)
    {

        myNode newNode = new myNode(data);

        if(head == null)
        {
            head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertAtIndex(int data, int index)
    {
        myNode temp = head;

        myNode newNode = new myNode(data);

        for(int i = 0;i<index - 1;i++)
        {
            temp = temp.next;
        }

        myNode tempp1 = temp.next;

        temp.next = newNode;

        newNode.next = tempp1;

    }

    public void removeFirst()
    {
        myNode temp = head;

        if(head == null)
        {
            return;
        }
        else
        {
            temp = temp.next;
            head = temp;
        }
    }

    public void removeLast()
    {
        myNode temp = head;

        if(head == null)
        {
            return;
        }
        else
        {
            while(temp.next.next!=null)
            {
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    public void removeAtindex(int index)
    {
        myNode temp = head;

        for(int i = 0;i<index - 1;i++)
        {
            temp = temp.next;
        }

        myNode tempp1 = temp.next.next;

        temp.next = tempp1;
    }

    public void length()
    {
        myNode temp = head;
        int count = 0;

        while(temp!=null)
        {
            temp = temp.next;
            count += 1;
        }

        System.out.println("Length of linked list: " + count);
    }

    public void search(int val)
    {
        myNode temp = head;

        boolean res = false;

        while(temp!=null)
        {
            if(temp.data==val)
            {
                res = true;
            }
            temp = temp.next;
        }


        System.out.println(res);
    }

    public void mdiofll()
    {
        myNode slow = head.next;

        myNode fast = head.next.next;

        while(slow!=null && fast!=null)
        {
            slow =  slow.next;
            fast = fast.next.next;
        }

        System.out.println("Mid of the linked list is: " + slow.data);


    }

    public void traverse()
    {
        myNode temp = head;

        while(temp!=null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

public class mylinkedlist {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        myll LinkedList = new myll();
        int i = 0;
        int data = 0;
        System.out.println("Enter the number of elements you want to insert in the linked list: ");
        int n = sc.nextInt();

        for(i = 0;i<n;i++)
        {
            System.out.println("Enter the  " + (i + 1) + "th element: ");
            data = sc.nextInt();
            LinkedList.insert(data);
        }

        System.out.println("Nodes inserted in the linked list!");

        LinkedList.traverse();

        System.out.println("Enter the number you want to insert : ");

        int val = sc.nextInt();

        System.out.println("Enter the index in which you want to insert the data: ");

        int idx = sc.nextInt();

        LinkedList.insertAtIndex(val, idx);

        System.out.println("Linked List after insertion of node " + val + " at " + idx + " index is ");

        LinkedList.traverse();

        System.out.println("Remove First!!!");

        LinkedList.removeFirst();

        LinkedList.traverse();

        System.out.println("Remove Last!!!");

        LinkedList.removeLast();

        LinkedList.traverse();

        System.out.println("Enter the index of the element you want to remove: ");

        int remidx = sc.nextInt();

        LinkedList.removeAtindex(remidx);

        LinkedList.traverse();

        LinkedList.length();

        System.out.println("Enter the element you want to search: ");

        int unknown = sc.nextInt();

        LinkedList.search(unknown);

        LinkedList.mdiofll();


    }
}
