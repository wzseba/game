package game.of.poliform;

public abstract class Unidad {

	private int salud;
	private int daño;

	public Unidad(int salud, int daño) {

		this.salud = salud;
		this.daño = daño;
	}

	public abstract void atacar();

}
