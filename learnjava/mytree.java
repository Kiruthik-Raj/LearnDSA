import java.util.Scanner;

class TreeNode
{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val)
    {
        this.val = val;
        this.left = null;
        this.right = null;
    }

}

class MyBinaryTree{
    TreeNode root;

    void insert(int data)
    {
        TreeNode newNode = new TreeNode(data);

        if(root == null)
        {
            root  = newNode;
        }

        TreeNode current = root;

        TreeNode parent =  null;

        while(current!=null){
            parent = current;
            if(current.val  > data)
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

    void inOrderTraversal(TreeNode  root)
    {
        System.out.println("Printing the tree. ");

        if(root == null)
        {
            System.out.println("Empty tree!!!");
        }

        if(root != null)
        {
            
            root = root.left;
            System.out.println(root.val);
            root = root.right;
        }
    }
}

public class mytree {
    public static void main(String args[])
    {
        System.out.println("Tree in Java!!!");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of nodes you want to insert into the tree: ");

        int n = sc.nextInt();

        MyBinaryTree newTree = new MyBinaryTree();

        int i = 0;

        for(i = 0;i<n;i++)
        {
            System.out.println("Enter the  " + (i +  1) + " th element: ");
            int data = sc.nextInt();
            newTree.insert(data);
        }

        newTree.inOrderTraversal(newTree.root);

    }
}
