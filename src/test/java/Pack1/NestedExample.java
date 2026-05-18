package Pack1;

import java.util.Scanner;

public class NestedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner myscanobj = new Scanner(System.in)) {
			int max_trans = 3;
			System.out.println("Enter trans number");
			int transNum = myscanobj.nextInt();
			
			if(transNum <= max_trans) {
				
				System.out.println("enter amount");
				int ent_amount = myscanobj.nextInt();
				
				if(ent_amount <= 10000) {
					System.out.println("Cash out");
					
				}else {
					
					System.out.println("max withdrawl amount is 10k only");
					
				}
				
			}else {
				
				System.out.println("max trans per day limited to 3 only");
			}
		}
		

	}

}
