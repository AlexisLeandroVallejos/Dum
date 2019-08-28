package modelo;

import java.util.List;

public class Marine {
	private List<Arma> inventario;
	private Arma armaActiva;
	private int cantidadDeCartuchos;
	
	public void equipaArma(int atajo) {
		armaActiva = inventario.get(atajo);
	}
	
	public void recargarArma(int atajo) {
		if(cantidadDeCartuchos >= 1) {
			inventario.get(atajo).recargar();
			cantidadDeCartuchos--;
		}
	}
	
	public void atacarDemonio(Demonio demonio, int distanciaAMi) {
		armaActiva.atacar(demonio,distanciaAMi);
	}
}
