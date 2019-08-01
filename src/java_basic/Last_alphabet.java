package java_basic;

public class Last_alphabet {

	public static char function(String input) {
		return input.charAt(input.length()-1);
	}
	public static void main(String[] args) {
		System.out.println("hello World!의 마지막단어는 "+function("Hello World!"));
	}

}
