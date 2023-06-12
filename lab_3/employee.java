import java.util.*;

class employee
{
    int empid;
    String name;
    double salary;
    String address;


    public employee(int empid,String name,double salary,String address)
    {
        this.empid=empid;
        this.name=name;
        this.salary=salary;
        this.address=address;
    }

}
class teacher extends employee
{
    String department;
    String subjectTaught;
    

    public teacher(int empid,String name,double salary,String address,String department,String subjectsTaught){
        super(empid,name,salary,address);
        this.department=department;
        this.subjectTaught=subjectsTaught;
       
    }
    public void display() {
        
        System.out.println("Employee ID: " + empid);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Address: " + address);
        System.out.println("Department: " + department);
        System.out.println("Subject Taught: " + subjectTaught);
        System.out.println();
    }

}
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of teachers");
        int n=sc.nextInt();
        teacher[] teach=new teacher[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("enter the employee id of "+ (i+1) +"employee");
            int empid=sc.nextInt();
            sc.nextLine();
            System.out.println("enter the name");
            String name=sc.nextLine();
            System.out.println("enter the salary");
            double salary=sc.nextDouble();
            sc.nextLine();
            System.out.println("enter the address");
            String address=sc.nextLine();
            System.out.println("enter the department");
            String department=sc.nextLine();
            System.out.println("enter the subject taught");
            String subjectTaught=sc.nextLine();
            teach[i]=new teacher(empid,name,salary,address,department,subjectTaught);
        }
        for(int i=0;i<n;i++)
        {
            teach[i].display();
        }

    }
}
