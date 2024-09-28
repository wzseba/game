package game.of.poliform;

public class Soldado extends Unidad {
	/*
	 * Los soldados pueden atacar cuerpo a cuerpo a otras unidades si tienen
	 * suficiente energ�a. Cada ataque les consume 10 puntos de energ�a, y comienzan
	 * con 100. Restauran energ�a si reciben la raci�n de agua. Infringen un da�o de
	 * 10 puntos y comienzan con 200 de salud
	 */

	private int energia;

	public Soldado(int salud, int da�o) {
		super(salud, da�o);
		this.energia = 100;
	}

	@Override
	public void atacar() {
		// TODO Auto-generated method stub

	}

}
