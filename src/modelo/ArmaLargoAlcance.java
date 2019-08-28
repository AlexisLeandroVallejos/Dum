package modelo;

public class ArmaLargoAlcance extends Arma{
	
	private final int MUNICIONES_INICIALES = 100;
	private int municiones;
	
	public void recargar() {
		this.municiones = MUNICIONES_INICIALES;
	}

	@Override
	public void atacar(Demonio demonio, int distanciaAMi) {
		
	}
}
