

import java.util.Scanner;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class ll{
    Node head;

    public void insert(int data){
        if (head == null){
            Node newNode = new Node(data);
            head = newNode;
        }
        else{
            Node temp = head;
            while(temp!=null && temp.next != null){
                temp = temp.next;
            }
            Node newNode = new Node(data);
            temp.next = newNode;
        }
    }

    public void traverse(){
        Node temp = head;
        while(temp != null && temp.next != null)
        {
            System.out.println(temp.data + " -> ");
            temp = temp.next;
        }
    }

    public void detectLoop(){
        Node slow = head;
        Node fast = head;

        while(slow!=null && fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;

            boolean result = true;

            if(slow == fast){
                System.out.println(result);
            }
            else{
                result = false;
                System.out.println(result);
            }
        }



    }
}


public class loopdetection {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements you want to push in the linked list: ");
        int n = sc.nextInt();
        int i = 0;

        ll Linkedlist = new ll();

        for(i = 0;i<n;i++)
        {
            System.out.println("Enter the " + (i+1) + "th element: ");
            int val = sc.nextInt();
            Linkedlist.insert(val);
        }

        Linkedlist.traverse();

        Linkedlist.detectLoop();


    }
}
