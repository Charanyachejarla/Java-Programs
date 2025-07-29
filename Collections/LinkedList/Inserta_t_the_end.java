class ListNode{
    int data;
    ListNode next;
    ListNode(int data)
    {
        this.data=data;
        this.next=next;

    }
}
class List{
    ListNode head;
    void traversal()
    {
        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }
        ListNode temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"--->");
            temp=temp.next;
        }
        System.out.print("null");
    }
    void Insert_at_the_end(int data)
    {
        ListNode newnode=new ListNode(data);
        if(head==null)
        {
            head=newnode;
            return;
        }
         ListNode temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newnode;
    }
}

public class Inserta_t_the_end {
    public static void main(String[] args)
    {
         List ob=new List();
        ob.Insert_at_the_end(111);
        ob.Insert_at_the_end(222);
        ob.Insert_at_the_end(333);
        ob.Insert_at_the_end(444);
        ob.traversal();
    }
}
