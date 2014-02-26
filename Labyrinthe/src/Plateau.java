
public class Plateau {
	public static final int I_DEPART = 1;
	public static final int J_DEPART = 0;
	public static final int I_ARRIVEE = 3;
	public static final int J_ARRIVEE = 4;	
	
	private final Case tab[][];
	private final int dimension;
	private final Coordonnees depart;
	private final Coordonnees arrivee;
	
	public Plateau(int dimension)
	{
		int k = 0;
		this.dimension=dimension;
		this.tab = new Case[dimension][dimension];
		/* Initialiser départ et arrivée */
        // XXX Faites des méthodes !
		tab[I_DEPART][J_DEPART] = new CaseJoueur();
		// XXX Deux déclarations de k.
        for(int k = 0, k < 5, k++){
				tab[0][k] = new CaseMur();
				tab[4][k] = new CaseMur();
				
				tab[1][1] = new CaseSol();
				tab[][]
				tab[][]
				tab[][]
				tab[][]
				tab[][]
				tab[][]
				tab[][]
				tab[][]
				tab[][]
				tab[][]
				tab[][]
				tab[][]
				tab[0][2] = new CaseMur();
				tab[1][2] = new CaseSol(); 
				tab[2][4] = new CaseMur();
				tab[0][3] = new Case Sol
				}
		/****/
		depart = new Coordonnees(I_DEPART, J_DEPART);
		arrivee = new Coordonnees(I_ARRIVEE, J_ARRIVEE);
	}
	
	
	
}
