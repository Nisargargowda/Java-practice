import java.lang;

class MyObject
{
    private object p;
    MyObject(object x)
    {
        p=x;
    }
    object getObject()
    {
        return p;
    }
}
class GenObject
{
    public static void main(String args[])
    {
        GenObject go=new GenObject();
        System.out.println("The class of go="+go.getclass());
        MyObject o1=new MyObject("Rama");
        MyObject o2=new MyObject("48");
        System.out.println("o1="+o1.getObject());
        System.out.println("o2="+o2.getObject());
        MyObject o3=o1; //MyObject o3(o1.clone())
        System.out.println(o1.equals(o3));
        System.out.println("The class of o2="+o2.getclass());
    }
}