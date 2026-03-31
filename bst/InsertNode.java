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
public class InsertNode
{
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
}