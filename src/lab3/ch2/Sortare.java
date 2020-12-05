package lab3.ch2;

import java.util.Arrays;

public class Sortare {
    public void displaySorted(SortingStrategy strategy,Integer[] arr){
        strategy.sort(arr);
    }
    public static void main(String[] args) {
        Integer[] arr=new Integer[]{1,4,5,2,3,6,9,8,7};
        Integer[] copy01ofArr= Arrays.copyOf(arr,arr.length);
        Integer[] copy02ofArr= Arrays.copyOf(arr,arr.length);
        Sortare sortare=new Sortare();
        sortare.displaySorted(new BubbleSort(),copy01ofArr);
        System.out.println();
        sortare.displaySorted(new MergeSort(),copy02ofArr);
    }
}
