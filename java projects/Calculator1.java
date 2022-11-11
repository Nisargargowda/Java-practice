class Number
{
    int n1;
    int n2;
    void setData(int x, int y)
    {
        n1=x;
        n2=y;
    }
    void displayNum()
    {
        System.out.println("N1="+n1+"  "+"N2="+n2);
    }
}
class Add extends Number
{
    void sum()
    {
        System.out.println("SUM="+(n1+n2));
    }
}
class Sub extends Number
{
    void sub()
    {
        System.out.println("Difference="+(n1-n2));
    }
}
class Calculator1
{
    public static void main(String args[])
    {
        Add a= new Add();
        a.setData(20, 10);
        a.sum();
        Sub s= new Sub();
        s.setData(50, 10);
        s.sub();
    }
}

