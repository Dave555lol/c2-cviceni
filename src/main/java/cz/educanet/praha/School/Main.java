package cz.educanet.praha;

public class Main
{
    private static School _school1;
    private static School _school2;


    public static void main(String[] args)
    {
        createSchools();

        System.out.println("Počet studentů ve škole 1: " + countAllStudents(_school1));
        System.out.println("Počet studentů ve škole 2: " + countAllStudents(_school2));
        System.out.println();
        System.out.println("Průměrný věk studentů ve škole 1 začínajících na 'R': " + averageStudentsWithNameStartingWith(_school1, 'R'));
        System.out.println("Průměrný věk studentů ve škole 2 začínajících na 'J': " + averageStudentsWithNameStartingWith(_school2, 'J'));
        System.out.println();
        System.out.println("Počet studentů ve škole 1 ve tříde s názvem 'GHI': " + countStudentsFromClassByName(_school1, "GHI"));
        System.out.println("Počet studentů ve škole 2 ve tříde s názvem 'MNO': " + countStudentsFromClassByName(_school2, "MNO"));

    }


    // 1. Vypočítá, kolik je studentů ve škole
    public static int countAllStudents(School school)
    {
        return school.countAllStudents();
    }

    // 2. Vypočítá průměrný věk studentů z dané školy, kterým začíná jméno na zadaný znak
    public static double averageStudentsWithNameStartingWith(School school, char startsWith)
    {
        return school.averageStudentsWithNameStartingWith(startsWith);
    }

    // 3. Vypočítá, kolik studentů je ve třídě podle jejího názvu
    public static int countStudentsFromClassByName(School school, String className)
    {
        return school.countStudentsFromClassByName(className);
    }


    // vytvoří školy, třídy a studenty
    private static void createSchools()
    {
        // vytvoří první testovací školu
        _school1 = new School("CVUT");
        Class class_ABC = new Class("ABC");
        Class class_DEF = new Class("DEF");
        Class class_GHI = new Class("GHI");

        class_ABC.addStudent(new Student("Petr", 21));
        class_ABC.addStudent(new Student("Jan", 24));
        class_ABC.addStudent(new Student("Rostislav", 20));

        class_DEF.addStudent(new Student("Luboš", 28));
        class_DEF.addStudent(new Student("Petra", 29));
        class_DEF.addStudent(new Student("Dominik", 25));

        class_GHI.addStudent(new Student("Alžběta", 32));
        class_GHI.addStudent(new Student("Romana", 30));
        class_GHI.addStudent(new Student("Radek", 35));
        class_GHI.addStudent(new Student("Iveta", 20));

        _school1.addClass(class_ABC);
        _school1.addClass(class_DEF);
        _school1.addClass(class_GHI);


        // vytvoří druhou testovací školu
        _school2 = new School("CVUT");
        Class class_JKL = new Class("JKL");
        Class class_MNO = new Class("MNO");
        Class class_PQR = new Class("PQR");

        class_JKL.addStudent(new Student("Diana", 24));
        class_JKL.addStudent(new Student("Jiří", 25));

        class_MNO.addStudent(new Student("Jana", 21));
        class_MNO.addStudent(new Student("Klára", 23));

        class_PQR.addStudent(new Student("Bořivoj", 29));
        class_PQR.addStudent(new Student("Ctirad", 38));
        class_PQR.addStudent(new Student("Jakub", 30));

        _school2.addClass(class_JKL);
        _school2.addClass(class_MNO);
        _school2.addClass(class_PQR);
    }
}
