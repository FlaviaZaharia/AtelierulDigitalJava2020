package lab1;

public class Challenge2 {

    public static  String compute(int nr){
        String result="";
        int aux=nr;
        int count=0;
        int cifra;
        if(nr%3==0)
            result+="Foo";
        if(nr%5==0)
            result+="Bar";
        if(nr%7==0)
            result+="Qix";
        while(aux!=0)
        {
            aux=aux/10;
            count++;
        }
        count--;
        while(count>=0)
        {
            cifra=(nr/(int)(Math.pow(10,count)))%10;
            if(cifra==3)
                result+="Foo";
            else
            if(cifra%10==5)
                result+="Bar";
            else
            if(cifra%10==7)
                result+="Qix";
            count--;
        }

        if(result.equals(""))
            return String.valueOf(nr);
        else
            return result;
    }
    public static String compute2(int nr){
        String result="";
        int aux=nr;
        int count=0;
        int cifra;
        if(nr%3==0)
            result+="Foo";
        if(nr%5==0)
            result+="Bar";
        if(nr%7==0)
            result+="Qix";
        while(aux!=0)
        {
            aux=aux/10;
            count++;
        }
        count--;
        while(count>=0)
        {
            cifra=(nr/(int)(Math.pow(10,count)))%10;
            if(cifra==0)
                result+="*";
            else
            if(cifra==3)
                result+="Foo";
            else
            if(cifra%10==5)
                result+="Bar";
            else
            if(cifra%10==7)
                result+="Qix";
            count--;
        }

        if(result.equals(""))
            return String.valueOf(nr);
        else
            return result;
    }


    public static void main(String[] args) {
        System.out.println(Challenge2.compute(570));
        System.out.println(Challenge2.compute2(570));
    }
}
