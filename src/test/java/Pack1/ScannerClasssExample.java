package Pack1;

import java.util.Scanner;

public class ScannerClasssExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner myscanobj = new Scanner(System.in)) {
			//myscanobj is just the variable name for the Scanner.
			System.out.println("enter your name");
			
			
			String myName = myscanobj.nextLine(); //myName is a variable that will store the user’s name.

      //nextLine() reads an entire line of input from the user (until Enter is pressed).
			System.out.println("my name is "+myName);
			
			int myAge = myscanobj.nextInt();
			System.out.println("my age is"+myAge);
		}
		
		

	}

}
