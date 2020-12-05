package lab3.ch6;

public class Main {
    public static void main(String[] args) {
        Person person=new Person.Builder("John").build();
        Person p1=new Person.Builder("Ion").setDrivingLicence(true).build();
        Person p2=new Person.Builder("Ana").setJob("Lawyer").setMarried(false).build();

    }
}
