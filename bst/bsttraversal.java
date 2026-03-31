import java.util.*;
class Node
{
    int val;
    Node left;
    Node right;
    Node(int data)
    {
        val=data;
        left=right=null;
    }
}
public class bsttraversal {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        Node root = null;

        System.out.println("Enter number of nodes:");
        int n = sc.nextInt();

        System.out.println("Enter values:");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            root = insert(root, val);
        }
System.out.println("InOrder Traversal");
inorder(root);
System.out.println("\nPreorder Traversal:");
preorder(root);

System.out.println("\nPostorder Traversal:");
postorder(root);
   }
    public static Node insert(Node root,int val)
   {
    if(root==null)
    {
        return new Node(val);
    }
    if(val<root.val)
    {
        root.left=insert(root.left,val);
    }
     if(val>root.val)
    {
        root.right=insert(root.right,val);
    }
    return root;

   }
   public static void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }
    public static void preorder(Node root) {
    if (root == null) return;

    System.out.print(root.val + " "); 
    preorder(root.left);             
    preorder(root.right);            
}
public static void postorder(Node root) {
    if (root == null) return;

    postorder(root.left);            
    postorder(root.right);          
    System.out.print(root.val + " "); 
}
}
