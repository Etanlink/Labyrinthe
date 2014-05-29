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
	//Attributs déclarant les boutons d'action
	public JButton BoutonHaut = new JButton("HAUT");
	public JButton BoutonGauche = new JButton("GAUCHE");
	public JButton BoutonBas = new JButton("BAS");
	public JButton BoutonDroite = new JButton("DROITE");
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
		
		public void actionPerformed(ActionEvent arg){
			 if(arg.getSource() == BoutonHaut)
				 Jeu.appliquerMouvement(SensDeplacement.HAUT);
			 if(arg.getSource() == BoutonHaut)
				 Jeu.appliquerMouvement(SensDeplacement.GAUCHE, deplacement2);
			 if(arg.getSource() == BoutonBas)
				 Jeu.appliquerMouvement(SensDeplacement.BAS, deplacement2);
			 if(arg.getSource() == BoutonDroite)
				 Jeu.appliquerMouvement(SensDeplacement.DROITE, deplacmeent2);		 
		}
}
