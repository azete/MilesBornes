package jeu;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import cartes.Attaque;
import cartes.Bataille;
import cartes.Borne;
import cartes.Botte;
import cartes.Carte;
import cartes.FinLimite;
import cartes.Limite;
import cartes.Parade;
import cartes.Probleme.Type;


public class ZoneDeJeu {
	private List<Limite> pileLimites = new LinkedList() ;
    private List<Bataille> pileBataille = new LinkedList();
    private Collection<Borne> bornes = new LinkedList();
    private Set<Botte> bottes = new HashSet();
	
    public List<Limite> getPileLimites() {
        return pileLimites;
    }

    public List<Bataille> getPileBataille() {
        return pileBataille;
    }

    public Collection<Borne> getBornes() {
        return (Collection<Borne>) bornes;
    }

    public Set<Botte> getBottes() {
        return bottes;
    }
    public boolean deposer(Borne borne) {
    	bornes.add(borne);
        return true;
    }
    public boolean deposer(Limite limite) {
    	pileLimites.add(limite);
        return true;
    }
    public boolean deposer(Botte botte) {
    	bottes.add(botte);
        return true;
    }
    public boolean deposer(Bataille bataille) {
    	pileBataille.add(bataille);
        return true;
    }
    public int donnerKmParcourus() {
        int totalKm = 0;
        for (Borne borne : bornes) {
            totalKm += borne.getKm();
        }
        return totalKm;
    }
    
    public boolean possedeBottePrioritaire() {
        for (Botte botte : bottes) {
            if (botte.getType() == Type.FEU) {
                return true;
            }
        }
        return false;
    }
    public boolean estBloque() {
        if (pileBataille.isEmpty() && possedeBottePrioritaire()) {
            return false; 
        }
        if (!pileBataille.isEmpty()) {
            Bataille sommetBataille = pileBataille.get(pileBataille.size() - 1);
            if (sommetBataille instanceof Parade) {
                Parade parade = (Parade) sommetBataille;
                if (parade.getType() == Type.FEU || possedeBottePrioritaire()) {
                    return false; 
                }
            }
            if (sommetBataille instanceof Attaque) {
                Attaque attaque = (Attaque) sommetBataille;
                if (attaque.getType() == Type.FEU && possedeBottePrioritaire()) {
                    return false; 
                }
                for (Botte botte : bottes) {
                    if (botte.getType() == attaque.getType() && possedeBottePrioritaire()) {
                        return false; 
                    }
                }
            }
        }
        return true; 
    }
    public void retirerBotte() {
    	for (Botte botte: bottes) {
    		bottes.remove(bottes);
    	}
    }
    public int donnerLimitationVitesse() {
        
        if (pileLimites.isEmpty() || pileLimites.get(pileLimites.size() - 1) instanceof FinLimite) {
            return 200; 
        }
        for (Botte botte : bottes) {
            if (botte.getType() == Type.FEU) {
                return 200; 
            }
        }
        return 50; 
    }
}
