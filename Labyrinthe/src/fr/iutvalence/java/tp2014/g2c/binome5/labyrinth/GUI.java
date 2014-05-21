package fr.iutvalence.java.tp2014.g2c.binome5.labyrinth;
//Import des classes graphiques
import java.awt.BorderLayout; 
import javax.swing.JButton;
import javax.swing.JFrame;

//Classe s'occupant de lancer l'affichage
public class GUI extends JFrame implements Runnable
{
	public void run(){
		this.setTitle("Labyrinthe");
		this.setSize(640, 480);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//On crée le gridLayout
		this.setLayout(new BorderLayout());
		this.getContentPane().add(BorderLayout.WEST, new(AffichagePlateau));
		this.getContentPane().add(BorderLayout.EAST, new(AffichagePlateau));
		this.setVisible(true);
	}
}
