package lab3.ch1;

public class ArrayCustomIterator implements Iterator{
    private int[] arr;
    private int position;
    public ArrayCustomIterator(int[] arr) {
        this.arr = arr;
    }
    public boolean hasNext(){
       return (position<arr.length);
    }

    public int next(){
        return arr[position++];
    }
}
