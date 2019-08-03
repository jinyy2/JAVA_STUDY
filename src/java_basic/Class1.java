package java_basic;

public class Class1 {

	public static void main(String[] args) {
		Class1_node one = new Class1_node(10,20);
		Class1_node two = new Class1_node(30,40);
		Class1_node result = one.getCenter(two);
		System.out.println("x : " + result.getX() + ", y : " + result.getY());
		
	}

}
