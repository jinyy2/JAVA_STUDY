package java_basic;

public class Func_max {
	public static int max(int a, int b) {
		return (a > b) ? a : b;
	}
	
	public static int function(int a, int b, int c) {
		int result = max(a,b);
		result = max(result,c);
		return result;
	}
	public static void main(String[] args) {
		System.out.println("(345,456,567)중 가장 큰 값 : "+function(345,456,567));

	}

}
