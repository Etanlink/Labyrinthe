package fr.iutvalence.java.tp2014.g2c.binome5.labyrinth;
import java.util.HashMap;
import java.util.Map;

public class Mouvement {
	private static Map<String,SensDeplacement> conversion; 
	
	static {
		conversion = new HashMap<String, SensDeplacement>();
		conversion.put("d", SensDeplacement.HAUT);
		conversion.put("q", SensDeplacement.BAS);
		conversion.put("z", SensDeplacement.GAUCHE);
		conversion.put("s", SensDeplacement.DROITE);
		conversion.put("", SensDeplacement.FIXE);
	}
	
	public static SensDeplacement mouvementEnCoordonnees(String touches){
		SensDeplacement sens = conversion.get(touches);
		return sens != null ? sens : SensDeplacement.FIXE;
	}
}
