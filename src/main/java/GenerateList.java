
import java.util.ArrayList;
import java.util.List;

public class GenerateList {

    static Node head;

    static class Node {

        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    /* Function to reverse the linked list */
    Node reverse(Node node)
    {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    // prints content of double linked list
    void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static List<Integer> generated = new ArrayList<>();

    public static void makeList() {
        int i;
        for (i = 0; i < 19; i++) {

            generated.add((int)Math.floor(Math.random() * 80));

        }

    }

}
