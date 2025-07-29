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

    void insert_at_the_end(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void Delete_from_beginning() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    void Delete_from_end() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        ListNode temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }
    void Search(int data)
    {
         if (head == null) {
            System.out.println("List is empty");
            return;
        }
        ListNode temp = head;
        int pos=1;
        while (temp != null) {
            if(temp.data==data)
            {
                System.out.println(pos); 
                
            }pos++;
           temp=temp.next;
        }
        System.out.println("-1");
        
    }
     
}

public class Menulinkedlist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List ob = new List();
        int choice, data;

        do {
            System.out.println("\nMenu Driven Linked List");
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Delete from Beginning");
            System.out.println("4. Delete from End");
            System.out.println("5.Search");
            System.out.println("6. Traversal");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to insert at beginning: ");
                    data = sc.nextInt();
                    ob.insert_at_the_begin(data);
                    break;

                case 2:
                    System.out.print("Enter data to insert at end: ");
                    data = sc.nextInt();
                    ob.insert_at_the_end(data);
                    break;

                case 3:
                    ob.Delete_from_beginning();
                    System.out.println("Deleted node from beginning");
                    break;

                case 4:
                    ob.Delete_from_end();
                    System.out.println("Deleted node from end");
                    break;
                case 5:
                    System.out.println("search");
                    data=sc.nextInt();
                    ob.Search(data);
                    break;
                case 6:
                    System.out.println("Linked List:");
                    ob.traversal();
                    break;

                case 7:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Please enter between 1 and 7.");
            }
        } while (choice != 7);

        sc.close();
    }
}
