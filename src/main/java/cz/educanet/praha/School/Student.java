package cz.educanet.praha;

import java.util.ArrayList;

public class Student
{
    // jméno žáka
    private String _name;
    public String getName()
    {
        return _name;
    }

    // věk žáka
    private int _age;
    public int getAge()
    {
        return _age;
    }



    public Student(String name, int age)
    {
        _name = name;
        _age = age;
    }
}
