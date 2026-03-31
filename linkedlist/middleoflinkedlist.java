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

public class middleoflinkedlist {
    public static void main(String[]args)
    {
Node head=create();
Node node=middle(head);
if(node!=null)
{
System.out.println(node.data);
}
    }
    static Node middle(Node head)
    { if(head==null)return null;
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
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
        }
