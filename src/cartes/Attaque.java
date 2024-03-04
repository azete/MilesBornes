package cartes;


public class Attaque extends Bataille {

	public Attaque(int n, Type type) {
		super(n, type);
	}
	public String toString() {
		switch (getType()) {
		case FEU:
			return " une carte FEU rouge";
		case ACCIDENT:
			return " une carte Accident";
		case CREVAISON:
			return " une carte Crevaison";
		case ESSENCE:
			return " une carte Panne d'essence";
		default:
			return "erreur";
		}
	}
}
