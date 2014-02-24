
public class Jeu {
	private static final int DEFAULT_SIZE = 5;
	
	private final Plateau plateau;
	private final Coordonnees joueur;

	public Jeu(){
		plateau = new Plateau(DEFAULT_SIZE);
		joueur = plateau.depart();
	}	
	
	public void jouer(){
	}
}
