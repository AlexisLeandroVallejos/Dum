package modelo;

public abstract class Arma {
	private String descripcion;
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public boolean tieneIgualDescripcion(Arma arma) {
		return this.getDescripcion() == arma.getDescripcion();
	}

	public void recargar(Marine marine) {
		
	}
	
	public abstract int getDanio(int distanciaAlObjetivo);
	
	public void disparar(Demonio demonio, int distanciaAlObjetivo) {
		demonio.bajarHP(this.getDanio(distanciaAlObjetivo));
	}
	
	public boolean puedeAtacarJefe() {
		return false;
	}
	

}
