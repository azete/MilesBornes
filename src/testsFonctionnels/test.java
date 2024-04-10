package testsFonctionnels;

import cartes.Carte;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import cartes.Attaque;
import cartes.Probleme;
import cartes.Probleme.Type;
import jeu.Joueur;
import jeu.MainAsList;
import jeu.Sabot;
import jeu.ZoneDeJeu;
import utils.Utils;
import cartes.Bataille;
import cartes.Borne;
import cartes.DebutLimite;
import cartes.FinLimite;
import cartes.JeuDeCartes;
import cartes.Parade;
import cartes.Limite;
import cartes.Botte;

public class test {
	public static void main(String[] args) {
//		Borne borne= new Borne(3,50);
//		Sabot sabot=new Sabot(150,0);
//		Attaque accident= new Attaque(1,Type.ACCIDENT);
//		Parade reparation = new Parade(1,Type.ACCIDENT);
//		Botte as_du_volant= new Botte(1,Type.ACCIDENT);
//		Carte[] tab_cartes= new Carte[20];
//		for (int i=0;i<3;i++)
//			tab_cartes[i]=accident;
//		for (int i=3;i<6;i++)
//			tab_cartes[i]=reparation;
//		tab_cartes[6]=as_du_volant;
//		sabot.ajouterFamilleCarte(tab_cartes);
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
//		Iterator<Carte> oui=sabot.iterator();
//		for (int i=0;i<7;i++) {
//			try {
//				oui.next();
//				oui.remove();
//				sabot.piocher();
//			}catch(ConcurrentModificationException e) {
//				throw new ConcurrentModificationException();
//			}
//		}
//		JeuDeCartes oui = new JeuDeCartes();
//		System.out.println(oui.getListeCartes());
//		oui.checkCount();
//		JeuDeCartes jeu = new JeuDeCartes();
//		List<Carte> listeCarteNonMelangee = jeu.getListeCartes();
//		List<Carte> listeCartes = new ArrayList<>(listeCarteNonMelangee);
//		System.out.println(listeCartes);
//		listeCartes = Utils.melanger(listeCartes);
//		System.out.println(listeCartes);
//		System.out.println("liste mélangée sans erreur ? "
//		+ Utils.verifierMelange(listeCarteNonMelangee, listeCartes));
//		jeu.checkCount();
//		listeCartes = Utils.rassembler(listeCartes);
//		System.out.println(listeCartes);
//		System.out.println("liste rassemblée sans erreur ? " + Utils.verifierRassemblement(listeCartes));
//		jeu.checkCount();
		
//        Joueur joueur = new Joueur("Alice");
//        joueur.deposer(new Borne(1,50));
//        joueur.deposer(new Borne(1,100));
//        joueur.deposer(new Borne(1,200));
//        int totalKm = joueur.donnerKmParcourus();
//        System.out.println("Kilométrage atteint par le joueur : " + totalKm + " km");
		Joueur joueur= new Joueur ("Alice");
		joueur.deposer(new Attaque(1,Type.FEU));
		System.out.println(joueur.estBloque());
		
		joueur.deposer(new Botte(1,Type.FEU));
		System.out.println(joueur.estBloque());
		
		joueur.deposer(new Attaque(1,Type.ACCIDENT));
		System.out.println(joueur.estBloque());
		
		joueur.deposer(new Botte(1,Type.ACCIDENT));
		System.out.println(joueur.estBloque());
		
		joueur.deposer(new Attaque(1,Type.ESSENCE));
		System.out.println(joueur.estBloque());
		
		joueur.deposer(new Parade(1,Type.ESSENCE));
		System.out.println(joueur.estBloque());
		
//		joueur.enleverBottes();
//		System.out.println(joueur.estBloque());
		
		joueur.deposer(new Parade(1,Type.FEU));
		System.out.println(joueur.estBloque());
	}
}
