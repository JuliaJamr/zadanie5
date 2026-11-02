public class Main {

    public static void main(String[] args)
    {
        Student student1 = new Student(1, 3.25);
        Student student2 = new Student(2, 4.31);
        Student student3 = new Student(3,2);

        StudentRegistry registry = new StudentRegistry();

        System.out.println(registry.register(student1));
        System.out.println(registry.register(student2));
        System.out.println(registry.register(student3));
        System.out.println(registry.register(null));
    }
}
