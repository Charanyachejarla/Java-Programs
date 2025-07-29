

class LinkNode{
    int data;
    LinkNode next;
    LinkNode(int data)
    {
        this.data=data;
        this.next=null;
    }
}
class List{
    LinkNode head;
    void traversal()
    {
        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }
        LinkNode temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"--->");
            temp=temp.next;
        }
        System.out.print("null");
    }
    void insert_at_begin(int data)
    {
        LinkNode newnode=new LinkNode(data);
        if(head==null)
        {
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
}
public class Linlist {
    public static void main(String[] args)
    {
        List ob=new List();
        ob.insert_at_begin(111);
        ob.insert_at_begin(222);
        ob.insert_at_begin(333);
        ob.traversal();

    }
}
