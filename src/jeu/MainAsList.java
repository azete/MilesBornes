package jeu;

import java.util.ArrayList;

import java.util.Iterator;

import java.util.LinkedList;

import java.util.List;

import cartes.Carte;

public class MainAsList implements IMain {

	private List<Carte> cartes;

	public MainAsList() {
		this.cartes = new LinkedList();
	}

	@Override
	public void prendre(Carte carte) {
		cartes.add(carte);

	}
	@Override
	public void jouer(Carte carte) {
		assert cartes.contains(carte) : "La carte à jouer n'est pas présente dans la main.";
		cartes.remove(carte);

	}
	public Iterator<Carte> iter() {
		return cartes.iterator();

	}
	@Override
	public String toString() {
		return cartes.toString();

	}

	@Override
	public Iterator<Carte> iterator() {
		return null;
	}

}