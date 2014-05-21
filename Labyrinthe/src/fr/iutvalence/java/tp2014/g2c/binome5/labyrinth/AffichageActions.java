package fr.iutvalence.java.tp2014.g2c.binome5.labyrinth;
import java.awt.*;

import javax.swing.*;


public class AffichageActions extends JSplitPane
{
	/**
	 * Méthode chargé de l'affichage des différents boutons d'actions
	 * placés sur la droite de la fenètreé
	 */
	
	private JPanel options = new JPanel();
	private JPanel deplacements = new JPanel();
	
	public AffichageActions(){
		super();
		this.setOrientation(VERTICAL_SPLIT);
		this.setLayout(new Layout());
		JPanel options = new JPanel();
		JPanel deplacements = new JPanel();

		this.add(options);
		deplacements.setLayout(new GridLayout(2,2));
		add(new JButton("up"));
		add(new JButton("down"));
		add(new JButton("left"));
		add(new JButton("right"));
		this.add(deplacements);
	}
	
}
