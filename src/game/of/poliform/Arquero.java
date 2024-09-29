package game.of.poliform;

public class Arquero extends Unidad {
	/*
	 * Los Arqueros pueden atacar a una distancia de entre 2 y 5 respecto de su
	 * enemigo, y si tienen suficientes flechas. Comienzan con 20 flechas en su
	 * carcaj, y pueden recargar si reciben un paquete de seis flechas. Infringen un
	 * daño de 5 puntos, y comienzan con 50 de salud
	 */

	private int flechas;

	public Arquero(int posicion) {
		super(50, 5, posicion);
		this.flechas = 20;
	}

	@Override
	public boolean puedeAtacar(Unidad oponente) {
		return (this != oponente && !this.estaMuerto() && !oponente.estaMuerto() && estaDentroDelAlcance(oponente, 2, 5)
				&& getFlechas() >= 1);
	}

	@Override
	public void atacar(Unidad oponente) {
		if (this.puedeAtacar(oponente)) {
			this.flechas -= 1;
			infringirDanio(oponente);
		}
	}

	public int getFlechas() {
		return flechas;
	}

	public void recargarFlechas() {
		this.flechas += 6;
	}

}
