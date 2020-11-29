package lab2.ch3;

public class Main1 {
    public static void main(String[] args) {
        /*Cat cat=new Cat("Oscar");
        Animal animalCat=cat;
        ((Cat) animalCat).play();
        cat.play();*/
        Fish d=new Fish();
        Cat c=new Cat("Fluffy");
        Animal a=new Fish();
        Animal e=new Spider();
        Pet p=new Cat();
        d.eat();
        d.getName();
        d.setName("Fisi");
        d.walk();
        c.eat();
        c.getName();
        c.play();
        c.setName("Kat");
        c.walk();
        a.eat();
        a.walk();
        p.getName();
        p.play();
        p.setName("Pet");
    }
}
