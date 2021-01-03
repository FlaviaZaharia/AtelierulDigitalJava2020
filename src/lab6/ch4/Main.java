package lab6.ch4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(3);
        list.add(7);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(1);


        for (int i = 0; i < list.size() - 1; i++) {
            if (i % 2 == 0) {
                if (list.get(i) > list.get(i + 1))
                    Collections.swap(list, i, i + 1);
            }
            else
                if(list.get(i)<list.get(i+1))
                    Collections.swap(list,i,i+1);

        }
        for(Integer ob:list)
            System.out.println(ob);
    }
}
