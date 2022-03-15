//Assignment 4
//Create one class having  two instant method without return type and having one int parameter


package Material;

public class Erasor {
	
	// First Method
	
	public void M1(int a) {
		System.out.println(a); 
	}

	// Second Method
	
	public void M2(int b) {
	    System.out.println(b);
	}
	
	public static void main(String[] args) {
		Erasor Obj4 = new Erasor();
		Obj4.M1(4);
		Obj4.M2(2);

	}

}
