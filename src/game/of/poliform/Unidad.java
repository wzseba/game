package game.of.poliform;

public abstract class Unidad {

	private int salud;
	private int da�o;

	public Unidad(int salud, int da�o) {

		this.salud = salud;
		this.da�o = da�o;
	}

	public abstract void atacar();

}
