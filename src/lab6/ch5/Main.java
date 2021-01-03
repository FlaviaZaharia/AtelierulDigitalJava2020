package lab6.ch5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<Integer>();
        List<Integer> list2=new ArrayList<Integer>();
        list1.add(1);
        list1.add(5);
        list1.add(6);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        System.out.println(merge(list1,list2));
    }
    public static List<Integer> merge(List<Integer> list1, List<Integer> list2){
        List<Integer> list=new ArrayList<Integer>();
        int poz1=0;
        int poz2=0;
        while(!(poz1==list1.size()&&poz2==list2.size())){
            if (poz1 == list1.size()) {
               while(poz2<list2.size()){
                   list.add(list2.get(poz2));
                           poz2++;
               }
            } else if (poz2 == list2.size()) {
                while(poz1<list1.size()){
                    list.add(list1.get(poz1));
                    poz1++;
                }
            } else if (list1.get(poz1) == list2.get(poz2)) {
                list.add(list1.get(poz1));
                poz1++;
                poz2++;
            } else if (list1.get(poz1) < list2.get(poz2)) {
                list.add(list1.get(poz1++));
            } else if (list1.get(poz1) > list2.get(poz2)) {
                list.add(list2.get(poz2++));
            }
        }
        return list;
    }
}
