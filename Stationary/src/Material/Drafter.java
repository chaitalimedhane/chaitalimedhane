//Assignment 7

//Assignment 7
//Create another class having  two static method having float return type and having one float parameter 


package Material;

public class Drafter {
	
	public static float M1 (float a) {
		System.out.println(a);
		return a;
	}
	
	public static float M2 (float b) {
		System.out.println(b);
		return b;
		
	}

	public static void main(String[] args) {
		
		M1(2);
		M2(4);
		M1(2.5f);
		M2(4.5f);

	}
	
}


