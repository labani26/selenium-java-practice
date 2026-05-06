package Pack1;

public class Benz extends Vehicle{
	
	public void make() {
		System.out.println("mercedes benz");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Benz object = new Benz();
		object.make();
		object.year();

	}

}
