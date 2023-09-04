package lucky7;
import java.util.Random;
public class lucky7harjoitus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub Do while
		Random random = new Random();
		
		int random1 = random.nextInt(10 - 1 + 1) + 1 ;
		int random2 = random.nextInt(10 - 1 + 1) + 1 ;
		int random3 = random.nextInt(10 - 1 + 1) + 1 ;
		
		System.out.println(random1);
		System.out.println(random2);
		System.out.println(random3);
		
		if (random1 == 7 || random2 == 7 || random3 == 7) {
			System.out.println("Voitit pelin!");
		}
		else {
			System.out.println("Hävisit pelin");
		}
		
	}

}
