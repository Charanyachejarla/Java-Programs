class ListNode{
    int data;
    ListNode next;
    ListNode(int data)
    {
        this.data=data;
        this.next=null;
    }
}
class List{
    ListNode head;
    void traversal()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        ListNode temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"--->");
            temp=temp.next;
        }
        System.out.println("null");
    }
     
    void insert_at_the_end(int data)
    {
        ListNode newNode=new ListNode(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        ListNode temp=head;

        while(temp.next!=null)
        {
            temp=temp.next;


        }
        temp.next=newNode;
    }
    void oddeven()
    {
        ListNode odd=head;
        ListNode even=head.next;
       ListNode evenhead=even;
        if(even!=null && even.next!=null)
        {
            odd.next=even.next;
            odd=odd.next;

            even.next=odd.next;
            even=even.next;
        }
        odd.next=evenhead;
    }
}
public class oddevenlinkedlist {
    public static void main(String[] args)
    {
        List ob=new List();
        ob.insert_at_the_end(1);
        ob.insert_at_the_end(2);
        ob.insert_at_the_end(3);
        ob.insert_at_the_end(4);
        ob.insert_at_the_end(5);
        ob.traversal();
        ob.oddeven();
        ob.traversal();
    }
}
