package fr.iutvalence.java.tp2014.g2c.binome5.labyrinth;

import javax.swing.SwingUtilities;

/**
 * 
 * OLIVIER Etienne - BERTRAND Hugo version 2.0
 */

public class Application {

	/** dimension du plateau par défaut */
	public static final int DEFAULT_SIZE = 10;

	public static void main(String[] args) {
		if ((args.length == 1) && "--gui".equals(args[0])) {
			SwingUtilities.invokeLater(new GUI(DEFAULT_SIZE));
		} else {
			Jeu j = new Jeu(DEFAULT_SIZE);
			while (true) {
				Jeu k = new Jeu(Plateau.dimension); // Initialisation de la
													// partie
				k.jouer(); // Premier tour de jeu
				k.incrementerDimension(5);
			}
		}
	}
}
