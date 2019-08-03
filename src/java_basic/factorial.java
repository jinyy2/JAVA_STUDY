package java_basic;

public class factorial {
	public static int factorial(int number) {
		int sum = 1;
		for (int i=2;i<=number;i++) {
			sum *= i;
		}
		return sum;
	}	
	public static int factorial2(int number) {
		if(number == 1) {
			return 1;
		} else {
			return number * factorial2(number-1);
		}
			
	}
	public static void main(String[] args) {
		System.out.println("factorial(10) : " + factorial(10));	
		System.out.println("factorial(10) : " + factorial2(10));	
		}

}
