package fr.iutvalence.java.tp2014.g2c.binome5.labyrinth;
//Import des classes graphiques
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

//Classe s'occupant de lancer l'affichage
public class GUI extends JFrame implements Runnable
{
	private final int taille;
	
	public GUI(int taille) {
		this.taille = taille;
	}
	
	@Override
	public void run(){
		this.setTitle("Labyrinthe");
		this.setSize(800, 540);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//On crée un split affichant plateau et actions
		JSplitPane pan1 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		pan1.setResizeWeight(0.25);
		this.getContentPane().add(pan1);
		
		pan1.add(new AffichagePlateau(this.taille));
		
		JPanel panOptions = new JPanel();
		panOptions.add(new JButton("options"));
		

		
		JSplitPane split = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		split.setDividerLocation(220);
		split.add(panOptions);
		split.add(new Deplacements());
		
		pan1.add(split);
		this.setVisible(true);
	}
	
}
