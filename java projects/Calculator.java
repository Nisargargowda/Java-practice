/*heirerchial inheritance*/
class Number
{
    int n1;
    int n2;
    void SetData(int x, int y)
    {
        n1=x;
        n2=y;
    }
    void DisplayNamus()
    {
        System.out.println("N1="+n1+"N2="+n2);
    }
}
class Add extends Number
{
    void Sum()
    {
        System.out.println("SUM="+(n1+n2));
    }
}
class Sub extends Number
{
    void diff()
    {
        System.out.println("DIFFERENCE="+(n1+n2));
    }
}
class Calculator
{
    public static void main(String args[]) 
    {
        Add a=new Add();
        a.SetData(10, 20);
        a.Sum();
        Sub s= new Sub();
        s.SetData(50, 10);
        s.diff();
    }
}