package lab1;

public class Challenge3 {
    public static void main(String[] args) {
        int[] array=new int[6];
        int pairs=0;
        array[0]=1;
        array[1]=1;
        array[2]=0;
        array[3]=-1;
        array[4]=-1;
        array[5]=10;
        for(int i=0;i<array.length-1;i++)
            for(int j=i+1;j<array.length;j++)
                if(array[i]+array[j]==0)
                {
                    pairs++;
                    array[j]=Integer.MAX_VALUE;
                      j=array.length;
                }
System.out.println("Numarul de perechi este:"+pairs);
    }

}
