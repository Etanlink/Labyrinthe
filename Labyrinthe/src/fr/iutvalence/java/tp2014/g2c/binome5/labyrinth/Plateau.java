package fr.iutvalence.java.tp2014.g2c.binome5.labyrinth;
import java.util.Random;



/* TODO Package. */

/**
 * TODO.
 *
 * @author /*BERTRAND Hugo et OLIVIER Etienne - TP2C *
 * @version TODO
 */
public class Plateau {
	/** TODO. */
    public static final int I_DEPART = 0;
    /** TODO. */
    public static final int J_DEPART  = 0;
    /** TODO. */
    public static final int I_ARRIVEE = 1;
    /** TODO. */
    public static final int J_ARRIVEE = 1;

    /** TODO. */
    private final Case[][] tab;
    /** TODO. */
    public int dimension;
    /** TODO. */
    private final Coordonnees depart;
    /** TODO. */
    private final Coordonnees arrivee;
    
    private Coordonnees joueur;

    public Coordonnees depart() {
        return this.depart;
    }
    
    public Coordonnees arrivee() {
        return this.arrivee;
    }

    public Plateau(int dimension) {
        this.dimension = dimension;
        this.tab = new Case[dimension][dimension];

        /* TODO À extraire dans une méthode interne. */
        /* Initialiser depart et arrivee */
        for(int x=0; x<dimension ; x++)
        	for(int y=0 ; y<dimension; y++) {
        		Random nombreRandom = new Random();
        		if(nombreRandom.nextBoolean())
        				this.tab[x][y] = new CaseSol();
        		else
        				this.tab[x][y] = new CaseMur();
        	}
        depart = new Coordonnees(I_DEPART, J_DEPART);
        arrivee = new Coordonnees(dimension-1, dimension-1);
        this.tab[arrivee.i][arrivee.j]=new CaseSol();
        this.joueur = depart;
        this.rafraichirPlateau(new Coordonnees(0,0));

    }
    
    public Case recupererCase(Coordonnees coord) {
    	return this.tab[coord.i][coord.j];
    }
    
    public void rafraichirPlateau(Coordonnees nouvellesCoordonnees) {
    	this.tab[joueur.i][joueur.j]= new CaseSol();
    	this.joueur=nouvellesCoordonnees;
    	this.tab[joueur.i][joueur.j]= new CaseJoueur();
    }

    public void afficher() {
    	System.out.println(this.toString());
        
    }
    
    public String toString() {
    	StringBuilder str = new StringBuilder(10000);
    	str.append("==============\n");
        for (int i = 0; i < this.dimension; i++) {
            for (int j = 0; j < this.dimension; j++) {
                str.append(tab[i][j].afficher());
            }
            str.append("\n");
        }
        /* TODO À adapter à la taille du labytinthe. */
        str.append("==============");
        return str.toString();
    }
    
    public Case[][] recupererPlateau() {
    	return this.tab;
    }

	public Coordonnees posJoueur() {
		return this.joueur;
	}
}
