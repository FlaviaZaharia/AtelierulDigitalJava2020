package lab3.ch4;

public class Student implements Observer{
    private String name;

    public Student(String name) {
        this.name = name;
    }
    public void update(String message){
       System.out.println("Student "+this.getName()+" learned about "+message);
    }

    public void listenTo(Teacher teacher){
           teacher.register(this);
    }

    public String getName() {
        return name;
    }
}
