package learnjava;

import java.util.Scanner;

class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class Tree{
    Node root;
    public void insert(int data){

    }

    public void delete(){

    }

    public void display()
    {

    }

    

}


public class bst {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("NUmber is: " + n);

        sc.close();
    }
}