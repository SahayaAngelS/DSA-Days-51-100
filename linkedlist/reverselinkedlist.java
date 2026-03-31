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

    public class reverselinkedlist {
        public static void main(String[] args) {
Node head=create();
print(head);
System.out.println("reversed");
head=reverse(head);
print(head);
        }

            static Node create()
            {
                Scanner sc=new Scanner(System.in);
                Node head=null,tail=null;
                while(true)
                {
                  int  val=sc.nextInt();
                    if(val==-1)
                    {
                        break;
                    }
                    Node newnode=new Node(val);
                    if(head==null )
                    {
                        head=tail=newnode;
                    }
                    else{
                        tail.next=newnode;
                        tail=newnode;

                    }
                }
                    return head;
            }
        
        private static Node reverse(Node head)
        {
            Node prev=null;
            Node curr=head;
            Node safety=null;
            while(curr!=null)
            {
                safety=curr.next;
                curr.next=prev;
                prev=curr;
                curr=safety;

            }
            return prev;
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
    
}
