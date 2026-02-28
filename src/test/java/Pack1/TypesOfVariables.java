package Pack1;

public class TypesOfVariables {
	
	int p = 50;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//add();
		multiple();
	}
	
	private static void multiple() {
		// TODO Auto-generated method stub
	    //className object = new classNamr ();
		//object.
		TypesOfVariables obj = new TypesOfVariables();
		
		//int p = 30;
		int q = 40;
		int r = obj.p*q;
		
		System.out.println(r);
		
	}

	public static void add() {
		
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);
	}

}
