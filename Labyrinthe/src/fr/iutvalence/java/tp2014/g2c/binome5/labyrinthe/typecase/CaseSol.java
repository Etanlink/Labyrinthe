package fr.iutvalence.java.tp2014.g2c.binome5.labyrinthe.typecase;

import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
*
* OLIVIER Etienne - BERTRAND Hugo
* version 2.0
*/
public class CaseSol implements Case {
	
public JButton BoutonSol;
	
	public JButton afficherBouton(){
	    BoutonSol = new JButton(new ImageIcon("fr.iutvalence.java.tp2014.g2c.binome5.labyrinthe.images/sol.png"));
	    return BoutonSol;
	}
	
	@Override
	public String afficher() {
		return " ";
	}
	
    @Override
    public String toString() {
    	return afficher();
    }
}
