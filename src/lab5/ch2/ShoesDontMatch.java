package lab5.ch2;

public class ShoesDontMatch extends Exception{
    public ShoesDontMatch(){
        super("Wrong params,they must have the  same size and color");
    }
}
