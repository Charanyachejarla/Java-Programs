import java.util.Scanner;

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
        do{
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        while(temp!=head);
        System.out.println("head");
        
    }
    void insert_begin(int data)
    {
        ListNode newnode=new ListNode(data);
         if (head == null) {
        head = newnode;
        newnode.next = head;
         }
        
    
        ListNode temp=head;
        while(temp.next!=head)
        {
            temp=temp.next;
           
        }temp.next=newnode;
            newnode.next=head;
            head=newnode;
    }

    void insert_end(int data)
    {
        ListNode newnode =new ListNode(data);
          if (head == null) {
        head = newnode;
        newnode.next = head;
          }
          else{
            ListNode temp=head;
        while(temp.next!=head)
        {
            temp=temp.next;
        }
        temp.next=newnode;
        newnode.next=head;
          }
        
    }
    void delete_from_begin()
    {
        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }
        else{
            ListNode temp=head;
            while(temp.next!=head)
            {
                temp=temp.next;
            }
           //temp.next=head.next;
           //head=head.next;
            head=head.next;
            temp.next=head;
        }
    }
    void delete_from_end()
    {
        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }
        else{
            ListNode temp=head;
            ListNode prev=null;
            while(temp.next!=head)
            {
                prev=temp;
                temp=temp.next;
            }
            if(prev==null)
            {
                head=null;
                return;
            }
            prev.next=head;

            

        }
    }
}



public class CreateCircularlist {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        List ob=new List();
        int choice,data;
        do {
            System.out.println("\nMenu Driven circular Linked List");
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Delete from Beginning");
            System.out.println("4. Delete from End");
           
            System.out.println("5. Traversal");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                System.out.print("Enter data to insert at beginning: ");
                    data = sc.nextInt();
                    ob.insert_begin(data);
                    break;
                case 2:
                  System.out.print("Enter data to insert at end: ");
                    data = sc.nextInt();
                    ob.insert_end(data);
                    break;
                case 3:
                 ob.delete_from_begin();
                    System.out.println("Deleted node from beginning");
                    break;
                case 4:
                ob.delete_from_end();
                    System.out.println("Deleted node from end");
                    break;
                case 5:
                    System.out.println("circular Linked List:");
                    ob.traversal();
                    break;
                
                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Please enter between 1 and 6.");
            }
             } while (choice != 7);
       
    }
}