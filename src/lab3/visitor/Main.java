package lab3.visitor;

public class Main {
    public static void main(String[] args) {
        Element e1=new Book(50,"Book Name");
        Element e2=new Video("Video name",120);
        Element e3=new Audio(180,"Audio Name",20);
        Element[] elements=new Element[]{e1,e2,e3};
        Visitor visitor=new DurationVisitor();
        Visitor nameVisitor=new NameVisitor();
        for(Element currentElement: elements){
            currentElement.accept(visitor);
            currentElement.accept(nameVisitor);
        }
        System.out.println(visitor);
        System.out.println(nameVisitor);
    }
}
