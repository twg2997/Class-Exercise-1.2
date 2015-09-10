import java.util.Scanner;
public class SemanticError2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int height = 0, width = 0, depth = 0;
		System.out.println("Enter the height, width, and depth of");
		System.out.println("a box and I will compute the volume.");
		System.out.println();
		System.out.println("What is the height?");
		Scanner keyboard = new Scanner(System.in);
		height = keyboard.nextInt();
		System.out.println("What is the width?");
		width = keyboard.nextInt();
		System.out.println("What is the depth?");
		depth = keyboard.nextInt();
		keyboard.close();
		
		int volume = height * width * depth;
		
		System.out.println("The volume is " + volume + ".");
	}

}
