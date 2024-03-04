package cartes;

public class Parade extends Bataille {

	public Parade(int n, Type type) {
		super(n, type);
	}
	public String toString() {
		switch (getType()) {
		case FEU:
			return " une carte FEU vert";
		case ACCIDENT:
			return " une carte Reparation";
		case CREVAISON:
			return " une carte Roue de secours";
		case ESSENCE:
			return " une carte	Essence";
		default:
			return "erreur";
		}
	}
}
