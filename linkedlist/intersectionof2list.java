

class Node
{
    int data;
    Node next;
    Node(int val)
    {
        data=val;
        next=null;
    }
}

    public class intersectionof2list {
        public static int merge(Node headA,Node headB)
        {
            Node temp1=headA;
            Node temp2=headB;
            int cnt1=0,cnt2=0;
            while(temp1!=null)
            {   cnt1++;
                temp1=temp1.next;
            }
             while(temp2!=null)
            {   cnt2++;
                temp2=temp2.next;
            }
            int len=cnt1-cnt2;
            temp1=headA;
            temp2=headB;
            if(len>0)
          {
            while(len!=0)
                {temp1=temp1.next;
            len--;}
          }
          else{
            while(len!=0){temp2=temp2.next;
            len++;}
          }
while(temp1.data!=temp2.data)
{
    temp1=temp1.next;
    temp2=temp2.next;
}
return temp1.data;
        }
    public static void main(String[] args) {
        Node headA=new Node(5);
        headA.next = new Node(2);
        headA.next.next = new Node(3);
        headA.next.next.next = new Node(5);
        headA.next.next.next.next = new Node(6);

        Node headB=new Node(3);
        headB.next = new Node(5);
        headB.next.next = new Node(6);
int ans=merge(headA,headB);
System.out.println(ans);

    }

}
