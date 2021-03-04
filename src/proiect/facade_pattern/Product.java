package proiect.facade_pattern;

public class Product {
    private double pret;
    private String nume;
    private int cantitate;
    private int codProdus;

    public Product(double pret, String nume, int cantitate, int codProdus) {
        this.pret = pret;
        this.nume = nume;
        this.cantitate = cantitate;
        this.codProdus = codProdus;
    }

    public static void afiseazaDetaliiProdus(Product p){
        System.out.println(p.toString());
    }

    @Override
    public String toString() {
        return "Product{" +
                "pret=" + pret +
                ", nume='" + nume + '\'' +
                ", cantitate=" + cantitate +
                ", codProdus=" + codProdus +
                '}';
    }

    public double getPret() {
        return pret;
    }


    public int getCantitate() {
        return cantitate;
    }


}


