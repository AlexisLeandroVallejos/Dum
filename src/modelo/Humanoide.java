package modelo;

public class Humanoide extends Demonio {
	private ArmaLargoAlcance armaActiva;

	@Override
	public void serAtacadoPor(Marine marine, int distanciaAMi) {
		super.serAtacadoPor(marine, distanciaAMi);
		if(estoyMuerto()) {
			marine.recompensa(armaActiva);
		}
	}

}
