//using super keyword
class A 
{
    int x;
    A(int p)
    {
        x=p;
        System.out.println("Constructor in class A");

    }
}
class B extends A
{
    int y;
    B(int i, int j)
    {
        super(i);
        y=j;
    }
}
class SuperConstructor
{
    public static void main(String args[])
    {
        B b=new B(10,20);
        System.out.println("x="+b.x+" "+"y="+b.y);
    }
}