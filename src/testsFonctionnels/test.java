package testsFonctionnels;

import cartes.Carte;

import java.util.Iterator;
import java.util.NoSuchElementException;

import cartes.Attaque;
import cartes.Probleme;
import cartes.Probleme.Type;
import jeu.Sabot;
import cartes.Bataille;
import cartes.Borne;
import cartes.DebutLimite;
import cartes.FinLimite;
import cartes.Parade;
import cartes.Limite;
import cartes.Botte;

public class test {
	public static void main(String[] args) {
		Borne borne= new Borne(3,50);
		Sabot sabot=new Sabot(150,0);
		Attaque accident= new Attaque(1,Type.ACCIDENT);
		Parade reparation = new Parade(1,Type.ACCIDENT);
		Botte as_du_volant= new Botte(1,Type.ACCIDENT);
		Carte[] tab_cartes= new Carte[20];
		for (int i=0;i<3;i++)
			tab_cartes[i]=accident;
		for (int i=3;i<6;i++)
			tab_cartes[i]=reparation;
		tab_cartes[6]=as_du_volant;
		sabot.ajouterFamilleCarte(tab_cartes);
		// exo 2 a)
//		for (int i=0;i<7;i++) {
//			sabot.piocher();
//		}
		
		//exo 2 b)
//		Iterator<Carte> oui=sabot.iterator();
//		for (int i=0;i<7;i++) {
//			oui.next();
//			oui.remove();
//		}
		// exo 2 c)
		Iterator<Carte> oui=sabot.iterator();
		for (int i=0;i<7;i++) {
			try {
				oui.next();
				oui.remove();
				sabot.piocher();
			}catch (NoSuchElementException e) {
				throw new NoSuchElementException();
			}
		}
	}
}
