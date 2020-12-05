package lab3.ch4;

public class Main {
    public static void main(String[] args) {
        Teacher teacher=new Teacher();
        Teacher t1=new Teacher();
        Student s01=new Student("Popescu");
        Student s02=new Student("Ionescu");
        Student s03=new Student("Dragomirescu");
        s01.listenTo(teacher);
        s02.listenTo(teacher);
        s03.listenTo(teacher);
        s02.listenTo(t1);
        s03.listenTo(t1);
        String[] javaTopics=new String[]{"basics","oo","design patterns"};
        for(int i=0;i< javaTopics.length;i++)
        {
            teacher.teach(javaTopics[i]);
        }
        System.out.println();
        for(int i=0;i< javaTopics.length;i++)
        {
            t1.teach(javaTopics[i]);
        }

    }
}
