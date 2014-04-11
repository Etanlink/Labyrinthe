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
    private final Case[][]    tab;
    /** TODO. */
    private final int dimension;
    /** TODO. */
    private final Coordonnees depart;
    /** TODO. */
    private final Coordonnees arrivee;

    public Coordonnees depart() {
        return depart;
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
        tab[I_DEPART][J_DEPART] = new CaseJoueur();

        depart = new Coordonnees(I_DEPART, J_DEPART);
        arrivee = new Coordonnees(I_ARRIVEE, J_ARRIVEE);
    }

    public void afficher() {
        /* TODO À adapter à la taille du labytinthe. */
        System.out.println("==============");
        for (int i = 0; i < this.dimension; i++) {
            for (int j = 0; j < this.dimension; j++) {
                System.out.print(tab[i][j].afficher());
            }
            System.out.print("\n");
        }
        /* TODO À adapter à la taille du labytinthe. */
        System.out.println("==============");
    }
}
