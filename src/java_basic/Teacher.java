package java_basic;

public class Teacher extends Person{
	private String TeacherID;
	private int month_salary;
	private int worked_year;
	public String getTeacherID() {
		return TeacherID;
	}
	public void setTeacherID(String teacherID) {
		TeacherID = teacherID;
	}
	public int getMonth_salary() {
		return month_salary;
	}
	public void setMonth_salary(int month_salary) {
		this.month_salary = month_salary;
	}
	public int getWorked_year() {
		return worked_year;
	}
	public void setWorked_year(int worked_year) {
		this.worked_year = worked_year;
	}
	public Teacher(String name, int age, int height, int weight, String teacherID, int month_salary, int worked_year) {
		super(name, age, height, weight);
		TeacherID = teacherID;
		this.month_salary = month_salary;
		this.worked_year = worked_year;
	}
	
	public void show() {
		System.out.println("----------------------");
		System.out.println("교사 이름 : " + getName());
		System.out.println("교사 나이 : " + getAge());
		System.out.println("교사 키 : " + getHeight());
		System.out.println("교사 몸무게 : " + getWeight());
		System.out.println("교직원 번호 : " + getTeacherID());
		System.out.println("교사 월급 : " + getMonth_salary());
		System.out.println("교사 연차 : " + getWorked_year());
	}
	
}
