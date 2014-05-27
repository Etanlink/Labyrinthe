package fr.iutvalence.java.tp2014.g2c.binome5.labyrinth;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainMenu extends JFrame {
	
	public MainMenu() {
		this.setSize(68,95);
		JPanel main = new JPanel();
		main.add(new JButton("Nouvelle partie"));
		main.add(new JButton("Options"));
		main.add(new JButton("Crédits"));
		main.add(new JButton("Quitter"));
		this.getContentPane().add(main);
		this.setVisible(true);
	}

}
