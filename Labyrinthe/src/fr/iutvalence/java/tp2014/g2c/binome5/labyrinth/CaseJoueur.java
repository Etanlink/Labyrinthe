package fr.iutvalence.java.tp2014.g2c.binome5.labyrinth;
/**
*
* OLIVIER Etienne - BERTRAND Hugo
* version 2.0
*/
public class CaseJoueur implements Case {
    @Override
    public String afficher() {
        return ".";
    }
    
    @Override
    public String toString() {
    	return afficher();
    }
}
