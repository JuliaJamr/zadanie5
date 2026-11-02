public class Student {
    private int id;
    private double grade;

    public Student(int id, double grade)
    {
        this.id = id;
        this.grade = grade;
    }

    public double getGrade()
    {
        return grade;
    }

    public int getId()
    {
        return id;
    }

    public void setGrade(double grade)
    {
        this.grade = grade;
    }

    public void setId(int id) {
        this.id = id;
    }
}
