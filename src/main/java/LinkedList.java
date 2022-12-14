import dao.ListDao;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class LinkedList extends GenerateList {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {

        ListDao listDao = new ListDao();

        while (true) {

            makeList();
            head = null;
            System.out.println("Array of Random Ints");

            if (generated.size() > 19) {
                System.out.println("input valid integers");
                generated.clear();
                makeList();
            }
            System.out.println(generated);

            System.out.println("Input a desired list size between 7 and 19");

            while (!scan.hasNextInt()) {
                scan.nextLine();
            }

            int input = scan.nextInt();

            if (input >= 7 && input <= 19) {
                List<Integer> linkedList = new java.util.LinkedList<>();
                int i;
                for (i = 0; i < input; i++) {

                    linkedList.add(generated.get(i));

                }
                System.out.println("\n" + "custom linked list");
                System.out.println(linkedList);
                System.out.println("reversing list...");

                for (i = input - 1; i >= 0; i--) {

                    push(linkedList.get(i));

                }

                head = reverse(head);
                System.out.println("old method for reversing linked list");
                print();

                Collections.reverse(linkedList);

                List<Integer> linkedList2 = new java.util.LinkedList<>(linkedList);

                System.out.println("\n");
                System.out.println("input an index to insert a random int value " + "(0-" + input + ").");

                while (!scan.hasNextInt()) {
                    scan.nextLine();
                }

                int input2 = scan.nextInt();

                if (input2 >= 0 && input2 <= input) {

                    //insert random value at specific index
                    linkedList2.add(input2, ((int) Math.floor(Math.random() * 80)));

                    System.out.println("\n" + "new value at index " + input2);

                    listDao.insertList(generated, linkedList, linkedList2);

//                    Stream<Integer> sortedStream = linkedList2.stream().sorted();
//                    sortedStream.forEach((n) -> System.out.print(n + " "));

                }

                if (linkedList2.size() > linkedList.size()) {

                    System.out.println("\n" + "\n" + "would you like to clear the collection?, yes(1)");
                    while (!scan.hasNextInt()) {
                        scan.nextLine();
                    }

                    int input3 = scan.nextInt();

                    if (input3 == 1) {
                        listDao.delete();
                        generated.clear();

                    } else
                        generated.clear();

                }
            }
        }
    }
}
