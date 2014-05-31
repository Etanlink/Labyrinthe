package fr.iutvalence.java.tp2014.g2c.binome5.labyrinthe.metier;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import fr.iutvalence.java.tp2014.g2c.binome5.labyrinthe.IHM.AffichageActions;

public class Deplacements extends JPanel {
	
	public JButton HAUT = new JButton("up");
	public JButton GAUCHE = new JButton("left");
	public JButton BAS = new JButton("down");
	public JButton DROITE = new JButton("right");
	
	public Deplacements() {
		this.add(HAUT);
		this.add(GAUCHE);
		this.add(BAS);
		this.add(DROITE);
		this.HAUT.addActionListener((ActionListener) this);
		this.DROITE.addActionListener((ActionListener) this);
		this.GAUCHE.addActionListener((ActionListener) this);
		this.DROITE.addActionListener((ActionListener) this);
	}
	
	public void actionPerformed(ActionEvent event) {
		JButton selectedItem = (JButton) event.getSource();
		if(selectedItem == HAUT) Jeu.appliquerMouvement(SensDeplacement.HAUT);
		if(selectedItem == GAUCHE) Jeu.appliquerMouvement(SensDeplacement.GAUCHE);
		if(selectedItem == BAS) Jeu.appliquerMouvement(SensDeplacement.BAS);
		if(selectedItem == DROITE) Jeu.appliquerMouvement(SensDeplacement.DROITE);
	}

}
