import java.util.Scanner;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

class rotate {

    public Node rotateRight(Node head, int k) {

        if (head == null || head.next == null || k == 0) {
            return head;
        }

        Node temp = head;
        int len = 1;

        // Find length and tail
        while (temp.next != null) {
            temp = temp.next;
            len++;
        }

        int r = k % len;
        if (r == 0) return head;

        // Make circular
        temp.next = head;

        int tailLen = len - r;
        Node move = head;

        // Move to new tail
        for (int i = 1; i < tailLen; i++) {
            move = move.next;
        }

        // New head
        head = move.next;
        move.next = null;

        return head;
    }
}

public class rotatelist {

    // Create linked list from input
    static Node createList(int n, Scanner sc) {
        Node head = new Node(sc.nextInt());
        Node curr = head;

        for (int i = 1; i < n; i++) {
            curr.next = new Node(sc.nextInt());
            curr = curr.next;
        }
        return head;
    }

    // Print linked list
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        int n = sc.nextInt();        // number of nodes
        Node head = createList(n, sc);
        int k = sc.nextInt();        // rotation count

        // Rotate
        rotate obj = new rotate();
        head = obj.rotateRight(head, k);

        // Output
        printList(head);

        sc.close();
    }
}
