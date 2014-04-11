import java.util.HashMap;
import java.util.Map;

public class Mouvement {
	private static Map<String,SensDeplacement> conversion; 
	
	static {
		conversion = new HashMap<String, SensDeplacement>();
		conversion.put("z", SensDeplacement.HAUT);
		conversion.put("s", SensDeplacement.BAS);
		conversion.put("q", SensDeplacement.GAUCHE);
		conversion.put("d", SensDeplacement.DROITE);
		conversion.put("", SensDeplacement.FIXE);
	}
	
	public static SensDeplacement mouvementEnCoordonnees(String touches){
		SensDeplacement sens = conversion.get(touches);
		return sens != null ? sens : SensDeplacement.FIXE;
	}
}
