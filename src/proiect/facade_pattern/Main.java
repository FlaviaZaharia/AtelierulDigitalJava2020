package proiect.facade_pattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Am implementat Facade Pattern pentru procesul de comenzi online. Cele 3 clase contin fiecare metode si campuri specifice pentru Product,Payment,Order,
// iar in clasa OnlineShopFacade sunt apelate in metodele comanda,retur,cancelOrder toate metodele reprezentative despre produs,plata si comanda.
public class Main {
    public static void main(String[] args) {
          Product p1=new Product(20,"cercei",2,773);
          Product p2=new Product(50,"bratara",1,432);
          Product p3=new Product(100,"ceas",3,657);
          ArrayList<Product> list=new ArrayList<>();
          list.add(p1);
          list.add(p2);
          list.add(p3);
          Payment pay1=new Payment("ramburs","Ana",list);
          Payment pay2=new Payment("card","ro976","ana",list);
          Order o1=new Order(234);
          Order o2=new Order(754);
          Order o3=new Order(438);
          OnlineShopFacade osf=new OnlineShopFacade(o1,pay2,list);
          OnlineShopFacade osf2=new OnlineShopFacade(o2,pay1,list);
          OnlineShopFacade osf3=new OnlineShopFacade(o3,pay2,list);
          osf.comanda();
          System.out.println("\n");
          osf2.retur();
          System.out.println("\n");
          osf3.cancelOrder();


    }
}
