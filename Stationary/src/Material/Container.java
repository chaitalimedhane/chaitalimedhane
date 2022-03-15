//Assignment 6
// Create one class having  two instant method having int return type and having one int parameter


package Material;

public class Container {
	
	// First Method
	public int M1 (int a) {
		System.out.println(a);
		return a;
	}

	
	// Second Method 
	public int M2 (int b) {
		System.out.println(b);
		return b;
}

	public static void main(String[] args) {
		Container Obj6 = new Container();
		Obj6.M1(10);
		Obj6.M2(12);
		
				
		

	}

}
