 import java.util.Scanner;
public final class LoginWithFor 
{	
	public static void main(String[] args) 
	{
		String username1, password1, username2, password2;

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Create a your username");
		username1 = keyboard.next();
		System.out.println("Create your password");
		password1 = keyboard.next();
		System.out.println("Confirm your username");
		username2 = keyboard.next();
		System.out.println("Confirm your password");
		password2 = keyboard.next();
		
		if ((username1.equals(username2) && password1.equals(password2)))
			
			System.out.println("Welcome " + username2 + "!");
		else 
			System.out.println("Wrong username or password. Please try again !");
		if (!(username1.equals(username2) && password1.equals(password2)))
		{
			for (int start = 1; start <3; start ++)
			 {
				System.out.println("Enter your username");
				username2 = keyboard.next();
				System.out.println("Enter your password");
				password2 = keyboard.next();
			 }
			  if (!(username1.equals(username2) && password1.equals(password2)))
			  System.out.println("Your account has been locked. Please contact your adminstrator!");
		
			  else
			  System.out.println("Welcome " + username2 + "!");
		}
		    
	}
}
