package lucky7;
import java.util.Random;
import java.util.Scanner;
public class lucky7harjoitus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub Do while
		Random random = new Random();
		Scanner in = new Scanner(System.in);
		

		String raha;
		int nraha;
		boolean tryagain;
		
		do { System.out.println("Millä raha määrällä haluat pelata?");
	raha = in.nextLine(); 
	 if (raha.matches("[0-9]*")){
		 tryagain = false;
	 }
	 else {
		 tryagain = true;
		 System.out.println("Virhe! Anna numero!");
	 }
	
		} while (tryagain);
	
	nraha = Integer.parseInt(raha);
		String vastaus;
		
		
		
		do {
			
	if (nraha == 0) {
		break;
	}
	
		System.out.println("Haluatko pelata? y/n");
		vastaus = in.nextLine();
		int random1 = random.nextInt(10 - 1 + 1) + 1 ;
		int random2 = random.nextInt(10 - 1 + 1) + 1 ;
		int random3 = random.nextInt(10 - 1 + 1) + 1 ;
				 //random.nextInt(10 - 1 + 1) + 1 ;
	
			if(vastaus.equals("y"))	{	
				System.out.println(random1);
				System.out.println(random2);
				System.out.println(random3);
			
			if (random1 == 7 && random2 == 7 && random3 == 7) {
					System.out.println("Voitit 10 euroa");
					nraha+=10;
					continue;
				 }
		else if (random1 == 7 && random2 == 7) {
			System.out.println("Voitit 5 euroa");	
			nraha+=5;
			continue;
		}
		else if (random1 == 7 && random3 == 7) {
			System.out.println("Voitit 5 euroa");
			nraha+=5;
			continue;
		}
		else if (random2 == 7 && random3 == 7) {
			System.out.println("Voitit 5 euroa");
			nraha+=5;
			continue;
			
		}

		else if (random1 == 7 || random2 == 7 || random3 == 7) {
				System.out.println("Voitit 3 euroa!");
				nraha+=3;
			
		}
		else {
			System.out.println("Hävisit euron");
			nraha--;
				
		
		}

		}
		

			
			else if (vastaus.equals("n")) {
				System.out.println("Lopetetaan peli, sinulle jäi " + nraha + " euroa.");
			}
			else 
			System.out.println("Virhe! Vastaa y jos haluat jatkaa pelia ja vastaa n jos haluat lopettaa pelin");
		} while (!vastaus.equals("n")); {
		if (nraha == 0) {
			System.out.println("Sinulta loppui rahat!");
		}
		}
		
		}
	
	}


