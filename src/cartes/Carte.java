package cartes;

public abstract class Carte {
	private int nombre;
	
	public Carte(int nombre) {
		this.nombre = nombre;
	}
	public abstract String toString();
	public int getNombre() {
		return nombre;
	}
	public boolean equals(Object obj) {
		if (obj!=null && obj.getClass()==getClass()) {
			Carte carte= (Carte) obj;
			return carte.equals(obj);
		}
		return false;
	}
	
}
