package cz.educanet.praha;

import java.util.ArrayList;

public class Class
{
    // název třídy
    private String _name;
    public String getName()
    {
        return _name;
    }

    // seznam žáků
    private ArrayList<Student> _students = new ArrayList<>();
    public ArrayList<Student> getStudents()
    {
        return _students;
    }



    public Class(String name)
    {
        _name = name;
    }



    // přidá nového žáka
    public void addStudent(Student student)
    {
        _students.add(student);
    }

    // vrátí počet žáků ve třídě
    public int getStudentsCount()
    {
        return getStudents().size();
    }

    // vrátí žáky, jejichž jméno začíná na zadaný znak
    public ArrayList<Student> studentsWithNameStartingWith(char startsWith)
    {
        ArrayList<Student> students = new ArrayList<>();

        for(Student student : getStudents())
            if(student.getName().charAt(0) == startsWith)
                students.add(student);

        return  students;
    }
}
