package emailApp;
import java.util.*;
public class EmailApp {
 public static void main(String[] args)
 {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Please enter your Firstname and Lastname");
	 
	 String firstname = sc.next();
	 String lastname = sc.next();
    Email emp1 = new Email(firstname,lastname);
   System.out.println("Press 1 to change your password");
   int newPassword = sc.nextInt();
   switch(newPassword)
   {
   case 1 : System.out.println("Enter new Password :");
     sc.nextLine();
             String newPass = sc.nextLine();
             emp1.setChangePassword(newPass);
             System.out.println("New Password is :");
             System.out.println(emp1.getChangePassword());break;
             
   default : System.out.println(emp1.getChangePassword());break;          
             
   }
   System.out.println("Press 1 to change Email Capacity");
   int newEmailCap = sc.nextInt();
   
   switch(newEmailCap)
   {
   case 1 : System.out.println("Enter new Email Capacity :");
  
             int newEmailC = sc.nextInt();
             emp1.setMailBoxCapacity(newEmailC);
             System.out.println("New Email Capacity is :");
             System.out.println(emp1.getMailBoxCapacity());break;
             
   default : System.out.println(emp1.getMailBoxCapacity());break;        
             
   }
   
   System.out.println("Press 1 to add AlternateEmail");
   int altMail = sc.nextInt();
   
   switch(altMail)
   {
   case 1 : System.out.println("Enter Alternate Email :");
   sc.nextLine();
             String altEm = sc.nextLine();
             emp1.setAlternateEmail(altEm);
             System.out.println("Alternate Email is  :");
             System.out.println(emp1.getAlternateEmail());break;
             
   default : System.out.println("");break;          
             
   }
   System.out.println("YOUR COMPLETE DETAILS ARE:");
   System.out.println(emp1.showDetails());
   
   
   
 }
}
