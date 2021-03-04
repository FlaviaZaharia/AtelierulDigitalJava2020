package proiect.facade_pattern;

import java.util.ArrayList;

public class OnlineShopFacade {
    private Order order;
    private Payment payment;
    private ArrayList<Product> product=new ArrayList<>();

    public OnlineShopFacade(Order order, Payment payment,ArrayList<Product> p) {
        this.order = order;
        this.payment = payment;
        product.addAll(p);
    }

    public void comanda(){
        for(Product p:product)
           Product.afiseazaDetaliiProdus(p);
        payment.inregistrarePlata();
        order.trimiteMailConfirmare();
        order.impachetareComanda();
        order.trimitereComanda();
    }

    public void retur(){
        order.trimiteMailRetur();
        payment.restituieBani();
    }

    public void cancelOrder(){
        order.anuleazaComanda();
        order.emailAnulare();
        payment.restituieBani();
    }


}
