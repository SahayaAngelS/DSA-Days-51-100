//Problem Statement://
//Given the heads of two linked lists, list1 and list2, where each linked list has its elements sorted in non-decreasing order, merge them into a single sorted linked list and return the head of the merged linked list.//
class Node{
    int data;
    Node next;
    Node(int val)
    {
        data=val;
        next=null;
    }

}
public  class mergesortedlinkedlist
{   static Node merge(Node head1,Node head2)
    {  Node dummy=new Node(-1);
        Node temp=dummy;
        if(head1==null)return head2;
        if(head2==null)return head1;
        while(head1!=null && head2!=null)
        {
            if(head1.data<=head2.data){
                temp.next=head1;
                head1=head1.next;
            }
            else{
                temp.next=head2;
                head2=head2.next;
            }
            temp=temp.next;
        }
        while(head1!=null)
        {
            temp.next=head1;
            head1=head1.next;
        }
        while(head2!=null)
        {
            temp.next=head2;
            head2=head2.next;
        }
        return dummy.next;
       

    }
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
     public static void main(String[] args) {
        Node head1=new Node(1);
        head1.next=new Node(2);
        head1.next.next=new Node(6);

         Node head2=new Node(3);
        head2.next=new Node(4);
        head2.next.next=new Node(5);
Node mergedlist=merge(head1,head2);
print(mergedlist);



    }
}