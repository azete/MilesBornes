package cartes;

public abstract class Probleme extends Carte {
	
	enum Type{FEU, ESSENCE, CREVAISON, ACCIDENT}
	Type type;
	
	public Probleme(int n, Type type) {
		super(n);
		this.type=type;
	}

}
