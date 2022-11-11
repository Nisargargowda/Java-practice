/*package program*/
class A
{
    private int p;
    int q;
    protected int  R;
    public int S;

    void input(int i, int j, int k, int l)
    {
        p=i;
        q=j;
        R=k;
        S=l;
    }
        
}
class B extends A 
{
    void displayinB()
    {
        p=20; //Error
        q=30;
        R=50;
        S=100;
    }

}
Class AccessSpecifier
{
    public static void main(String args[])
    {
        B b1=new B();
        b1.p=100;//ERROR
        b1.q=200;
        b1.R=300;
        b1.S=400;
    }
}
class C extends class A 
{
    p=111;
    q=222;
    R=333;
    S=444;
}
class OtherPackage
{
    C m=new C();
    m.p=1111;
    m.q=2222;
    m.R=3333;
    m.S=4444;
}
