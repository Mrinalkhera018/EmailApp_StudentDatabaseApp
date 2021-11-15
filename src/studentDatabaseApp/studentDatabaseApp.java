package studentDatabaseApp;
import java.util.*;
public class studentDatabaseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 //Ask how many new users to be added
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students to enroll :");
		int n = sc.nextInt();
		//create n number of new students
		student[] students = new student[n];
		for(int i=0;i<n;i++)
		{ 
			System.out.println();
			System.out.println("Enter the details of student " + (int)(i+1));
	     students[i] = new student();
	     students[i].enroll();
	     
		}
		
		System.out.println("-----------------------------------------");
		for(int i=0;i<n;i++)
		{
	     System.out.println(students[i].toString());
	 	System.out.println("-----------------------------------------");
		}
	
         
		
	
	}

}
