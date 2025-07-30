class ListNode{
    int data;
    ListNode next;
    ListNode(int data)
    {
        this.data=data;
        this.next=null;
    }
}
class stack{
    ListNode head;
    int maxsize=5;
    int top=-1;
    void traversal()
    {
        ListNode temp=head;
        if(head==null)
        {
            System.out.println("no stackk");
            return;
        }
        while(temp!=null)
        {
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }
    void push(int data)
    {
        if(top==maxsize-1)
        {
            System.out.println("stack overflow");
            return;
        }
        top++;
    ListNode newnode=new ListNode(data);
    if(head==null)
    {
        newnode.next=head;
        head=newnode;
        return;
    }
        newnode.next=head;
        head=newnode;
    
    }
    void pop()
    {
        if(top==-1)
        {
            System.out.println("underflow");
            return;
        }top--;
        if(head==null)
        {
            System.out.println("Stack empty");
            return;
        }
        head=head.next;
    }

}
public class Stacklinkedlist{
    public static void main(String[] args)
    {
        stack ob=new stack();
        ob.push(10);
        ob.push(20);
        ob.push(30);
        ob.traversal();
        ob.pop();
        ob.traversal();
    }

}
