package emailApp;
import java.util.*;
public class Email {
 
	//private so not every one can access it - Encapsulation
	private String firstname;
	private String lastname;
	private String department;
	private String password;
	private int mailBoxCapacity=500;
	private String alternateEmail;	
	private int defaultPasswordLength = 8;
	private String companySuffix = "mk.com";
	private String email;
	//constructor for firstname and lastname
	public Email(String firstname,String lastname)
	{  
		Scanner sc = new Scanner(System.in);
		this.firstname = firstname;
		this.lastname = lastname;
		System.out.println("Welcome :"+ firstname + " " + lastname);
		
	 //Call setDepartment
		 System.out.println("Choose the Department\n 1.Sales\n 2.Development\n 3.Accounting\n 4.For None");
		 int depChoice = sc.nextInt();
		   this.department = setDepartment(depChoice);
		  // System.out.println("Selected Department :" +this.department);
		   
		//create random password
		   this.password = setPassword(defaultPasswordLength);
		   System.out.println("Your Auto generated password is :" +this.password);
		   
		  //creating email syntax
		  //  firstname.lastname@department.company.com
		   this.email = firstname.toLowerCase() + "." + lastname.toLowerCase() + "@" + this.department.toLowerCase() + "." + companySuffix;
		   System.out.println("Your EmailId is :" + this.email);
	}
	//ask the department
	private String setDepartment(int depChoice)
	{
		if(depChoice == 1) {return "Sales";}
		if(depChoice == 2) {return "Development";}
		if(depChoice == 3) {return "Accounting";}
		return "";
	}
	
	//create random password
	private String setPassword(int defaltPasswordLength)
	{
		String possibleChar = "ABCdEFGHIJKlmnopQrsTuVwXyZ123456789!@#$%^&*()_-{}[]";
		char[] password = new char[defaultPasswordLength];
		for(int i=0;i<defaultPasswordLength;i++)
		{
			int rand = (int)(Math.random() * possibleChar.length());
			password[i] = possibleChar.charAt(rand);
		}
		return password.toString();
	}
	
	
	//change password
	public void setChangePassword(String password)
	{
		this.password = password;
	}
	
	//set mailBoxCapacity
	public void setMailBoxCapacity(int capacity)
	{
		this.mailBoxCapacity = capacity;
	}
	//set alternateEmail
	public void setAlternateEmail(String altEmail)
	{
		this.alternateEmail = altEmail;
	}

	public String getChangePassword() {return password;}
	public int getMailBoxCapacity() {return mailBoxCapacity;}
	public String getAlternateEmail() {return alternateEmail;}
	
	public String showDetails()
	{
		return "Hey " + firstname + " " + lastname + "\n" + "Your Department is " + this.department + "\n"
				+ "Passowrd : " +  this.password +"\n" + "Email : " + this.email + "\n" + "MailBoxCapacity is : " + this.mailBoxCapacity + "\n"
				+ "AlternamteEmail :" + this.alternateEmail + "";
		
	}
	
	
	
}
