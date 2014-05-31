package fr.iutvalence.java.tp2014.g2c.binome5.labyrinthe.IHM;
import java.awt.*;

import javax.swing.*;

import fr.iutvalence.java.tp2014.g2c.binome5.labyrinthe.metier.Deplacements;
import fr.iutvalence.java.tp2014.g2c.binome5.labyrinthe.metier.Jeu;
import fr.iutvalence.java.tp2014.g2c.binome5.labyrinthe.metier.SensDeplacement;


public class AffichageActions extends JSplitPane
{
	//Attributs d�clarant les boutons d'action
	public static JButton BoutonHaut = new JButton("HAUT");
	public static JButton BoutonGauche = new JButton("GAUCHE");
	public static JButton BoutonBas = new JButton("BAS");
	public static JButton BoutonDroite = new JButton("DROITE");
	private Options options = new Options();
	private Deplacements deplacements = new Deplacements();
	/**
	 * M�thode charg� de l'affichage des diff�rents boutons d'actions
	 * plac�s sur la droite de la fen�tre
	 */
		public AffichageActions(){
		super();
		this.setOrientation(JSplitPane.VERTICAL_SPLIT);
		this.setLayout(new GridLayout(2,2));
		this.add(options);
		this.add(deplacements);
	}
}
