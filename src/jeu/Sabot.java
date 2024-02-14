package jeu;

import java.util.ConcurrentModificationException;

import cartes.Carte;

public class Sabot{
	private int nombreCartesMax;
	Carte[] cartes;
	private int nbCartes;
	
	public Sabot(int nombreCartesMax, int nbCartes) {
		this.nombreCartesMax=nombreCartesMax;
		Carte[] cartes= new Carte[nombreCartesMax];
		this.nbCartes=nbCartes;
	}
	public boolean estVide() {
		return (nbCartes==0);
	}
	private void ajouterCarte(Carte carte) {
		try {
			cartes[nbCartes]=carte;
			nbCartes+=1;
		}catch (NullPointerException e) {
			System.out.println("dépassement de capacité.");
		}
	}
	public void ajouterFamilleCarte(Carte[] tabcarte) {
		try {
			for (int i=0;i<tabcarte.length;i++) {
				ajouterCarte(tabcarte[i]);
			}
		}catch (IllegalStateException e) {
			
		}catch (ConcurrentModificationException j) {
			
		}
	}
	public void remove() {
		cartes[nbCartes]=null;
		nbCartes-=1;
	}
}
