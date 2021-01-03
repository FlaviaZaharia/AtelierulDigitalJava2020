package lab6.ch3;

import java.util.ArrayList;
import java.util.List;
import static java.util.Arrays.asList;
public class Main {
    public static void main(String[] args) {
        List<List<Integer>> triangle = generare(6);
        for (List<Integer> rand : triangle) {
            for (Integer col : rand) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> generare(int n) {
        List<List<Integer>> triunghi = new ArrayList<>();
        triunghi.add(asList(1));
        for (int i = 1; i < n; i++) {
            List<Integer> randDeasupra = triunghi.get(i - 1);
            List<Integer> randCurent = new ArrayList<>();
            randCurent.add(randDeasupra.get(i - 1));
            for (int j = 1; j <= i; j++) {
                randCurent.add(randCurent.get(j - 1) + randDeasupra.get(j - 1));
            }

            triunghi.add(randCurent);
        }
        return triunghi;
    }
}
