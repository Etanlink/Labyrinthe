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
	public static final int DEFAULT_SIZE = 2;
    /** TODO. */
    public final Plateau plateau;
    /** TODO. */
    public final Coordonnees joueur;
    
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
		this.plateau.afficher();
    	while ((this.plateau.arrivee().i!=this.plateau.posJoueur().i)||(this.plateau.arrivee().j!=this.plateau.posJoueur().j)) {
    		/* Demander le mouvement. */
    		/* Appliquer le mouvement. */
    		this.appliquerMouvement(demanderMouvement());
    		/* Afficher Plateau. */
    		this.plateau.afficher();
    	}
    	System.out.println("Bravo");
	}

	private void appliquerMouvement(SensDeplacement deplacement2) {
		this.plateau.rafraichirPlateau(new Coordonnees(deplacement2.x(),deplacement2.y()));		
	}
	
	public static void main(String[] args) {
        Jeu j = new Jeu(); // Initialisation de la partie
        j.jouer(); // Premier tour de jeu
    }
}

