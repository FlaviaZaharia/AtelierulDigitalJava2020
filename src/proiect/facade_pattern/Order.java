package proiect.facade_pattern;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private int codComanda;
    public Order(int codComanda) {
        this.codComanda = codComanda;
    }


    public void impachetareComanda() {
        System.out.println("Comanda "+ this.codComanda+ " in curs de procesare");
    }
    public void trimitereComanda(){
        System.out.println("Comanda "+this.codComanda+ " expediata");
    }
    public void trimiteMailConfirmare(){
        System.out.println("Mail confirmare comanda "+this.codComanda+ " trimis");
    }
    public void trimiteMailRetur(){
        System.out.println("Mail retur comanda "+this.codComanda+" trimis");
    }
    public void anuleazaComanda(){
        System.out.println("Comanda "+codComanda+  " Anulata");
    }
    public void emailAnulare(){
        System.out.println("Email anulare comanda "+codComanda+" trimis");
    }

}
