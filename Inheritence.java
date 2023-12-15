
import java.util.Scanner;
public class Inheritence {
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name :");
        String name = sc.next();
         sc.nextLine();

        System.out.print("Enter Code :");
        int code = sc.nextInt();
        sc.nextLine();
         

         System.out.print("Enter Speed :");
        int speed = sc.nextInt();
         sc.nextLine();

        System.out.print("Enter Grade :");
        String grade = sc.next();
         sc.nextLine();

        System.out.print("Enter Subject :");
        String subject = sc.next();
         sc.nextLine();

        System.out.print("Enter University :");
        String uni = sc.next();
         sc.nextLine();

        System.out.print("Enter Salary :");
        int salary = sc.nextInt();
         sc.nextLine();

         System.out.print("Enter Daily Wages :");
        int daily_wages= sc.nextInt();
         sc.nextLine();

        
        Staff staff = new Staff(code , name);
        Typist type = new Typist(code,name,speed);
        Officer officer = new Officer(code,name,grade);
        Teacher teacher = new Teacher(code,name,subject,uni);
        Regular regular = new Regular(code,name,salary);
        Casual casual = new Casual(code,name,daily_wages);

        System.out.println(staff.toString());
        System.out.println(type.toString());
        System.out.println(officer.toString());
        System.out.println(teacher.toString());
        System.out.println(regular.toString());
        System.out.println(casual.toString());
        
    }
    
}

class Staff
{
    protected int code;
    protected String name ;
    
        public Staff(int code ,String name )
        {
            this.code = code;
            this.name = name;

        }
        public int getCode()
        {
           return this.code;
        }
         public String getName()
        {
           return this.name;
        }
        public String toString()
        {
            return "\n\n"+ "Name: " + this.name+ "\n" +"code_No:" + this.code ;
        }
        

}

class Typist extends Staff
{
   
    private int speed ;
    
        public Typist(int code ,String name ,int speed)
        {
            super(code,name);
            this.speed = speed;

        }
        public int getSpeed()
        {
           return this.speed;
        }
        public String toString()
        {
            return "Speed: "+this.speed ;
        }
    

}

class Teacher extends Staff{
    private String subject;
    private String uni ;
    public Teacher(int code ,String name,String subject ,String uni)
    {
        super(code,name);
        this.subject = subject;
        this.uni = uni ;
    }
     public String getSubject()
        {
           return this.subject;
        }
         public String getUni()
        {
           return this.uni;
        }
     public String toString()
    {
            return "Subject: "+this.subject+"\n"+"University: "+this.uni ;
    }
    
}

class Officer extends Staff{
    private String grade;
    public Officer(int code,String name ,String grade)
    {
        super(code,name);
        this.grade = grade;

    }
     public String getGrade()
        {
           return this.grade;
        }
    public String toString()
    {
            return "Grade: "+this.grade ;
    }


}
class Regular extends Staff{
    private int salary;
    public Regular(int code,String name ,int salary)
    {
        super(code,name);
        this.salary = salary;
    }
    public int getSalary()
        {
           return this.salary;
        }
    public String toString()
    {
            return "Salary: "+this.salary ;
    }

}
class Casual extends Staff{
    private int daily_wages;
    public Casual(int code,String name ,int daily_wages)
    {
        super(code,name);
        this.daily_wages = daily_wages;
    }
     public int getDaily_Wages()
        {
           return this.daily_wages;
        }
    public String toString()
    {
            return "Daily Wages:"+this.daily_wages ;
    }

}


    


    







