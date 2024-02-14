package cartes;

public class Parade extends Bataille {

	public Parade(int n, Type type) {
		super(n, type);
	}
	public String toString() {
		switch (type) {
		case FEU:
			return "C'est une carte FEU vert";
		case ACCIDENT:
			return "C'est une carte Reparation";
		case CREVAISON:
			return "C'est une carte Roue de secours";
		case ESSENCE:
			return "C'est une carte	Essence";
		default:
			return "erreur";
		}
	}
}
