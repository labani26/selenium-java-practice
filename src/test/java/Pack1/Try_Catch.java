package Pack1;

public class Try_Catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int a = 0;
			int b = 10;
			System.out.println(b/a);
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Exception Script");
			
		}
		
		catch (ArithmeticException ee) {
			System.out.println("ArithmeticException exp handling");
		}
		
		finally {
			System.out.println("script in finally");
		}
	}

}
