 import java.util.Scanner; 

 public class LoginWithWhile 
 {

	public static void main(String[] args) 
	{
		String username1,username2,password1, password2;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your username");
		username1 = keyboard.next();
		System.out.println("Enter your password");
		password1 = keyboard.next();
		System.out.println("Confirm your username");
		username2 = keyboard.next();
		System.out.println("Confirm your password");
		password2 = keyboard.next();
		
		while(!(username1.equals(username2) && password1.equals(password2)))		
		{
			System.out.println("You have entered a wrong username or password. Please try again!");
			System.out.println("Enter your username one more time");
			username2 = keyboard.next();
			System.out.println("Enter your password");
			password2 = keyboard.next();
	
		}
			System.out.println("Welcome " + username1 + "!");
	
	}

  }
