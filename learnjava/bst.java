
import java.util.Scanner;


class treeNode{
    int data;
    treeNode left;
    treeNode right;

    public treeNode(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class myTree{
    treeNode root;
    public void insert(int data){
        treeNode newNode = new treeNode(data);
        if(root == null)
        {
            root = newNode;
        }

        treeNode current = root;
        treeNode parent = null;

        if(current!=null)
        {
            parent = current;
            if(current.data > data)
            {
                current = current.left;
                if(current == null)
                {
                    parent.left = newNode;
                    parent = parent.left;
                }

            }
            else{
                current = current.right;
                if(current == null)
                {
                    parent.right = newNode;
                    parent = parent.right;
                }
            }
        }
    }

    public void display(treeNode root)
    {
        if(root == null)
        {
            System.out.println("Empty Tree!!!");
        }

        if(root != null)
        {

            System.out.println("Printing the tree");

            System.out.println(root.data);
            root = root.left;

            System.out.println(root.data);

            root = root.right;

        }
    }

    

}


public class bst {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter number of nodes to enter: ");
        int n = sc.nextInt();

        int i = 0;

        myTree newTree = new myTree();

        for(i = 0;i<n;i++){
            System.out.println("Enter the " + (i +  1) + " the element: ");
            int data = sc.nextInt();
            newTree.insert(data);
        }

        newTree.display(newTree.root);



        sc.close();
    }
}