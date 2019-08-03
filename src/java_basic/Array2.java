package java_basic;

public class Array2 {

	public static void main(String[] args) {
		int[] arr = new int[100];
		for(int i=0;i<100;i++) {
			arr[i] = (int)(Math.random() * 100 +1) ;//1~100
		}
		int sum = 0;
		for(int i=0;i<100;i++) {
			sum += arr[i];
		}
		System.out.println("100개의 평균  : "+sum/100);
	}

}
