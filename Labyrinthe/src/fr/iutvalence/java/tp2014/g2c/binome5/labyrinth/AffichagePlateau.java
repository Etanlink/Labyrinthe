package fr.iutvalence.java.tp2014.g2c.binome5.labyrinth;
import java.awt.GridLayout;
import java.awt.event.MouseListener;

public class AffichagePlateau extends JFrame implements MouseListener
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
		/*
		* A voir pour améliorer:
		* - faire une première boucle d'instanciation de la grille de JButton
		* - puis une deuxième boucle où l'on place les "cases murs" 
		*   avec Mouse Listener pour interagir avec ces boutons particulièrement
		*/
	}
}
