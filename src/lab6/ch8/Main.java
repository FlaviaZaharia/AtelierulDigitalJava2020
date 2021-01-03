package lab6.ch8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayListImp<>();
        for (int i = 0; i < 10; i++)
            list.add(i);
        list.remove(7);
        list.set(1,85);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }

}
