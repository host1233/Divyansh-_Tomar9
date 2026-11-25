class student{
    String name;                             //   instance variable
    int roll_number;                         //   instance variable
    String course;                           //   instance variable
   void show(){                              // method
   
                System.out.println("Name of Student:"+name);
                System.out.println("Roll Number of Student:"+roll_number);
                System.out.println("Course of Student:"+course);
                System.out.println("________________________________________________");
    }
}
 public class college{
    public static void main(String[]args){          // main class

                student s1=new student();          //object  1 of student class  // s1 is refrence variable
                student s2=new student();           //object of 2 student class   // s1 is refrence variable
                student s3=new student();             //object of 3 student class   // s1 is refrence variable
                student s4=new student();               //object of 4 student class   // s1 is refrence variable

        s1.name="divyansh tomar";
        s1.roll_number=111;
        s1.course="BCA";
        s1.show();                 // mathod call

        s2.name="aman";
        s2.roll_number=112;
        s2.course="BBA";
        s2.show();                // mathod call


        s3.name="Mohan";
        s3.roll_number=113;
        s3.course="B.COM";
        s3.show();                   // mathod call


        s4.name="Shyam";
        s4.roll_number=114;
        s4.course="BSC";
        s4.show();                        // mathod call
    }
}