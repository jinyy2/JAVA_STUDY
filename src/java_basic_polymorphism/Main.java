package java_basic_polymorphism;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("바나나 : 1, 딸기 : 2 ?");
		int input = sc.nextInt();
		Fruits fruits;
		if(input == 1) {
			fruits = new banana();
			fruits.show();
		}
		if(input == 2) {
			fruits = new Strawberry();
			fruits.show();
		}
//		Fruits fruits = new banana();
//		Fruits fruits2= new Strawberry();
//		fruits.show();
//		fruits2.show();
	}

}
