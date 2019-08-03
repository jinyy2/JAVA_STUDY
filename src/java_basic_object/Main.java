//package java_basic_object;
//
//public class Main {
//
//	public static void main(String[] args) {
//		Archer archer1 = new Archer("archer1","상");
//		Archer archer2 = new Archer("archer2","중");
//		Archer archer3 = new Archer("archer1","상");
//		System.out.println(archer1 == archer2);
//		System.out.println(archer1 == archer3);
//		System.out.println(archer1.equals(archer3));
//	}
//
//}

package java_basic_object;

public class Main {

	public static void main(String[] args) {
		Hero[] heros = new Hero[3];
		heros[0] = new Warrior("Warrior");
		heros[1] = new Archer("Archer");
		heros[2] = new Wizard("Wizard");
		
		for(int i=0;i<3;i++) {
			heros[i].attack();
			
			if(heros[i] instanceof Warrior) {
				Warrior temp = (Warrior)heros[i];
				temp.warrior_skill();
			} else if (heros[i] instanceof Archer) {
				Archer temp = (Archer)heros[i];
				temp.archer_skill();
			} else if(heros[i] instanceof Wizard) {
				Wizard temp = (Wizard)heros[i];
				temp.wizard_skill();
			}
		}
	}

}
