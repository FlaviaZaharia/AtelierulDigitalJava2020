package lab7.ch2;

public class BankAccount extends Thread{
    private double debit;
    private String name;
    public BankAccount(double debit, String name){
        this.debit=debit;
        this.name=name;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        longDatabaseCall();
        if(debit>=amount) {
            this.debit -= amount;
            System.out.println("New amount after withdraw" + debit);
        }
        else
            throw new InsufficientFundsException();
    }

    public void deposit(double amount){
        this.debit+=amount;
        System.out.println("New amount after deposit"+ debit);
    }
    public void longDatabaseCall(){
        try{
            Thread.sleep(100);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
