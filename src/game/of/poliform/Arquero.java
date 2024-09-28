package game.of.poliform;

public class Arquero extends Unidad {
	/*
	 * Los Arqueros pueden atacar a una distancia de entre 2 y 5 respecto de su
	 * enemigo, y si tienen suficientes flechas. Comienzan con 20 flechas en su
	 * carcaj, y pueden recargar si reciben un paquete de seis flechas. Infringen un
	 * daño de 5 puntos, y comienzan con 50 de salud
	 */

	private int distancia;
	private int flechas;

	public Arquero(int salud, int daño) {
		super(salud, daño);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void atacar() {
		// TODO Auto-generated method stub

	}

}
