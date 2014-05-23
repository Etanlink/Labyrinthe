package fr.iutvalence.java.tp2014.g2c.binome5.labyrinth;
import java.awt.*;

import javax.swing.*;


public class AffichageActions extends JSplitPane
{
	/**
	 * M�thode charg� de l'affichage des diff�rents boutons d'actions
	 * plac�s sur la droite de la fen�tre�
	 */
	
	private Options options = new Options();
	private Deplacements deplacements = new Deplacements();
	
	public AffichageActions(){
		super();
		this.setOrientation(JSplitPane.VERTICAL_SPLIT);
		this.setLayout(new GridLayout(2,2));
		add(new JButton("up"));
		add(new JButton("down"));
		add(new JButton("left"));
		add(new JButton("right"));
		this.add(options);
		this.add(deplacements);
	}
	
}
