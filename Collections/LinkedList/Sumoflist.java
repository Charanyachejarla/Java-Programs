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
            System.out.print(temp.data + " ---> ");
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
    void sumof()
    {
        int sum=0;
        ListNode current=head;
        while(current!=null)
        {
            sum=sum+current.data;
            current=current.next;
        }
         System.out.println(sum);
    }
}
public class Sumoflist {
    public static void main(String[] args)
    {
        List ob=new List();
        ob.insert_at_the_begin(5);
         ob.insert_at_the_begin(-3);
          ob.insert_at_the_begin(-9);
           ob.insert_at_the_begin(-4);
           ob.traversal();
           ob.sumof();
    }
    
}
