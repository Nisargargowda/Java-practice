/*conference hall*/

class ConferenceHall
{
    String name;
    String NAME;
    int availseats;
    
    ConferenceHall(String n)
    {
        name=n;
        availseats=2;
    }

    void enterHall()
    {
        for(int i=1;i<=availseats;i++)
        {   
            availseats--;
            System.out.println("ENTRY");
            return;
        }
         System.out.println("Entry not Possible");
    }

    void exitHall()
    {
        availseats++;
        System.out.println("EXIT");
    }
    void display()
    {
        System.out.println("Total seats available in "+name+"Hall is "+availseats);
    }
}
class MainConference
{
    public static void main(String args[])
    {
        int availseats=2;
        ConferenceHall C1=new ConferenceHall("IOT_Conference");
        ConferenceHall C2=new ConferenceHall("ML_Conference");
        System.out.println("Total seats available= "+availseats);
        C1.enterHall();
        C1.enterHall();
        C1.enterHall();
        C1.display();
        C1.exitHall();
        C1.display();
        C2.enterHall();
        C2.enterHall();
        C2.exitHall();
        C2.display();
    }
}