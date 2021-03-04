package proiect.facade_pattern;

import java.util.ArrayList;

public class Payment {

    private String payMethod;
    private double sum=0;
    private String IBAN;
    private String numeProprietar;
    public Payment(String payMethod, String IBAN, String numeProprietar,ArrayList<Product> list) {
        this.payMethod = payMethod;
        this.IBAN = IBAN;
        this.numeProprietar = numeProprietar;
        for(Product p:list)
            sum+=p.getPret()*p.getCantitate();
    }

    public Payment(String payMethod, String numeProprietar,ArrayList<Product> list) {
        this.payMethod = payMethod;
        this.sum = sum;
        this.numeProprietar = numeProprietar;
        for(Product p:list)
            sum+=p.getPret()*p.getCantitate();
    }

    public void inregistrarePlata(){
        System.out.println("Clientul plateste suma de "+sum+" prin metoda: "+payMethod);
    }

    public void restituieBani(){
        System.out.println("Suma de "+sum+" a fost restituita in cont");
    }


}
