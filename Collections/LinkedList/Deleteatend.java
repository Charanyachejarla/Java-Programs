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
        void insert_at_begin(int data)
    {
        ListNode newnode=new ListNode(data);
        if(head==null)
        {
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    void Delete_at_end()
    {
        
        ListNode temp=head;
        ListNode prev=null;
        if(head==null)
        {
            System.out.println("list is empty and exit");
        }
        if(head.next==null)
        {
            head=null;
            return;
        }
        while(temp.next!=null)
        {
            prev=temp;
            temp=temp.next;
        }
        prev.next=null;
    }
}

public class Deleteatend {
    public static void main(String[] args)
    {
        List ob=new List();
         ob.insert_at_begin(200);
        ob.insert_at_begin(300);
        ob.insert_at_begin(400);
        ob.insert_at_begin(500);
        ob.Delete_at_end();
        ob.traversal();
    }
}
