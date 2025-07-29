import java.util.*;

class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class List {
    ListNode head;

    void traversal() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    void insert_at_the_begin(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    void cycle()
    {
        ListNode head;
        if(head==null ||head.next==null)
        {
            return ;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null  && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next;
            if(slow==fast)
           {
              break;
           }
        }
        if(slow!=fast)
        {
            return;
        }
        slow=head;
        if(slow==fast)
        {
            while(fast.next!=slow)
            {
                fast=fast.next;
            }
        }else{
            while(slow.next!=fast.next)
            {
                slow=slow.next;
                fast=fast.next;
            }
        }
        fast.next=null;
        

    }
}
public class Removelinkedlist {
    public static void main(String[] args)
    {
        List ob=new List();
        ob.insert_at_the_begin(1);
        ob.insert_at_the_begin(2);;
        ob.insert_at_the_begin(3);
        ob.insert_at_the_begin(4);
        ob.traversal();
        ob.cycle();
    }
}
