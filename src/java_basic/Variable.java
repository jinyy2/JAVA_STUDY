package java_basic;

public class Variable {

	final static double PI = 3.141592;
	final static int INT_MAX = 2147483647;
	
	public static void main(String[] args) {
	
		int int_type = 31;
		double double_type = 5.31;
		String string_type = "jinyy2";
	
		System.out.println(int_type);
		System.out.println(double_type);
		System.out.println(string_type);
		
		int r = 5;
		System.out.println(r*r*PI);
		
		int a = INT_MAX;
		System.out.println(a);
		System.out.println(a+1);
		
	}

}