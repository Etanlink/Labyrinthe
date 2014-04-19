package fr.iutvalence.java.tp2014.g2c.binome5.labyrinth;
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
	public static final int DEFAULT_SIZE = 10;
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
    	while(true) {
    		this.plateau.afficher();
    		while ((this.plateau.arrivee().i!=this.plateau.posJoueur().i)||(this.plateau.arrivee().j!=this.plateau.posJoueur().j)) {
    			/* Demander le mouvement. */
    			/* Appliquer le mouvement. */
    			try {
    					this.appliquerMouvement(demanderMouvement());
    				} 
    			catch (CaseNulleException e)
    				{
    					System.out.println("Attention tu sors");
    				}
    			/* Afficher Plateau. */
    			this.plateau.afficher();
    		}
    		System.out.println("Bravo/n Essaye ça maintenant");
    		this.plateau.dimension=this.plateau.dimension+5;
    	}
	}

	private void appliquerMouvement(SensDeplacement deplacement2) throws CaseNulleException {
		Coordonnees coordonneeCiblee = new Coordonnees(deplacement2.x()+this.plateau.posJoueur().i,deplacement2.y()+this.plateau.posJoueur().j);
		if(((coordonneeCiblee.i<0)||(coordonneeCiblee.j<0))||((coordonneeCiblee.i>=this.plateau.dimension)||(coordonneeCiblee.j>=this.plateau.dimension)))
			throw new CaseNulleException();
		Case caseCiblee = this.plateau.recupererCase(coordonneeCiblee);
		if(!(caseCiblee instanceof CaseMur)) this.plateau.rafraichirPlateau(coordonneeCiblee);	
		else System.out.println("non");
	}
	
	public static void main(String[] args) {
        Jeu j = new Jeu(); // Initialisation de la partie
        j.jouer(); // Premier tour de jeu
    }
}

