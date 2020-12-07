package lab4.IO;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook=new PhoneBook("./src/lab4/IO/input.txt");
        System.out.println(phoneBook);
        System.out.println("Abber: "+phoneBook.getByName("Abber"));
        System.out.println("Abdul: "+phoneBook.getByName("Abdul"));

    }
}
