package game.of.poliform;

public class Soldado extends Unidad {
	/*
	 * Los soldados pueden atacar cuerpo a cuerpo a otras unidades si tienen
	 * suficiente energía. Cada ataque les consume 10 puntos de energía, y comienzan
	 * con 100. Restauran energía si reciben la ración de agua. Infringen un daño de
	 * 10 puntos y comienzan con 200 de salud
	 */

	private int energia;

	public Soldado(int salud, int daño) {
		super(salud, daño);
		this.energia = 100;
	}

	@Override
	public void atacar() {
		// TODO Auto-generated method stub

	}

}
