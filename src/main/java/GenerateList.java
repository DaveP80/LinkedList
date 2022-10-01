import java.util.ArrayList;
import java.util.List;
public class GenerateList {

    static Node head; // head of list
    static class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    static Node reverse(Node head)
    {
        if (head == null || head.next == null)
            return head;

        /* reverse the rest list and put
        the first element at the end */
        Node rest = reverse(head.next);
        head.next.next = head;

        head.next = null;

        return rest;
    }
    /* Function to print linked list */
    static void print()
    {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    static void push(int data)
    {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }
    public static List<Integer> generated = new ArrayList<>();
    public static void makeList() {
        int i;
        for (i = 0; i < 19; i++) {

            generated.add((int)Math.floor(Math.random() * 80));

        }
    }
}
