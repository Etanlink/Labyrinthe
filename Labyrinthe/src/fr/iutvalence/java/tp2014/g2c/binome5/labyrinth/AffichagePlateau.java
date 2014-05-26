package fr.iutvalence.java.tp2014.g2c.binome5.labyrinth;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class AffichagePlateau extends JPanel
{	
/**
 * Méthode générant une grille de JButton de la dimension du plateau
 */
	public AffichagePlateau(int taille){
		super();
		Plateau grid = new Plateau(taille);
		Case[][] plt = grid.recupererPlateau();
		this.setLayout(new GridLayout(taille,taille));
		for(int x=0; x<taille ; x++)
        	for(int y=0 ; y<taille; y++) {
        		add(new JButton(plt[x][y].toString()) );
        	}
		/*
		* A voir pour améliorer:
		* - faire une première boucle d'instanciation de la grille de JButton
		* - puis une deuxième boucle où l'on place les "cases murs" 
		*   avec Mouse Listener pour interagir avec ces boutons particulièrement
		*/
	}
}
