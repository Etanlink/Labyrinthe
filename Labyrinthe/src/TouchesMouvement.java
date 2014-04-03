
public enum TouchesMouvement {
	
	DEPLACER_HAUT ("z"),
	DEPLACER_BAS ("s"),
	DEPLACER_GAUCHE ("q"),
	DEPLACER_DROITE("d");
	
	public final String touches;
	
	TouchesMouvement(String touches){
	this.touches = touches;
	}	
}
