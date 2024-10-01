package game.of.poliform;

public class Caballo implements TomadorDeAgua {
	/*
	 * Un caballo se pone rebelde luego de 3 ataques, y puede calmarse si recibe una
	 * ración de agua Ninguna unidad muerta puede atacar, por supuesto
	 */

	private int contadorAtaque = 0;

	@Override
	public void beberAgua() {
		this.contadorAtaque = 0;

	}

	public boolean estaRebelde() {
		return (this.contadorAtaque == 3);
	}

	protected void setContadorAtaque() {
		this.contadorAtaque++;
	}

}
