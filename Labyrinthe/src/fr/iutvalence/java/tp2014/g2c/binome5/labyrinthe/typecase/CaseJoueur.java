package fr.iutvalence.java.tp2014.g2c.binome5.labyrinthe.typecase;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import fr.iutvalence.java.tp2014.g2c.binome5.labyrinthe.images.*;
/**
*
* OLIVIER Etienne - BERTRAND Hugo
* version 2.0
*/
public class CaseJoueur implements Case {
    
	public JButton BoutonJoueur;
	
	public JButton afficherBoutton(){
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
