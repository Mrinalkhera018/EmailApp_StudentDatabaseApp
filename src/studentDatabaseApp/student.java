package studentDatabaseApp;
import java.util.*;
public class student {
 private String firstname;
 private String lastname;
 private String gradeYear;
 private String studentID;
 private String Courses="";
 private int tuitionBalance = 0;
 private static int courseCost = 600;
 private static int id = 1000;
 Scanner sc = new Scanner(System.in);
 // constructor to prompt studentname and id;
 public student()
 {
	
	 System.out.println("Enter firstname : ");
	 this.firstname = sc.nextLine();
	 System.out.println("Enter Lastname : ");
	 this.lastname = sc.nextLine();
	 
	 setGradeYear();
	 studentId();
	// System.out.println("StudentName :" + firstname + " " + lastname + " " + gradeYear +" "+ studentID);
 }
public void setGradeYear()
 {
	 System.out.println("Select the Grade Year :\n1.Class 1-5\n2.Class 6-10\n3.Class11-12\n4.Graduation\n");
	 String gy;
	 gy = sc.nextLine();
	 this.gradeYear = gy;
	 
 }
 //Generate ID
 public void studentId()
 {
	 id++;
	 this.studentID =  gradeYear + "" + id;
 }
 
 //Enroll in Courses
 public void enroll()
 { 
	 String course;
	
	 do
	 {
		 System.out.print("Enter course to enroll (Q to quit): ");
		 course = sc.nextLine();
	 if(!course.equals("Q"))
	 {   
		 
		 Courses += course +"\n";
		 tuitionBalance += courseCost;
		 
	 }
	 else
	 {
		 break;
	 }
	 }
	 while(1!=0);
	// System.out.println("Enrolled in :" + Courses + "TuitionBalance :" + tuitionBalance);
	 
 }
 public String toString()
 {
	 return "Hey " + firstname + " " + lastname + "\nGradeYear : " + this.gradeYear + "\nthis.studentId : "
			 + this.studentID + "\nCourses enrolled :\n" + Courses + "\nTuitionBalance : " + tuitionBalance + "";
 }

 //view balance
 
 //pay tuition
 
 //show status
 
}
