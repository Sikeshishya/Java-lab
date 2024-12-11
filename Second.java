
import java.util.Scanner;

public class Second {
     public static class Student
    {
        Scanner sc=new Scanner(System.in);

        String name,Usn,Department;
        int age;
        Float GPA;
        Student() {
            
        }
        
         void getdata()
        {
            System.out.println("Enter Name");
            name=sc.nextLine();

            System.out.println("Enter USN");
            Usn=sc.nextLine();

            System.out.println("Enter Age");
            age=sc.nextInt();

            sc.nextLine();

            System.out.println("Enter Department");
            Department=sc.nextLine();

            System.out.println("Enter GPA");
            GPA=sc.nextFloat();

            

        }

        void printdata()
        {
            System.out.println("Name :"+name);
            System.out.println("USN :"+Usn);
            System.out.println("Department :"+ Department);
            System.out.println("Age :"+ age);
            System.out.println("GPA :"+GPA);


        }
    }

    public static void main(String[] args) {
        Student[] student=new Student[2];

        System.out.println("Enter 2 student details");

        for(int i=0;i<2;i++)
        {
            student[i]=new Student();
            student[i].getdata();
        }

        System.out.println("Details of students are");
        for(int i=0;i<2;i++)
        {
            student[i].printdata();
        }


    }
}
