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
	 @Override
	    public boolean equals(Object obj) {
	        if (this == obj) {
	            return true;
	        }
	        if (obj == null || getClass() != obj.getClass()) {
	            return false;
	        }
	        Carte carte = (Carte) obj;
	        return this.getClass() == carte.getClass();
	    }
	
}
