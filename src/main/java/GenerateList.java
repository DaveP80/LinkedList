
import java.util.ArrayList;
import java.util.List;

public class GenerateList {

    public static List<Integer> generated = new ArrayList<>();

    public static void makeList() {
        int i;
        for (i = 0; i < 19; i++) {

            generated.add((int)Math.floor(Math.random() * 80));

        }

    }

}
