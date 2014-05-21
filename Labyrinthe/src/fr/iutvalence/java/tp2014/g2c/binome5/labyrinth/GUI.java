package fr.iutvalence.java.tp2014.g2c.binome5.labyrinth;
//Import des classes graphiques
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
		this.setSize(640, 480);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//On crée le gridLayout
		JSplitPane pan1 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		pan1.setResizeWeight(0.25);
		this.getContentPane().add(pan1);
		pan1.add(new AffichagePlateau(10));
		pan1.add(new AffichageActions());
		this.setVisible(true);
	}
	
}
