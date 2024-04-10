package jeu;

import cartes.Attaque;
import cartes.Botte;
import cartes.Parade;
import cartes.Probleme.Type;

public interface Cartes {
    Botte PRIORITAIRE = new Botte(1, Type.FEU); // Carte Botte PRIORITAIRE
    Attaque FEU_ROUGE = new Attaque(1, Type.FEU); // Carte Attaque FEU_ROUGE
    Parade FEU_VERT = new Parade(1, Type.FEU); // Carte Parade FEU_VERT
}
