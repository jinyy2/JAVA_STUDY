package java_basic;

public class Condition1 {

	public static void main(String[] args) {
		String a = "Man";
		int b = 0;
		
		//java는 String을 비교할 때 equal()을 이용합니다.
		//그 이유는 String은 다른 자료형과 다른 문자열 자료형이기 때문입니다.
		
	if(a.equals("Man")){
		System.out.println("man");
	}else {
		System.out.println("female");
	}
	if (b==3) {
		System.out.println("3");
		
	}else {
		System.out.println("not 3");
	}
	
	if(a.equalsIgnoreCase("man")&& b==0) {
		System.out.println("true.");
	}else {
		System.out.println("false.");
	}
	
	}

}
