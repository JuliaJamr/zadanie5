public class StudentRegistry {
    private final int capacity = 2;
    private Student[] students = new Student[capacity];

    public StudentRegistry()
    {

    }

    public boolean register(Student s)
    {
        if(s==null) return false;
        int i=0;

        if(students[0]==null)
        {
            students[0] = s;
            return true;
        }
        else
        {
            double min = students[0].getGrade();
            int pom = 0;

            for(i=1;i<capacity;i++)
            {
                if(students[i]==null)
                {
                    students[i] = s;
                    return true;
                }
                else if(students[i].getGrade()<min)
                {
                    min=students[i].getGrade();
                    pom = i;
                }
            }
            students[pom].setGrade(s.getGrade());
            students[pom].setId(s.getId());
        }

        return true;
    }
}
