package modelo;

public class Humanoide extends Demonio {
	
	private final int DISTANCIA_MAXIMA = 1000;
	private ArmaLargoAlcance armaActiva;

	@Override
	public void serAtacadoPor(Marine marine, int distanciaAMi) {
		super.serAtacadoPor(marine, distanciaAMi);
		if(estoyMuerto()) {
			marine.recompensa(armaActiva);
		}
	}
	
	public int getDanio() {
		return armaActiva.getDanio(DISTANCIA_MAXIMA);
	}

}
