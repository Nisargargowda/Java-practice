/*non static nested class*/
class Outer
{
    int out_x=100;
    void test()
    {
        Inner in=new Inner();
        in.display();
    }
    class Inner  /*this is the non static nested class*/
    {
        void display()
        {
            System.out.println("Outer class variable value is "+out_x);
        }
    }
}
class InnerclassDemo
{
    public static void main(String args[])
    {
        Outer o=new Outer();
        o.test();
    }
}
