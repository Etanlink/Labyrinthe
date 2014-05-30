package fr.iutvalence.java.tp2014.g2c.binome5.labyrinthe.typecase;

import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
*
* OLIVIER Etienne - BERTRAND Hugo
* version 2.0
*/
public class CaseJoueur implements Case {
    
	public JButton BoutonJoueur;
	
	public JButton afficherBouton(){
    BoutonJoueur = new JButton(new ImageIcon("fr.iutvalence.java.tp2014.g2c.binome5.labyrinthe.images/joueur.png"));
    return BoutonJoueur;
	}
    
    @Override
    public String afficher() {
        return ".";
    }
    
    @Override
    public String toString() {
    	return afficher();
	}  
}
