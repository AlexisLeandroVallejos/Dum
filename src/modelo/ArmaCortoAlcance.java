package modelo;

public class ArmaCortoAlcance extends Arma {
	private int danio;

	@Override
	public void recargar() {

	}

	@Override
	public void atacar(Demonio demonio, int distanciaAMi) {
		demonio.serAtacado(this,distanciaAMi);
	}
	//xds

}
