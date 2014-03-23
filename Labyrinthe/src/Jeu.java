/* TODO Package. */

/**
 * TODO.
 *
 * @author TODO
 * @version TODO
 */
public class Jeu {
    /** TODO. */
	private static final int DEFAULT_SIZE = 5;
    /** TODO. */
    private final Plateau     plateau;
    /** TODO. */
    private final Coordonnees joueur;

    /** TODO. */
    public Jeu() {
        plateau = new Plateau(DEFAULT_SIZE);
        joueur = plateau.depart();
        Coordonnees.getCoordonneesJoueur();
    }

    /** TODO. */
    public void jouer() {
		/* Afficher le plateau. */
		/* Demander le mouvement. */
		/* Classe Scanner. */ 
		/* Appliquer le mouvement. */
		/* Transformer la saisie en deltas */
		/* Tenter le coup. */
		/* Retour �tape 1. */
	}
}
