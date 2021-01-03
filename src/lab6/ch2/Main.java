package lab6.ch2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import static java.util.Arrays.asList;
public class Main {
    public static void main(String[] args) {
        afisareTriunghi(pascal(6));
    }
    public static List<List<Integer>> pascal(int n) {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(asList(1));

        for (int i = 1; i < n; i++) {
            triangle.add(new ArrayList<>());
            triangle.get(i).add(1);
            for (int j = 1; j < i; j++) {
                Integer elem1 = triangle.get(i - 1).get(j);
                Integer elem2 = triangle.get(i - 1).get(j - 1);
                triangle.get(i).add(elem1 + elem2);
            }
            triangle.get(i).add(1);
        }
        return triangle;
    }
    public static void afisareTriunghi(List<List<Integer>> triunghi) {
        for (int i = 0; i < triunghi.size(); i++) {
            for (int j = 0; j < triunghi.get(i).size(); j++) {
                System.out.print(triunghi.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

}
