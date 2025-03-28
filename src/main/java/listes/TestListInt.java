package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestListInt {
    public static void main(String[] args) {
        List<Integer> nb = new ArrayList<>();
        Collections.addAll(nb, -1, 5, 7, 3, -2, 5, 7, 12);


        System.out.println(nb.size());

        System.out.println(Collections.min(nb));
        Integer min = Collections.min(nb);
        nb.remove(min);

        System.out.println(nb);
    }
}
