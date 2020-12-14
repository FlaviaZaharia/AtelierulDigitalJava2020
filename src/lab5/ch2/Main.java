package lab5.ch2;

public class Main {
    public static void main(String[] args) {
        Running r1=new Running("red",22);
        Running r2=new Running("red",22);
        Boot boot=new Boot("red",21);
        Pair<Running> pair = null;
        try {
            pair = new Pair(r1, boot);
        }catch(ShoesDontMatch e){
            try {
                pair = new Pair(r1, r2);
            }catch(ShoesDontMatch e1){
                System.out.println("dont match");
            }
        }
    }
}
