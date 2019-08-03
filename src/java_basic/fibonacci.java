package java_basic;

public class fibonacci {
	public static int fibonacci(int number) {
		int i = 1;
		int j = 1;
		int result = - 1;
		if (number == 1) {
			return i;
		} else if (number == 2) {
			return j;
		} else {
			for(int k=2;k<number;k++) {
				result = i + j;
				i = j;
				j = result;
			}
		}
		return result;
	}
	public static int fibonacci2(int number) {
		if(number == 1) {
			return 1;
		} else if (number == 2){
			return 1;
		} else {
			return fibonacci2(number-1)+fibonacci2(number-2);
		}
	}
	public static void main(String[] args) {
		System.out.println("fibonacci(10) : " + fibonacci(10));
		System.out.println("fibonacci(10) : " + fibonacci2(10));
		
	}

}
