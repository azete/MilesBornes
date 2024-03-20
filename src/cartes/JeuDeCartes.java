package cartes;

import java.util.ArrayList;

import cartes.Probleme.Type;

public class JeuDeCartes {
	private Carte[] typesDeCartes= {
			new Botte(1,Type.ACCIDENT),
			new Botte(1,Type.CREVAISON),
			new Botte(1,Type.ESSENCE),
			new Botte(1,Type.FEU),
			new Parade(14,Type.FEU),
			new Parade(6,Type.ACCIDENT),
			new Parade(6,Type.CREVAISON),
			new Parade(6,Type.ESSENCE),
			new Attaque(5,Type.FEU),
			new Attaque(3,Type.ACCIDENT),
			new Attaque(3,Type.CREVAISON),
			new Attaque(3,Type.ESSENCE),
			new DebutLimite(4),
			new FinLimite(6),
			new Borne(10,25),
			new Borne(10,50),
			new Borne(10,75),
			new Borne(12,100),
			new Borne(4,200),	
	};
	private ArrayList<Carte> listeCartes;
	
	public JeuDeCartes() {
		
	}

}
