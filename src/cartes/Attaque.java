package cartes;


public class Attaque extends Bataille {

	public Attaque(int n, Type type) {
		super(n, type);
	}
	public String toString() {
		switch (type) {
		case FEU:
			return "C'est une carte FEU rouge";
		case ACCIDENT:
			return "C'est une carte Accident";
		case CREVAISON:
			return "C'est une carte Crevaison";
		case ESSENCE:
			return "C'est une carte Panne d'essence";
		default:
			return "erreur";
		}
	}
}
