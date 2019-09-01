package modelo;

public class ArmaPlasma extends Arma {

	@Override
	public void disparar(Demonio demonio, int distanciaAlObjetivo) {
		demonio.bajarHP(demonio.getHp());
	}

	@Override
	public int getDanio(int distanciaAlObjetivo) {
		return 0;
	}
	
	@Override
	public boolean puedeAtacarJefe() {
		return true;
	}

}
