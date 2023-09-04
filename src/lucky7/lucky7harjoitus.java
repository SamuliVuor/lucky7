package lucky7;
import java.util.Random;
import java.util.Scanner;
public class lucky7harjoitus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub Do while
		Random random = new Random();
		Scanner in = new Scanner(System.in);
		

		int raha = 1;
		String vastaus;
		
		do {
		System.out.println("Haluatko pelata? y/n");
		vastaus = in.nextLine();
		int random1 = random.nextInt(10 - 1 + 1) + 1 ;
		int random2 = random.nextInt(10 - 1 + 1) + 1 ;
		int random3 = random.nextInt(10 - 1 + 1) + 1 ;
	
			if(vastaus.equals("y"))	{	
				System.out.println(random1);
				System.out.println(random2);
				System.out.println(random3);
		if (random1 == 7 || random2 == 7 || random3 == 7) {
			System.out.println("Voitit 3 euroa!");
			raha+=3;
			
		}
		else if (random1 == 7 && random2 == 7) {
			System.out.println("Voitit 5 euroa");	
			raha+=5;
		}
		else if (random1 == 7 && random3 == 7) {
			System.out.println("Voitit 5 euroa");
			raha+=5;
		}
		else if (random2 == 7 && random3 == 7) {
			System.out.println("Voitit 5 euroa");
			raha+=5;
			
		}
		else if (random1 == 7 && random2 == 7 && random3 == 7) {
			System.out.println("Voitit 10 euroa");
			raha+=10;
			
		}
		else {
			System.out.println("Hävisit euron");
			raha--;
		}
			}
			else if (vastaus.equals("n")) {
				System.out.println("Lopetetaan peli, sinulle jäi " + raha + " euroa");
			}
			else 
			System.out.println("Virhe! Vastaa y jos haluat jatkaa pelia ja vastaa n jos haluat lopettaa pelin");
		} while (raha >= 0 || !vastaus.equals("n")); {
		if (raha == 0) {
			System.out.println("Sinulta loppui rahat!");
		}
		}
		
		}
	
	}


