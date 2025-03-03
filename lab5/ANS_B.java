package lab5;

class EMPLOYEE 
{
    String eName;
    double salary;
    Department[] departments;
    public EMPLOYEE(String n, double s) 
    {
        this.eName = n;
        this.salary = s;
        departments = new Department[5];
    }
    class Department 
    {
        String departmentName;
        String location;
        public Department(String n, String l) 
        {
            this.departmentName = n;
            this.location = l;
        }
        public void display() 
        {
            System.out.println("Department Name: " + departmentName + "\tLocation: " + location);
        }
    }
    public void addDept(String n, String l) 
    {
        for (int i = 0; i < departments.length; i++) 
        {
            if (departments[i] == null) 
            {
                departments[i] = new Department(n, l);
                break;
            }
        }
    }
    public void display() 
    {
        System.out.println("Employee Name: " + eName + "\nSalary: " + salary);
        for (Department dept : departments) 
        {
            if (dept != null)
                dept.display();
        }
    }
}

public class ANS_B 
{
    public static void main(String[] args) 
    {
        EMPLOYEE emp = new EMPLOYEE("KUSH", 50000);
        emp.addDept("Marketing", "Delhi");
        emp.addDept("Finance", "Mumbai");
        emp.display();
    }
}