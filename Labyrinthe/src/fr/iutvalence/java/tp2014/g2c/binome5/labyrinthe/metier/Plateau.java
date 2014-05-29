package fr.iutvalence.java.tp2014.g2c.binome5.labyrinthe.metier;
import java.util.Random;

import fr.iutvalence.java.tp2014.g2c.binome5.labyrinthe.typecase.Case;
import fr.iutvalence.java.tp2014.g2c.binome5.labyrinthe.typecase.CaseJoueur;
import fr.iutvalence.java.tp2014.g2c.binome5.labyrinthe.typecase.CaseMur;
import fr.iutvalence.java.tp2014.g2c.binome5.labyrinthe.typecase.CaseSol;

/**
*
* OLIVIER Etienne - BERTRAND Hugo
* version 2.0
*/
public class Plateau {
	/** abscisse du point de d�part */
    public static final int I_DEPART = 0;
    /** coordonn�es du point de d�part */
    public static final int J_DEPART  = 0;
    /** tableau de cases */
    private final Case[][] tab;
    /** dimension de tab */
    public static int dimension;
    /** coordonn�es du point de d�part */
    private final Coordonnees depart;
    /** coordonn�esdu point d'arriv�e */
    private final Coordonnees arrivee;
    /** coordonn�es du joueur*/
    private Coordonnees joueur;

    public Coordonnees depart() {
        return this.depart;
    }
    
    public Coordonnees arrivee() {
        return this.arrivee;
    }
    /** 
     * 1.1. 
     * cr�e un plateau de dimension donn�e en param�tre*/
    public Plateau(int dimension) {
        this.dimension = dimension;
        this.tab = new Case[dimension][dimension];
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
    /** r�cup�re la case indiqu�s par les coordonn�es d'entr�e */ 
    public Case recupererCase(Coordonnees coord) {
    	return this.tab[coord.i][coord.j];
    }
    
    /** applique le mouvement du joueur sur le plateau*/
    public void rafraichirPlateau(Coordonnees nouvellesCoordonnees) {
    	this.tab[joueur.i][joueur.j]= new CaseSol();
    	this.joueur=nouvellesCoordonnees;
    	this.tab[joueur.i][joueur.j]= new CaseJoueur();
    }

    public void afficher() {
    	System.out.println(this.toString());
        
    }
    
    /** concataine l'affichage du plateau */
    public String toString() {
    	StringBuilder str = new StringBuilder(10000);
        for (int i = 0; i < this.dimension; i++) {
            for (int j = 0; j < this.dimension; j++) {
                str.append(tab[i][j].afficher());
            }
            str.append("\n");
        }
        /* TODO adapter la taille du labyrinthe. */
        return str.toString();
    }
    
    /** r�cup�re le tab dans un tableau */
    public Case[][] recupererPlateau() {
    	return this.tab;
    }
    
    /** retourne les coordonn�es actuelles du joueur */
	public Coordonnees posJoueur() {
		return this.joueur;
	}
	
}
