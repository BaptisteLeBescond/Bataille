import java.util.ArrayList;

public class Joueur {
	private String nom;
	private int points;
	private ArrayList<Carte> set = new ArrayList<Carte>();
	
	public Joueur(String nom){
		this.nom = nom;
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getPoints() {
		return points;
	}
	
	public void setPoints(int points){
		this.points += points;
	}

	public ArrayList<Carte> getSet() {
		return set;
	}

	public void tireCarte(Carte carte){
		set.add(carte);
	}
	
	public String toString(){
		return this.nom;
	}
}
