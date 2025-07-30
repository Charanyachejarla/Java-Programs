
class ListNode{
    ListNode prev;
    int data;
    ListNode next;
    ListNode(int data)
    {
        this.prev=null;
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
    void back_traversal()
    {
        ListNode temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        ListNode tail=temp;
        while(tail!=null)
        {
            System.out.print(tail.data+"-->");
            tail=tail.prev;
        }
        System.out.println("null");
    }
    void insert(int data)
    {
        ListNode newNode=new ListNode(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    void insert_end(int data)
    {
        ListNode newnNode=new ListNode(data);
        if(head==null)
        {
            head=newnNode;
            return;
        }
        ListNode temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newnNode;
        newnNode.prev=temp;
    }
    void insert_pos(int data,int pos)
    {
        ListNode newnode=new ListNode(data);
        if(pos==1)
        {
            newnode.next=head;
            if(head!=null)
            {
                head.prev=newnode;
            }
            head=newnode;
        }
        ListNode temp=head;
        int count=1;
        while(count<pos-1 && temp!=null)
        {
            temp=temp.next;
            count++;
        }
        if(temp==null)
        {
            System.out.println("out of range");
            return;
        }
        newnode.next=temp.next;
        newnode.prev=temp;
        if(temp.next!=null)
        {
             temp.next.prev=newnode;
             
        }
      temp.next=newnode;
    }
        void delete_from_begin()
        {
            if(head==null)
            {
                System.out.println("list is empty");
                return;
            }
            if(head!=null)
            {
                head=head.next;
                head.next.prev=null;
            }
            
        }
        void delete_from_end()
        {
           
            if(head==null)
            {
                System.out.println("list empty");
            }
            ListNode temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.prev.next=null;
            temp.prev=null;
            
        }
        void delete_at_pos(int pos)
        {
            
            if(pos==1)
            {
                head=head.next;
                head.prev=null;
                return;
            }
            ListNode temp=head;
        int count=1;
        while(count<pos && temp!=null)
        {
            temp=temp.next;
            count++;
        }
        if(temp==null)
        {
            System.out.println("out of range");
            return;
        }
        if(temp.prev!=null)
        {
            temp.prev.next=temp.next;
        }
        if(temp.next!=null)
        {
            temp.next.prev=temp.prev;
        }
       
        }

    }



public class CreateDoubleList {
    public static void main(String[] args)
    {
        List ob=new List();
        ob.insert(100);
        ob.insert(200);
        ob.insert(300);
        ob.insert_end(400 );
        ob.insert_end(500);
        ob.traversal();

        System.out.println();
        ob.back_traversal();

        System.out.println();
        ob.insert_pos(600,3);
        ob.traversal();

        System.out.println();
        ob.delete_from_begin();
        ob.traversal();
         
        System.out.println();
        ob.delete_from_end();
        ob.traversal();

        System.out.println();
        ob.delete_at_pos(4);
        ob.traversal();
    }
}
