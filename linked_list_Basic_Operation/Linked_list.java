public class Linked_list {
    Node head;

    // Nested Node class
    public class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    // Method to insert data at a specific position in the linked list
    public void Insert(Node newNode, int pos) {
        if (pos < 0) {
            System.out.println("Invalid position");
            return;
        }

        if (pos == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        int count = 0;

        while (current != null && count < pos - 1) {
            current = current.next;
            count++;
        }

        if (current == null) {
            System.out.println("Position is greater than the length of the list.");
        } else {
            newNode.next = current.next;
            current.next = newNode;
        }
    }
}
