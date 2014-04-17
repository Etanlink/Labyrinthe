

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
    public final int dimension;
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
        tab[0][0] = new CaseSol();
        tab[0][1] = new CaseMur();
        tab[1][0] = new CaseSol();
        tab[1][1] = new CaseSol();
        depart = new Coordonnees(I_DEPART, J_DEPART);
        arrivee = new Coordonnees(I_ARRIVEE, J_ARRIVEE);
        this.joueur = depart;
        this.rafraichirPlateau(new Coordonnees(0,0));

    }
    
    public void rafraichirPlateau(Coordonnees nouvellesCoordonnees) {
    	this.tab[joueur.i][joueur.j]= new CaseSol();
    	this.joueur=new Coordonnees(nouvellesCoordonnees.i+this.joueur.i,nouvellesCoordonnees.j+this.joueur.j);
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
