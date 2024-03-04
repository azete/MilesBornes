package cartes;

public class Botte extends Probleme {

	public Botte(int n, Type type) {
		super(n , type);
	}
	public String toString() {
		switch (getType()) {
		case FEU:
			return " une carte Prioritaire";
		case ACCIDENT:
			return " une carte As du volant";
		case CREVAISON:
			return " une carte Increvable";
		case ESSENCE:
			return " une carte Citerne";
		default:
			return "erreur";
		}
	}
}
