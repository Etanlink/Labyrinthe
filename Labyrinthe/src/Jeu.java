/* TODO Javadoc. */
/* TODO Package. */
public class Jeu {
	private static final int DEFAULT_SIZE = 5;
	
	private final Plateau plateau;
	private final Coordonnees joueur;

	public Jeu(){
		plateau = new Plateau(DEFAULT_SIZE);
		joueur = plateau.depart();
		Coordonnees.getCoordonnéesJoueur();
	}	
	
	public void jouer(){
		/* Afficher le plateau. */
		/* Demander le mouvement. */
		/* Classe Scanner. */ 
		/* Appliquer le mouvement. */
		/* Transformer la saisie en deltas */
		/* Tenter le coup. */
		/* Retour étape 1. */
	}
}
