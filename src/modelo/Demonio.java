package modelo;

public abstract class Demonio {
	protected int hp;
	
	private int danio;

	public int getHp() {
		return hp;
	}

	public void serAtacadoPor(Marine marine, int distanciaAMi) {
		marine.getArmaActiva().disparar(this, distanciaAMi);
		if(estoyMuerto()) {
			marine.recibirPuntos(puntosADar(distanciaAMi));
		}
	}

	public void bajarHP(int danio) {
		this.hp -= danio;
	}

	public boolean estoyMuerto() {
		return hp <= 0;
	}

	abstract int getDanio();
	
	public int puntosADar(int distanciaAMi) {
		return 0;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
}
