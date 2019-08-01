package java_basic;

public class Data_type {

	public static void main(String[] args) {

		double a = 10.3;
		double b = 9.6;
		double c = 10.1;
		
		System.out.println((a+b+c)/3);
		
		for(char i ='a';i<='z';i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		int x = 200;
		System.out.println("10진수 : " +x);
		System.out.format("8진수 : %o\n", x);
		System.out.format("16진수 : %x\n", x);

		String name ="Stephen curry";
		System.out.println(name);
		System.out.println(name.substring(0,1));
		System.out.println(name.substring(8,13));
	}

}
