package cartes;

public class Botte extends Probleme {

	public Botte(int n, Type type) {
		super(n , type);
	}
	public String toString() {
		switch (type) {
		case FEU:
			return "C'est une carte Prioritaire";
		case ACCIDENT:
			return "C'est une carte As du volant";
		case CREVAISON:
			return "C'est une carte Increvable";
		case ESSENCE:
			return "C'est une carte Citerne";
		default:
			return "erreur";
		}
	}
}
