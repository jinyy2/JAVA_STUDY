package java_basic;

public class Class1_node {

	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public Class1_node(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Class1_node getCenter(Class1_node other) {
		return new Class1_node((this.x + other.getX())/2,(this.y + other.getY())/2);	
		}
	
}
