package lab4.IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {
    HashMap<String,Long> phoneNumbers=new HashMap<>();
    public PhoneBook(String phoneBook){
        try {
            String name;
            Long number;
            Scanner scanner = new Scanner(new BufferedReader(new FileReader(phoneBook)));
            while(scanner.hasNext()){
                name=scanner.next();
                if(scanner.hasNextLong()){
                    number= scanner.nextLong();
                    phoneNumbers.put(name,scanner.nextLong());
                }
            }
        }catch(Exception e){
            System.out.println("Not found");
        }
    }

    public Long getByName(String name){
        return phoneNumbers.get(name);
    }
    public String toString(){
        return phoneNumbers.toString();
    }
}
