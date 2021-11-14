package BasicPrograming;

public class NullArgment {

	public static void main(String[] args) {
		test(null);
		
	}
	
	public static void test(Object o) {
		System.out.println("Object");
	}
	
	public static void test(String s) {
		System.out.println("String");
	}
	
	
	

}
