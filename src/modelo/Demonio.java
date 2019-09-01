package modelo;

public abstract class Demonio {
	private int hp;
	private int danio;

	public int getHp() {
		return hp;
	}

	public void serAtacadoPor(Marine marine, int distanciaAMi) {
		marine.getArmaActiva().disparar(this, distanciaAMi);
	}

	public void bajarHP(int danio) {
		this.hp -= danio;
	}

	public boolean estoyMuerto() {
		return hp <= 0;
	}

	public int getDanio() {
		return danio;
	}
	
}
