
public class Carte {
	private String couleur;
	private int valeur;
	public static String couleurs[] = {"pique", "carreau", "trefle", "coeur"};
	public static int valeurs[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
	
	public Carte(int v, String c){
		this.valeur = v;
		this.couleur = c;
	}

	public int isBetterThan(Carte carte){
		if(this.valeur == carte.getValeur())
			return 2;
		return (this.valeur > carte.getValeur() ? 1 : 0);
	}

	public String getCouleur() {
		return couleur;
	}

	public int getValeur() {
		return valeur;
	}
	
	public String toString(){
		return this.valeur+" de "+this.couleur;
	}
}
