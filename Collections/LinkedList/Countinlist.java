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
    void countlist()
    {
        int count=0;
        int val=2;
        ListNode temp=head;
        while(temp!=null)
        {
            if(temp.data==val)
            {
                count++;
            }
            
            temp=temp.next;
        }
        System.out.println(count);
        
    }
}
public class Countinlist {
    public static void main(String[] args)
    {
        List  ob=new List();
         ob.insert_at_the_begin(1);
         ob.insert_at_the_begin(2);
          ob.insert_at_the_begin(2);
           ob.insert_at_the_begin(3);
           ob.traversal();
           ob.countlist();
    }
}
