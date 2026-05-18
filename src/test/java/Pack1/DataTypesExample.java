package Pack1;

public class DataTypesExample {

	public static void main(String[] args) {

		// byte range: -128 to 127
		// byte b = 129; // Error: value out of range

		byte b = 127;
		System.out.println("Byte value: " + b);

		short sh = 4569;
		System.out.println("Short value: " + sh);

		int x = 12345;
		System.out.println("Integer value: " + x);

		long bh = 987643279L;
		System.out.println("Long value: " + bh);

		double g = 10.76; // for decimal values
		System.out.println("Double value: " + g);

		float f = 12.98f; // float value must end with 'f'
		System.out.println("Float value: " + f);

		boolean t = true;
		boolean ff = false;

		System.out.println("Boolean true value: " + t);
		System.out.println("Boolean false value: " + ff);

		char ch = 'k'; // character should be inside single quotes
		System.out.println("Character value: " + ch);

		String sc = "selenium";
		System.out.println("String value: " + sc);

		// Syntax:
		// DataType variableName = value;

	}
}