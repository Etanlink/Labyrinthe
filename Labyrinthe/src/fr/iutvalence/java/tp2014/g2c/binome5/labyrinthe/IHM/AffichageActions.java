package fr.iutvalence.java.tp2014.g2c.binome5.labyrinthe.IHM;
import java.awt.*;

import javax.swing.*;

import fr.iutvalence.java.tp2014.g2c.binome5.labyrinthe.metier.Deplacements;
import fr.iutvalence.java.tp2014.g2c.binome5.labyrinthe.metier.Jeu;
import fr.iutvalence.java.tp2014.g2c.binome5.labyrinthe.metier.SensDeplacement;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AffichageActions extends JSplitPane implements ActionListener
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
		BoutonHaut = new JButton("up");
		BoutonGauche = new JButton("left");
		BoutonBas = new JButton("down");
		BoutonDroite = new JButton("right");
		//Ajout des listeners aux boutons correspondants
		BoutonHaut.addActionListener(this);
		BoutonGauche.addActionListener(this);
		BoutonBas.addActionListener(this);
		BoutonDroite.addActionListener(this);
		add(BoutonHaut);
		add(BoutonGauche);
		add(BoutonBas);
		add(BoutonDroite);
		this.add(options);
		this.add(deplacements);
	}
		
		public void actionPerformed(ActionEvent event) {
			JButton selectedItem = (JButton) event.getSource();
			if(selectedItem == AffichageActions.BoutonHaut) Jeu.appliquerMouvement(SensDeplacement.HAUT);
			if(selectedItem == AffichageActions.BoutonGauche) Jeu.appliquerMouvement(SensDeplacement.GAUCHE);
			if(selectedItem == AffichageActions.BoutonBas) Jeu.appliquerMouvement(SensDeplacement.BAS);
			if(selectedItem == AffichageActions.BoutonDroite) Jeu.appliquerMouvement(SensDeplacement.DROITE);
		}
}
