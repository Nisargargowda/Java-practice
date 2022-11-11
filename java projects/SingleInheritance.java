/*single inheritance*/
class Person
{
    String name;
    int age;
    void setData(String n, int a)
    {
        name=n;
        age=a;
    }
    void displayPersonInfo()
    {
        System.out.println("NAME="+name+" "+"AGE="+age);
    }
}
class Student extends Person
{
    int regno;
    void SetRegNo(int r)
    {
        regno=r;
    }
    void displayregno()
    {
        System.out.println("REG NO= "+regno);
    }
}
class SingleInheritance
{
    public static void main(String args[])
    {
        Person p=new Person();
        p.setData("Rama", 45);
        p.displayPersonInfo();
        Student s= new Student();
        s.setData("Veena", 19);
        s.SetRegNo(333);
        s.displayPersonInfo();
        s.displayregno();
    }
}