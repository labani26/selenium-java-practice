package Pack1;

public class OperatorsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Arithmetic operators - " */%+- "
		
		int a = 10;
		int b = 20;
		
		
		System.out.println(a + b);   // 30
		System.out.println(a * b);   // 200
		System.out.println(b / a);   // 2
		System.out.println(b - a);   // 10
		System.out.println(a - b);   // -10
		System.out.println(b % 8);   // 4

		//Relational operator - "< > <= >= == !="
	
		System.out.println(a > b);    
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println(a >= b);
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a > 40);
		System.out.println(b >= 20);
		System.out.println(b != 50);

        //Logical operator = "&& - and, || - or"
//		true && true = true
//		true && false = false
//		false && false = false
//		false && true = false
		
//		true || true = true
//		false || true = true
//		true || false = true
//		false || false = false
		System.out.println(a < b && a == 10); 
		//true
		System.out.println(a == b && b > a);    
		//false
		System.out.println(b == 20 && a == b );
		//false
		System.out.println(a != 10 && b < a );
		//false
		System.out.println(b < a && b == 10);
		
		
		System.out.println(a < b || a == 10); 
		//true
		System.out.println(a == b || b > a);    
		//true
		System.out.println(b == 20 || a == b );
		//true
		System.out.println(a != 10 || b < a );
		//false
		System.out.println(b < a || b == 10);
		//false
		
		//Assignment operator = "= += -= *= /= %=
		
		int c = 87;
		int d = 9;
		int e = 76;
		
		//a = a + 40;
		a += 40;
		b -= 60;
		c *= 70;
		d /=98;
		e %= 97;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);

	}

}
