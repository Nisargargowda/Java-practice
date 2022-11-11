//multiple interface implementation

interface interface_A
{
    void method_A();
}

interface interface_B 
{
    void method_B();
}

class MultiInterface implements interface_A, interface_B 
{
    public void method_A() 
    {
        System.out.println("Abstract method of interface A");
    }

    public void method_B() 
    {
        System.out.println("Abstract method of interface B");
    }

    void display() 
    {
        System.out.println("");
    }
}

class MainInterface 
{
    public static void main(String args[]) 
    {
        MultiInterface m = new MultiInterface();
        m.method_A();
        m.display();
        m.method_B();
    }
}