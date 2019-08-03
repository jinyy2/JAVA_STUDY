package java_basic;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student("홍길동", 20, 175, 70, "20190803", 1, 4.5);
		Student student2 = new Student("이순신", 30, 170, 80, "20090803", 4, 4.2);
		student1.show();
		student2.show();
		Teacher teacher1 = new Teacher("세종대왕", 20, 190, 67, "20050803", 4000000, 2);
		teacher1.show();

		Student[] students = new Student[100];
		for(int i = 0;i<100;i++) {
			students[i] = new Student("홍길동", 20, 175, 70, i+"",1,4.5);
			students[i].show();
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("총 몇 명의 학생이 존재합니까? ");
		int number = sc.nextInt();
		Student[] student_arr = new Student[number];
		for(int k=0;k<number;k++) {
			String name;
			int age;
			int height;
			int weight;
			String studentID;
			int grade;
			double gPA;
			System.out.println("학생의 이름을 입력하세요 : ");
			name = sc.next();
			System.out.println("학생의 나이를 입력하세요 : ");
			age = sc.nextInt();
			System.out.println("학생의 키를 입력하세요 : ");
			height = sc.nextInt();
			System.out.println("학생 몸무게를 입력하세요 : ");
			weight = sc.nextInt();
			System.out.println("학생의 학번을 입력하세요 : ");
			studentID = sc.next();
			System.out.println("학생의 학년을 입력하세요 : ");
			grade = sc.nextInt();
			System.out.println("학생의 학점을 입력하세요 : ");
			gPA = sc.nextDouble();
		
			for(int i=0;i<number;i++) {
				student_arr[i].show();
			}
		}
	}
}
