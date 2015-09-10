import java.util.Scanner;
public class HelloMyName {

	public static void main(String[] args) {
		//instantiation		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your username.");
		String userName = keyboard.nextLine();

		System.out.println("Enter your password.");
		String password = keyboard.nextLine();
		System.out.print("Hello " + userName + ", ");
		System.out.println("Welcome to CSC-200!\nYour password is " + password + ".");
		keyboard.nextLine();
		keyboard.close();
		
		
	

	}

}


