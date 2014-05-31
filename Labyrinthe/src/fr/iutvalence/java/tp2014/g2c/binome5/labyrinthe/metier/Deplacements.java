package fr.iutvalence.java.tp2014.g2c.binome5.labyrinthe.metier;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Deplacements extends JPanel {
	public static JButton up = new JButton("up");
	public static JButton left = new JButton("left");
	public static JButton down = new JButton("down");
	public static JButton right = new JButton("right");
	
	public Deplacements() {
		this.add(up);
		this.add(left);
		this.add(down);
		this.add(right);	
	}

}
