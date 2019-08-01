package java_basic;

public class Operator {
	final static int SECOND = 1000;
	public static void main(String[] args) {
		int minute = SECOND /60;
		int second = SECOND % 60;
		System.out.println(minute + "분" + second + "초");
		
		int a = 10;
		System.out.println("현재의 a는 " + a + "입니다."); 
		System.out.println("현재의 a는 " + ++a + "입니다."); 
		System.out.println("현재의 a는 " + a++ + "입니다."); 
		System.out.println("현재의 a는 " + a + "입니다.");

		System.out.println(1 % 3);
		System.out.println(2 % 3);
		System.out.println(3 % 3);
		System.out.println(4 % 3);
		System.out.println(5 % 3);
		System.out.println(6 % 3);
		
		int b = 10;
		System.out.println("a = b ?" + (a==b));
		System.out.println("a > b ?" + (a>b));
		System.out.println("a < b ?" + (a<b));
		System.out.println("a>b & a=b ?" + (a>b&&a==b));
		System.out.println("!a=10 ?" + !(a==10));
		
		int x = 20;
		int y = 30;
		System.out.println(max(x,y));
		
		double c = Math.pow(3.0, 10.0);
		System.out.println((int)c);
	}
	//반환형, 함수 이름, 매개 변
	static int max(int a, int b) {
		int result = (a>b) ? a : b;
		return result;
	}
}
