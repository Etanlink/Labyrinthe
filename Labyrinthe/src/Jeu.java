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
    private final Plateau     plateau;
    /** TODO. */
    private final Coordonnees joueur;
    
    public 
    
    public static final int [] DEPLACER_HAUT = {0,-1};
    public static final int [] DEPLACER_BAS = {0, 1};
    public static final int [] DEPLACER_GAUCHE = {-1, 0};
    public static final int [] DEPLACER_DROITE = {1, 0};
    public int[] deplacement;
    
    /** TODO. */
    public Jeu() {
        plateau = new Plateau(DEFAULT_SIZE);
        joueur = plateau.depart();
    }
    
	 public void demanderMouvement(){
	    	System.out.println("Saisissez un mouvement :");
	    	Scanner sc = new Scanner(System.in);
	    	String str = sc.nextLine();
	    	char carac = str.charAt(0);
	 }
	 
	 public void mouvementEnCoordonnees(String touches){
		 if (touches == "z"){
			 this.deplacement=(DEPLACER_HAUT);
		 }
		 if (touches == "s"){
			 this.deplacement=(DEPLACER_BAS);
		 }
		 if (touches == "q"){
			 this.deplacement=(DEPLACER_GAUCHE);
		 }
		 if (touches == "d"){
			 this.deplacement=(DEPLACER_DROITE);
		 }
	 }

    /** TODO. */
    public void jouer() {
    	while (true /* joueur != arrivee */) {
    		/* Afficher le plateau. */
    		plateau.afficher();
    		/* Demander le mouvement. */
    		/* Classe Scanner. */ 
    		this.demanderMouvement();	
    			/* Transformer la saisie en deltas */
    			this.mouvementEnCoordonnees(carac);
    			/* Tenter le coup. */
    			this.testerMouvement(deplacement);
    			/* Appliquer le mouvement. */
    	}
	}

	private void testerMouvement(int[] deplacement2) {
		// TODO Auto-generated method stub
		
	}
}
