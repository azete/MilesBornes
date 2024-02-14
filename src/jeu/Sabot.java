package jeu;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

import cartes.Carte;

public class Sabot  implements Iterable<Carte>{
	private int nombreCartesMax;
	Carte[] cartes;
	private int nbCartes;
	private int indiceIterateur=0;
	
	public Sabot(int nombreCartesMax, int nbCartes) {
		this.nombreCartesMax=nombreCartesMax;
		cartes= new Carte[nombreCartesMax];
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
		for (int i=0;i<tabcarte.length;i++) {
			ajouterCarte(tabcarte[i]);
		}
	}
	public Carte piocher() {
		Carte c=cartes[indiceIterateur];
		Iterateur it=new Iterateur();
		it.remove();
		return c;
	}
	
	public Iterator<Carte> iterator() {
		return new Iterateur();
	}
	
	
	private class Iterateur implements Iterator<Carte>{
		private int indiceIterateur=0;
		private boolean nextEffectue=false;
		public boolean hasNext() {
			return indiceIterateur<nbCartes;
		}
		public Carte next() {
			if (hasNext()) {
				Carte carte=cartes[indiceIterateur];
				indiceIterateur++;
				nextEffectue=true;
				return carte;
			}else {
				throw new NoSuchElementException();
			}
		}
		public void remove() {
			cartes[nbCartes]=null;
			nbCartes-=1;
		}
	}
}
