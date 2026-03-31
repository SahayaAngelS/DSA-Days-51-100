import java.util.*;
class Node
{ int data;
    Node next;
    Node(int val)
    {
        this.data=val;
        this.next=null;
    }
}

public class removenthnodefromlast {
    static Node remove(Node head,int n)
    {
Node dummy=new Node(0);
dummy.next=head;
Node slow=dummy;
Node fast=dummy;
for(int i=0;i<n;i++)
{
    fast=fast.next;
}
while(fast.next!=null)
{
    slow=slow.next;
    fast=fast.next;
}
slow.next=slow.next.next;
return dummy.next;
    }
    private static void print(Node head)
{
    Node temp=head;
    while(temp!=null)
    {
        System.out.print(temp.data+"->");
        temp=temp.next;

    }
    System.out.println("null");

}
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(6);
        int n=5;
        Node ans=remove(head,n);
        print(ans);
    }
    
}
