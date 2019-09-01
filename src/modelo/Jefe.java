package modelo;

import java.util.Comparator;
import java.util.List;

public class Jefe extends Demonio {
	
	private int cantidadDeAtaquesParaEliminarme;
	private List<Ataque> ataques; 
	
	@Override
	public void serAtacadoPor(Marine marine, int distanciaAMi) {
		if(marine.getArmaActiva().puedeAtacarJefe()) {
			cantidadDeAtaquesParaEliminarme--;
		}	
	}
	
	@Override
	public boolean estoyMuerto() {
		return cantidadDeAtaquesParaEliminarme <= 0;
	}
	
	public int getDanio() {
		return ataques.stream()
				.sorted(Comparator.comparing(Ataque::getDanio)) //ordenar con reversed() si es mayor/menor
				.findFirst()
				.get()
				.getDanio();
	}

}
