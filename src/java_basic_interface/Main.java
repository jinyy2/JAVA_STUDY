package java_basic_interface;

public class Main implements Dog, Cat {

	public static void main(String[] args) {
		Main main = new Main();
		main.crying();
		main.show();
		main.one();
		main.two();

	}

	@Override
	public void crying() {
		System.out.println("bowwow");		
	}

	@Override
	public void show() {
		System.out.println("Hello World!");
	}

	@Override
	public void two() {
		System.out.println("two");		
	}

	@Override
	public void one() {
		System.out.println("one");		
	}

}
