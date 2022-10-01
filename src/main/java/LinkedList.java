import dao.ListDao;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class LinkedList extends GenerateList{
    public static void main(String[] args) throws InterruptedException {

        ListDao listDao = new ListDao();

        makeList();
        System.out.println(generated);

//        Stream<Integer> sortedStream = generated.stream().sorted();
//        sortedStream.forEach((n) -> System.out.print(n + " "));

        List<Integer> linkedList = new java.util.LinkedList<>();
        int i;
        for (i=0; i<12; i++) {

            linkedList.add(generated.get(i));

        }
        System.out.println(linkedList);
        Collections.reverse(linkedList);
        List<Integer> linkedList2 = new java.util.LinkedList<>(linkedList);

        //insert random value at specific index
        linkedList2.add(4, ((int)Math.floor(Math.random() * 80)));

        System.out.println(linkedList2);

        //add another random int

        listDao.insertList(linkedList2);




        }
    }

