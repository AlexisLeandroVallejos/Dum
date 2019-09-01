package modelo;

import java.util.Comparator;
import java.util.List;

public class Nivel {
	private List<Demonio> demonios;

	public Demonio demonioMasDuro() {
		return demonios.stream()
				.sorted(Comparator.comparing(Demonio::getHp)) //usar reversed() si es al reves mayor/menor
				.findFirst()
				.get();
	}
	
	public void limpiar() {
		demonios.removeIf(demonio -> demonio.estoyMuerto());
	}
	
	public boolean estaCompletado() {
		return demonios.stream().allMatch(demonio -> demonio.estoyMuerto());
	}
	
	public Demonio demonioMasPeligroso() {
		return demonios.stream()
				.sorted(Comparator.comparing(Demonio::getDanio))
				.findFirst()
				.get();
	}
}
