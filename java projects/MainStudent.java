/*student data problem*/
import java.util.Scanner;
class Student
{
    String name;
    int reg_no;
    int m1, m2, m3;
    float avg;
    
    void Read_Student()
    {
        Scanner s=new Scanner(System.in);
        name=s.next();
        reg_no=s.nextInt();
        m1=s.nextInt();
        m2=s.nextInt();
        m3=s.nextInt();
    }
    void CalAvg()
    {
        avg=(m1+m2+m3)/(3);
    }
    void Display()
    {
        System.out.println("Name="+name+"|"+"Reg No="+reg_no+"|"+"M1="+m1+"|"+"M2="+m2+"|"+"M3="+m3+"|"+"Average="+avg);
    }
}
class MainStudent
{
    public static void main(String args[])
    {
        int n, i;
        Student[] m=new Student[10];
        Scanner p=new Scanner(System.in);
        System.out.println("Enter the value of n");
        n=p.nextInt();
        for(i=0;i<n;i++)
        {
            System.out.println("Enter student's name, Reg no and marks of 3 subjects");
            m[i]=new Student();
            m[i].Read_Student();
        
        }
        for(i=0;i<n;i++)
        {
            m[i].CalAvg();
            m[i].Display();
        }

    }
}