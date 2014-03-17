
public class Plateau {
	public static final int I_DEPART = 0;
	public static final int J_DEPART = 0;
	public static final int I_ARRIVEE = 1;
	public static final int J_ARRIVEE = 1;	
	
	private final Case tab[][];
	private final int dimension;
	private final Coordonnees depart;
	private final Coordonnees arrivee;
	
	public Coordonnees depart() {
		return depart;
	}
	public Plateau(int dimension)
	{
		this.dimension=dimension;
		this.tab = new Case[dimension][dimension];
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
	
			System.out.println("==============");
			for(int i = 0; i < this.dimension; i++){
				for(int j = 0; j < this.dimension; j++){
					System.out.print(tab[i][j].afficher());
				}
				System.out.print("\n");
			}
			System.out.println("==============");

		}
		
		
}
