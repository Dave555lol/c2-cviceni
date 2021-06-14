package cz.educanet.praha;

import java.util.ArrayList;

public class School
{
    // název školy
    private String _name;
    public String getName()
    {
        return _name;
    }

    // seznam tříd
    private ArrayList<Class> _classes = new ArrayList<>();
    public ArrayList<Class> getClasses()
    {
        return _classes;
    }



    public School(String name)
    {
        _name = name;
    }



    // přidá novou třídu
    public void addClass(Class clss)
    {
        _classes.add(clss);
    }

    // vypočítá celkový počet studentů ve škole
    public int countAllStudents()
    {
        int count = 0;

        for (Class clss : getClasses())
            count += clss.getStudentsCount();

        return count;
    }

    // vypočítá průměrný věk studentů školy, kterým začíná jméno na zadaný znak
    public double averageStudentsWithNameStartingWith(char startsWith)
    {
        double studentsCount = 0;
        double ageSum = 0;

        for(Class clss : getClasses())
            for(Student student : clss.studentsWithNameStartingWith(startsWith))
            {
                studentsCount++;
                ageSum += student.getAge();
            }

        if(studentsCount == 0)
            return -1;
        else
            return ageSum / studentsCount;
    }

    // vypočítá, kolik studentů je ve třídě podle jejího názvu
    public int countStudentsFromClassByName(String className)
    {
        for(Class clss : getClasses())
            if(clss.getName().equals(className))
                return clss.getStudentsCount();

        return -1;
    }
}
