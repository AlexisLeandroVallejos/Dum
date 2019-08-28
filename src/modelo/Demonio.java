package modelo;

public abstract class Demonio {
	private int hp;

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public abstract void serAtacado(Arma arma, int distanciaAMi);
	
}
