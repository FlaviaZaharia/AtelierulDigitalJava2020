package lab3.delegation;

public class Employee {

    private String name;
    public void work(){
        System.out.println("Working");
    }
    public void calculatePay(PayCalculator p){
        System.out.println("Rest tot pay:"+p.calculate("manager"));
    }
}
