package java_basic;

public class Loop4 {

	public static void main(String[] args) {
		int count = 0;
		for(;;) {
			System.out.println("print");
			count++;
			if(count==10) {
				break;
			}
		}
	}

}
