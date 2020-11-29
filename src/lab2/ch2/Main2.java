package lab2.ch2;

public class Main2 {
    public static void main(String[] args) {
        Database database=new Database();
        System.out.println("Nume de studio care au produs mai mult de 2 filme");
        database.query1();
        System.out.println("Nume de studio in care joaca actorul cu numele actor cu 2 oscaruri");
        database.query2();
        System.out.println("Nume de filme in care joaca cel putin un actor cu varsta peste 50 de ani");
        database.query3();

    }
}
