package fr.iutvalence.java.tp2014.g2c.binome5.labyrinth;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Deplacements extends JPanel {
	
	public Deplacements() {
		this.add(new JButton("up"));
		this.add(new JButton("left"));
		this.add(new JButton("down"));
		this.add(new JButton("right"));
		
	}

}
