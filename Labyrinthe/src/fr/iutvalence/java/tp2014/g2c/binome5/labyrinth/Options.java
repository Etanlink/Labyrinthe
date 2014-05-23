package fr.iutvalence.java.tp2014.g2c.binome5.labyrinth;

import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Options extends JPanel {
	
	public Options() {
		this.setLayout(new GridLayout(1,3));
		this.add(new JButton("Options"));
	}

}
