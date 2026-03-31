/*You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.*/



class Node{
    int data;
    Node next;
    Node(int val)
    {
        data=val;
        next=null;
    }

}
public class addtwolist {
    static void print(Node temp)
    {
        Node dup=temp;
        while(dup!=null)
        {
            System.out.print(dup.data+"->");
            dup=dup.next;

        }
         System.out.print("null");
    }
    static Node add(Node l1,Node l2)
    { Node dummy=new Node(0);
        Node curr=dummy;
        int sum=0;
        int carry=0;
        while(l1!=null||l2!=null||carry!=0)
        {
            sum=0;
            if(l1!=null)
            {
                sum+=l1.data;
                l1=l1.next;
            }
            if(l2!=null)
            {
                sum+=l2.data;
                l2=l2.next;
            }
            sum+=carry;
            carry=sum/10;
            Node node =new Node(sum%10);
            curr.next=node;
            curr=curr.next;

        }
        return dummy.next;

    }
    public static void main(String[] args) {
        Node head1=new Node(1);
        head1.next=new Node(2);
        head1.next.next=new Node(6);

         Node head2=new Node(3);
        head2.next=new Node(4);
        head2.next.next=new Node(5);
       Node sol= add(head1,head2);
       print(sol);
    }

}
