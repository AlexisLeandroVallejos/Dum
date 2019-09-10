package modelo;

import java.util.List;

public class Marine {
	private List<Arma> inventario;
	private Arma armaActiva;
	private int cantidadDeCartuchos;
	private int puntos = 0 ;
	
	public void equipaArma(int atajo) {
		armaActiva = obtenerArma(atajo);
	}

	public Arma obtenerArma(int atajo) {
		return inventario.get(atajo);
	}
	
	public void recargarArma(int atajo) {
		obtenerArma(atajo).recargar(this);
	}
	
	public boolean tieneCartuchos() {
		return cantidadDeCartuchos > 0;
	}

	public void usarCartucho() {
		cantidadDeCartuchos--;
	}
	
	public void atacarA(Demonio demonio, int distanciaAlDemonio) {
		demonio.serAtacadoPor(this, distanciaAlDemonio);
	}

	public Arma getArmaActiva() {
		return armaActiva;
	}
	
	public void recompensa(ArmaLargoAlcance arma) {
		cantidadDeCartuchos++;
		if(!algunaArmaConLaMismaDescripcion(arma)) {
			inventario.add(arma);
		}
	}

	public boolean algunaArmaConLaMismaDescripcion(Arma otraArma) {
		return inventario.stream()
				.anyMatch(arma -> arma.tieneIgualDescripcion(otraArma));
	}
	
	public int getPuntos() {
		return puntos;
	}
	
	public void recibirPuntos(int puntosARecibir) {
		puntos += puntosARecibir;
	}
	
	public void setArmaSeleccionada(Arma armaSeleccionada) {
		this.armaActiva = armaSeleccionada;
	}

	
	
}
