/*Bank accpunt problem*/

class BankAccount
{
    String name;
    long ac_num, balance=1000;

    BankAccount(String m, long n)
    {
        name=m;
        ac_num=n;
    }
    void Deposit(long amt)
    {
        balance=balance+amt;
        Display();
    }
    void Withdraw(long amt)
    {
        if(amt<balance)
            balance=balance-amt;
        else
            System.out.println("Insufficient Balance");

    }
    void Display()
    {
        System.out.println("Account balance= "+balance);
    }
}
class MainBankAccount
{
    public static void main(String args[])
    {
        BankAccount B1=new BankAccount("ABC",11111011);
        B1.Deposit(10000);
        B1.Withdraw(500);
        B1.Display();
    }
}