/*employee problem*/
import java.util.Scanner;

class Employee
{
    String name;
    int ID;
    int salary;

    void readEmployee()
    {
        Scanner s=new Scanner(System.in);
        name=s.next();
        ID=s.nextInt();
        salary=s.nextInt();
    }
    void display()
    {
        System.out.println("Name="+name+"    "+"ID="+ID+"   "+"Salary="+salary);
    }
    
}

class MainEmployee
{
    public static void main(String args[])
    {
        Employee e[]=new Employee[10];
        int i, n;
        Employee temp;
        Scanner p=new Scanner(System.in);
        System.out.println("Enter the value of n");
        n=p.nextInt();
        for(i=0;i<n;i++)
        {
            System.out.println("Enter employee name, ID and Salary");
            e[i]=new Employee();
            e[i].readEmployee();
        }
        for(i=0;i<n;i++)
        {
            e[i].display();
        }       
            
    }
        

}

