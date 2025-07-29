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

    ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode temp = head;
        while (temp != null) {
            ListNode next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        return prev;
    }

    void plus(ListNode head) {
        head = reverse(head);
        ListNode current = head;
        int carry = 1;

        while (current != null && carry > 0) {
            int sum = current.data + carry;
            current.data = sum % 10;
            carry = sum / 10;

            if (current.next == null && carry > 0) {
                current.next = new ListNode(0);
            }

            current = current.next;
        }

        head = reverse(head);
        // Update this.head so traversal() works correctly
        this.head = head;

        System.out.print("After Plus One: ");
        traversal();
    }
}

public class Plusone {
    public static void main(String[] args) {
        List ob = new List();

        // Creating 999 as a list: 9 → 9 → 9
        ob.insert_at_the_begin(9);
        ob.insert_at_the_begin(9);
        ob.insert_at_the_begin(9);

        System.out.print("Original List: ");
        ob.traversal();

        // Call plus with head of list
        ob.plus(ob.head);
    }
}
