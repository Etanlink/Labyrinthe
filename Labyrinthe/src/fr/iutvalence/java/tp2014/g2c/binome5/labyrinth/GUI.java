package fr.iutvalence.java.tp2014.g2c.binome5.labyrinth;
//Import des classes graphiques
import java.awt.GridLayout; 
import javax.swing.JButton;
import javax.swing.JFrame;

//Classe s'occupant de l'affichage
public class GUI extends JFrame
{
	public void Fenetre(){
		this.setTitle("Labyrinthe");
		this.setSize(640, 480);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//On crée le gridLayout
		this.setLayout(new BorderLayout());
		this.getContentPane().add(new AffichagePlateau("WEST"), BorderLayout.WEST);
		this.getContentPAne().add(new AffichageActions("EAST"), BorderLayout.EAST);
		this.setVisible(true);
	}


}
