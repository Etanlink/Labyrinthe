package fr.iutvalence.java.tp2014.g2c.binome5.labyrinth;
import java.awt.GridLayout;
import javax.swing.*;

public class AffichagePlateau extends JFrame
{	
/**
 * Méthode générant une grille de JButton de la dimension du plateau
 */
	public void Grille(){
		this.setLayout(new GridLayout(Plateau.dimension,Plateau.dimension));
		for(int x=0; x<Plateau.dimension ; x++)
        	for(int y=0 ; y<Plateau.dimension; y++) {
        		add(new JButton(""));
        	}
	}
}
