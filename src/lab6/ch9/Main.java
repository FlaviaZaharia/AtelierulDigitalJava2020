package lab6.ch9;

import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Collection<Integer> lista = List.of(1, 2, 2, 1, 3, 2,4);

        MySet<Integer> mySet = new MySetImp<>();
        for(Integer i: lista) {
            mySet.add(i);
        }

        for(int i=0;i<mySet.size();i++) {
            System.out.println(mySet.get(i));
        }
    }
}
