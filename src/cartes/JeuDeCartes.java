package cartes;

import java.util.ArrayList;
import java.util.List;

import cartes.Probleme.Type;
import utils.Utils;

public class JeuDeCartes {
	private Carte[] typesDeCartes = { 
			new Botte(1, Type.ACCIDENT), 
			new Botte(1, Type.CREVAISON),
			new Botte(1, Type.ESSENCE), 
			new Botte(1, Type.FEU), 
			new Parade(14, Type.FEU), 
			new Parade(6, Type.ACCIDENT),
			new Parade(6, Type.CREVAISON), 
			new Parade(6, Type.ESSENCE), 
			new Attaque(5, Type.FEU),
			new Attaque(3, Type.ACCIDENT), 
			new Attaque(3, Type.CREVAISON), 
			new Attaque(3, Type.ESSENCE),
			new DebutLimite(4), 
			new FinLimite(6), 
			new Borne(10, 25), 
			new Borne(10, 50), 
			new Borne(10, 75),
			new Borne(12, 100), 
			new Borne(4, 200), };
	private List<Carte> listeCartes;

	public JeuDeCartes() {
		this.listeCartes = new ArrayList<>();
		for (int i = 0; i < typesDeCartes.length; i++)
			for (int j=0;j<typesDeCartes[i].getNombre();j++) {
				listeCartes.add(typesDeCartes[i]);
			}
		listeCartes=Utils.melanger(listeCartes);
	}

	public List<Carte> getListeCartes() {
		return listeCartes;
	}

	public boolean checkCount() {
		int countLimite = 0;
		int countBotte = 0;
		int countAttaque = 0;
		int countParade = 0;
		int countBorne = 0;
		for (Carte carte : listeCartes) {
			if (carte instanceof Attaque) {
				countAttaque++;
			} else if (carte instanceof Parade) {
				countParade++;
			} else if (carte instanceof DebutLimite || carte instanceof FinLimite) {
				countLimite++;
			} else if (carte instanceof Botte) {
				countBotte++;
			}
			else if (carte instanceof Borne) {
				countBorne++;
			}
		}
		System.out.println("Il y a " + countBorne + " Cartes Bornes.");
		System.out.println("Il y a " + countLimite + " Cartes Limite.");
		System.out.println("Il y a " + countBotte + " Cartes Bottes.");
		System.out.println("Il y a " + countParade + " Cartes Parade.");
		System.out.println("Il y a " + countAttaque + " Cartes Attaque.");
		return countBorne==46 && countLimite == 10 && countBotte == 4 && countParade == 32 && countAttaque == 14;
	}
}
