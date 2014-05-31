package fr.iutvalence.java.tp2014.g2c.binome5.labyrinthe.IHM;
import java.awt.*;

import javax.swing.*;

import fr.iutvalence.java.tp2014.g2c.binome5.labyrinthe.metier.Deplacements;
import fr.iutvalence.java.tp2014.g2c.binome5.labyrinthe.metier.Jeu;
import fr.iutvalence.java.tp2014.g2c.binome5.labyrinthe.metier.Mouvement;
import fr.iutvalence.java.tp2014.g2c.binome5.labyrinthe.metier.SensDeplacement;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AffichageActions extends JSplitPane implements ActionListener
{
	//Attributs déclarant les boutons d'action
	private Options options = new Options();
	private Deplacements deplacements = new Deplacements();
	/**
	 * Méthode chargé de l'affichage des différents boutons d'actions
	 * placés sur la droite de la fenètre
	 */
		public AffichageActions(){
		super();
		this.setOrientation(JSplitPane.VERTICAL_SPLIT);
		this.setLayout(new GridLayout(2,2));
		this.add(options);
		this.add(deplacements);
	}
		
		public void actionPerformed(ActionEvent event) {
			JButton selectedItem = (JButton) event.getSource();
			if(selectedItem == Deplacements.up) Jeu.appliquerMouvement(Mouvement.mouvementEnCoordonnees());
			if(selectedItem == Deplacements.left) Jeu.appliquerMouvement(SensDeplacement.GAUCHE);
			if(selectedItem == Deplacements.down) Jeu.appliquerMouvement(SensDeplacement.BAS);
			if(selectedItem == Deplacements.right) Jeu.appliquerMouvement(SensDeplacement.DROITE);
		}
}
