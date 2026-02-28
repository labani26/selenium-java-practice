package Pack1;

import java.util.Scanner;

public class NestedExample2 {

    public static void main(String[] args) {
        
        Scanner myscanobj = new Scanner(System.in);
        
        int max_time = 5;
        
        System.out.println("Enter transaction number:");
        int time = myscanobj.nextInt();
        
        if (time <= max_time) {
            
            System.out.println("Enter amount:");
            int amount = myscanobj.nextInt();
            
            if (amount <= 15000) {
                System.out.println("Cash out");
            } else {
                System.out.println("Max amount is 15000");
            }
            
        } else {
            
            System.out.println("Max transaction time is 5 only");
        }
        
        myscanobj.close();
    }
}
