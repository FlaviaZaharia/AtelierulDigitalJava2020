package lab3.ch5;

import java.util.Arrays;

public class TemplateMethodExample {
    public static void displaySorted(Integer arr[]){
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] arr=new Integer[]{1,4,5,2,3,6,9,8,7};
        Integer[] copy01ofArr= Arrays.copyOf(arr,arr.length);
        Integer[] copy02ofArr= Arrays.copyOf(arr,arr.length);
        AscBubleSort asc=new AscBubleSort();
        asc.sort(copy01ofArr);
        DescBubleSort desc=new DescBubleSort();
        desc.sort(copy02ofArr);
        displaySorted(copy01ofArr);
        displaySorted(copy02ofArr);
    }
}
