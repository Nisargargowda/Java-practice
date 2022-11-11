class Person
{
    String name;
    int age;
    void setPersonData(String n, int a)
    {
        name=n;
        age=a;
    }
    void display()
    {
        System.out.println("Name="+name+"Age="+age);
    }
}
class Student extends Person
{
    int regno;
    void setRegno(int r)
    {
        regno=r;
    }
    void displayRegno()
    {
        System.out.println("Reg no="+regno);
    }
}
class SingleInheritance1
{
    public static void main(String args[])
    {
        Person p= new Person();
        p.setPersonData("Rama", 33);
        p.display();
        Student s= new Student();
        s.setPersonData("veena", 18);
        s.display();
        s.setRegno(111);
        s.displayRegno();

    }
}
