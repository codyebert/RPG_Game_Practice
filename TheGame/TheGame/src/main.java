
import java.lang.Math;
import java.util.Random;

public class main {

	public static void main(String[] args) 
	{
		int num = 0;
		for (int i = 0; i < 10; i++) {
		num = (int) (Math.random() * 50 + 1);
		System.out.println("Random number = " + num);
		}
	}

	
	void battle (Character atk, Character def) {
		int attack = atk.attack(atk.strength);
		int defense = def.defense(def.endurance);
		int damage = 0;
		
		if ( attack > defense ) {
			damage = (int) Math.random() * 10 + 1;
		}
		
		else {
			damage = (int) Math.random() * 3 + 1;
		}
	}
}
