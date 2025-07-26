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
        System.out.println("null");
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
     void Insert_at_diff_pos(int data,int pos)
     {
        ListNode newnode=new ListNode( data);
        ListNode temp=head;
        int current_pos=1;
        
        
        if(pos<1)
        {
            System.out.println("Invalid");
            return;
        }
        else if(pos==1)
        {
            newnode.next=temp;
            temp=newnode;
            return;
        }
        

        while(temp!=null && current_pos<pos-1)
        {
            temp=temp.next;
            current_pos++;
        }
        if(temp==null)
        {
            System.out.println("out of range");
            return;
        }
        newnode.next=temp.next;
        temp.next=newnode;

     }
}

public class insert_different_pos {
    public static void main(String[] args)
    {
        List ob=new List();
        ob.insert_at_begin(200);
        ob.insert_at_begin(300);
        ob.insert_at_begin(400);
        ob.insert_at_begin(500);
        ob.Insert_at_diff_pos(100, 3);
        ob.traversal();
    }
}
