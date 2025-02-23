package game.of.poliform;

public abstract class Unidad {

	private int salud;
	private int danio;
	public int posicion;

	public Unidad(int salud, int danio, int posicion) {
		this.salud = salud;
		this.danio = danio;
		this.posicion = posicion;
	}

	public abstract boolean puedeAtacar(Unidad oponente);

	public abstract void atacar(Unidad oponente);

	protected void infringirDanio(Unidad oponente) {
		oponente.setSalud(oponente.getSalud() - this.getDanio());
	}

	public boolean estaDentroDelAlcance(Unidad oponente, int desde, int hasta) {
		return Math.abs(this.getPosicion() - oponente.getPosicion()) >= desde
				&& Math.abs(this.getPosicion() - oponente.getPosicion()) <= hasta;
	}

	protected boolean estaMuerto() {
		return (this.getSalud() <= 0);
	}

	public int getSalud() {
		return salud;
	}

	protected void setSalud(int salud) {
		this.salud = salud;
	}

	protected int getDanio() {
		return danio;
	}

	protected void setDanio(int danio) {
		this.danio = danio;
	}

	protected void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	protected int getPosicion() {
		return posicion;
	}

}