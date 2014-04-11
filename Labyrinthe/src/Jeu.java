/* TODO Package. */
import java.util.Scanner;

/**
 * TODO.
 *
 * @author TODO
 * @version TODO
 */
public class Jeu {
    /** TODO. */
	private static final int DEFAULT_SIZE = 2;
    /** TODO. */
    private final Plateau plateau;
    /** TODO. */
    private final Coordonnees joueur;
    
    public SensDeplacement[] deplacement;
    
    /** TODO. */
    public Jeu() {
        plateau = new Plateau(DEFAULT_SIZE);
        joueur = plateau.depart();
    }
    
	 private SensDeplacement demanderMouvement() {
	    	System.out.println("Saisissez un mouvement :");
	    	Scanner sc = new Scanner(System.in);
	    	String str = sc.nextLine();
	    	return Mouvement.mouvementEnCoordonnees(str);
	 }

    /** TODO. */
    public void jouer() {
    	while (true /* joueur != arrivee */) {
    		/* Afficher le plateau. */
    		plateau.afficher();
    		/* Demander le mouvement. */
    		this.testerMouvement(demanderMouvement());
    		/* Appliquer le mouvement. */
    	}
	}

	private void testerMouvement(SensDeplacement deplacement2) {
		// TODO Auto-generated method stub
		if SensDeplacement = HAUT
	}
}
