package lab5;

class STUDENT 
{
    String name;
    int age;
    Subject[] subjects;
    int t;
    double avg;
    public STUDENT(String n, int a) 
    {
        this.name = n;
        this.age = a;
        subjects = new Subject[5];
        t = 0;
        avg = 0.0;
    }
    class Subject 
    {
        String subjectName;
        int marks;
        public Subject(String n, int m) 
        {
            this.subjectName = n;
            this.marks = m;
        }
        public void display() 
        {
            System.out.println("Subject: " + subjectName + "\tMarks: " + marks);
        }
    }
    public void addSub(String n, int m) 
    {
        for (int i = 0; i < subjects.length; i++) 
        {
            if (subjects[i] == null) 
            {
                subjects[i] = new Subject(n, m);
                t += m;
                break;
            }
        }
    } 
    public void calcAvg() 
    {
        avg = t / subjects.length;
    }
    public void display() 
    {
        System.out.println("Name: " + name + "\nAge: " + age);
        for (Subject subject : subjects) 
        {
            if (subject != null) 
                subject.display();
        }
        System.out.println("Total Marks: " + t + "\nAverage Marks: " + avg);
    }
}

public class ANS_A 
{
    public static void main(String[] args) 
    {
        STUDENT student = new STUDENT("Harsh", 19);
        student.addSub("OOP", 100);
        student.addSub("CM", 82);
        student.addSub("ACE", 74);
        student.addSub("FEE", 75);
        student.addSub("MSB", 71);
        student.calcAvg();
        System.out.println("Student details:");
        student.display();
    }
}