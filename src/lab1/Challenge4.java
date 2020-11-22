package lab1;

public class Challenge4 {
    public static void main(String[] args) {
        int[] array=new int[6];
        int pairs=0;
        array[0]=-1;
        array[1]=-1;
        array[2]=-1;
        array[3]=2;

        for(int i=0;i<array.length-2;i++)
            for(int j=i+1;j<array.length-1;j++)
                for(int k=j+1;k<array.length;k++)
                    if(array[i]+array[j]+array[k]==0)
                    {
                        pairs++;
                        array[j]=Integer.MAX_VALUE;
                        array[k]=Integer.MAX_VALUE;
                        j=array.length-1;
                        k=array.length;
                    }

        System.out.println("Numarul de perechi este:"+pairs);
    }
}
