/*train problem*/
import java.util.Scanner;
class Train
{
    int trainNo;
    String  name;
    String source, destination;

    Scanner ip=new Scanner(System.in);
    void readData()
    {
        System.out.println("Enter the train details");
        System.out.println("Enter the train number");
        trainNo=ip.nextInt();
        System.out.println("Enter the train name");
        name=ip.next();
        System.out.println("Enter the source of the train");
        source=ip.next();
        System.out.println("Enter the destination of the train");
        destination=ip.next();

    }
    void display()
    {
        System.out.println("Train No= "+trainNo+"    "+"Train Name= "+name+"   "+"Source= "+source+"   "+"Destination= "+destination);
    }
}

class MainTrain
{
    public static void main(String args[])
    {
        Train t[]=new Train[20];
        int n,i;
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter the number of trains");
        n=ip.nextInt();
        for(i=0;i<n;i++)
        {
            t[i]=new Train();
            t[i].readData();
            t[i].display();
        }
    }
}