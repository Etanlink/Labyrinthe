package fr.iutvalence.java.tp2014.g2c.binome5.labyrinth;
import java.util.Scanner;

/**
*
* OLIVIER Etienne - BERTRAND Hugo
* version 2.0
*/
public class Jeu {

    /** variable contenant l'instance du plateau d'un tour de jeu */
    public final Plateau plateau;
    /** variable contenant les coordonnées du jeoueur */
    public final Coordonnees joueur;
    /** variable contenant le sens de déplacement du tour en cours*/
    public SensDeplacement[] deplacement;
    
    /**
     *  1. 
     *  crée un nouveau plateau de dimension par défaut
     *  place le joueur sur la première case */
    public Jeu(int dimension) {
        plateau = new Plateau(dimension);
        joueur = plateau.depart();
    }
    
    /** demande le mouvement au clavier au joueur*/
	 private SensDeplacement demanderMouvement() {
	    	System.out.println("Saisissez un mouvement :");
	    	Scanner sc = new Scanner(System.in);
	    	String str = sc.nextLine();
	    	return Mouvement.mouvementEnCoordonnees(str);
	 }

    /** affiche le plateau et demande un déplacement au joueur */
    public void jouer() {
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
    	
	}
   
    /** 0
	 * 	Initialise la dimension à la valeur par défaut, soit 10
	 */
	public void initialiserDimension(){
		plateau.dimension=Application.DEFAULT_SIZE;
	}
	
	/** 3
	 * 	Incrémente la dimension du plateau d'une valeur passée en paramètre
	 */
	public void incrementerDimension(int augmentation){
		plateau.dimension=plateau.dimension+augmentation;
	}
	/** applique aux coordonnées du joueur les coordonnées du déplacements saisi
	 * 	teste la sortie de tablau et le déplacement sur case mur*/
	private void appliquerMouvement(SensDeplacement deplacement2) throws CaseNulleException {
		Coordonnees coordonneeCiblee = new Coordonnees(deplacement2.x()+this.plateau.posJoueur().i,deplacement2.y()+this.plateau.posJoueur().j);
		if(((coordonneeCiblee.i<0)||(coordonneeCiblee.j<0))||((coordonneeCiblee.i>=this.plateau.dimension)||(coordonneeCiblee.j>=this.plateau.dimension)))
			throw new CaseNulleException();
		Case caseCiblee = this.plateau.recupererCase(coordonneeCiblee);
		if(!(caseCiblee instanceof CaseMur)) 
		this.plateau.rafraichirPlateau(coordonneeCiblee);	
		else System.out.println("non");
	}	
}

