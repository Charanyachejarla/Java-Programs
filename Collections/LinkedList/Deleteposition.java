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
    void deletepos(int data,int pos)
    {
        ListNode newnNode=new ListNode(data);
        
        if(pos<0 || head==null)
        {
            System.out.println("linked list is empty");
            return;

        }
        if(pos==1)
        {
            head=head.next;
            return;
        }
        ListNode temp=head;
        ListNode prev=null;
        int current_pos=1;
        while(temp!=null && current_pos<pos)
        {
            prev=temp;
            temp=temp.next;
            current_pos++;
        }
        if(temp==null)
        {
            System.out.println("out of range");
            return;
        }
        prev.next=temp.next;

    }
}
public class Deleteposition {
    public static void main(String[] args)
    {
        List ob=new List();
         ob.insert_at_begin(200);
        ob.insert_at_begin(300);
        ob.insert_at_begin(400);
        ob.insert_at_begin(500);
        ob.deletepos(400,2);
        ob.traversal();
    }
}
