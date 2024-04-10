package jeu;

import java.util.List;

import cartes.Bataille;
import cartes.Borne;
import cartes.Botte;
import cartes.Carte;
import cartes.Limite;

public class Joueur {
	    private String nom;
	    private MainAsList main= new MainAsList();
	    private ZoneDeJeu zoneDeJeu= new ZoneDeJeu();

	    public Joueur(String nom) {
	        this.nom = nom;
	    }
	    
	    public String getNom() {
	        return nom;
	    }
	    
	    public IMain getMain() {
	    	return main;
	    }
	    
	    public void donner(Carte carte) {
	    	main.prendre(carte);
	    }
	    public boolean deposer(Borne borne) {
	    	return zoneDeJeu.deposer(borne);
	    }
	    public boolean deposer(Bataille bataille) {
	    	return zoneDeJeu.deposer(bataille);
	    }
	    public boolean deposer(Limite limite) {
	    	return zoneDeJeu.deposer(limite);
	    }
	    public boolean deposer(Botte botte) {
	    	return zoneDeJeu.deposer(botte);
	    }
	    public int donnerKmParcourus() {
	        return zoneDeJeu.donnerKmParcourus();
	    }
	    
	    public boolean possedeBottePrioritaire() {
	        return zoneDeJeu.possedeBottePrioritaire();
	    }
	    public boolean estBloque() {
	    	return zoneDeJeu.estBloque();
	    }
	    public void enleverBottes() {
	    	zoneDeJeu.retirerBotte();
	    }
	    public Carte prendreCarte(List<Carte> sabot) {
	        if (!sabot.isEmpty()) {
	            Carte carte = sabot.remove(0);
	            main.prendre(carte);
	            return carte;
	        } else {
	            return null;
	        }
	    }
	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) {
	            return true;
	        }
	        if (obj == null || getClass() != obj.getClass()) {
	            return false;
	        }
	        Joueur joueur = (Joueur) obj;
	        return nom.equals(joueur.nom);
	    }
	    @Override
	    public String toString() {
	        return nom;
	    }  
}
