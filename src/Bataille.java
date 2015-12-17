import java.util.ArrayList;
import java.util.Collections;

public class Bataille {

	public static void main(String[] args) {
		
		Joueur J1 = new Joueur("Phil");
		Joueur J2 = new Joueur("Collins");
		
		ArrayList<Carte> paquet = new ArrayList<Carte>();
		
		int i=0;
		for(int j = 0; j<Carte.couleurs.length; j++){
			for (int k = 0; k < Carte.valeurs.length; k++) {
				Carte carte = new Carte(Carte.valeurs[k], Carte.couleurs[j]);
				paquet.add(carte);
				System.out.println(paquet.get(i));
				i++;
			}
		}
		
		Collections.shuffle(paquet);
		
		for(i=0; i<paquet.size(); i=i+2){
			J1.tireCarte(paquet.get(i));
			J2.tireCarte(paquet.get(i+1));
		}
		
		System.out.println("\n\nDébut du game :");
		int gain = 1;
		for(i=J1.getSet().size(); i>0; i--){
	
			if(J1.getSet().get(i-1).isBetterThan(J2.getSet().get(i-1)) == 1){
				J1.setPoints(gain);
				System.out.println(J1+" : "+J1.getPoints());
				gain = 1;
			}
			else if(J1.getSet().get(i-1).isBetterThan(J2.getSet().get(i-1)) == 0){
				J2.setPoints(gain);
				System.out.println(J2+" : "+J2.getPoints());
				gain = 1;
			}
			else
				gain = 2;
		}
		
		if(J1.getPoints() > J2.getPoints())
			System.out.println("Le vainqueur est Phil ! Il payze dans le game.");
		else if(J1.getPoints() < J2.getPoints())
			System.out.println("Le vainqueur est Collins ! Il payze dans le game.");
		else
			System.out.println("Égalité ! Phil et Collins payzent dans le game.");
	}
}
