package game.of.poliform;

public class Lancero extends Unidad {
	/*
	 * Los lanceros pueden atacar a una distancia de 1 a 3, sin condición. Infringen
	 * un daño de 25 puntos, y comienzan con 150 de salud
	 */

	public Lancero(int posicion) {
		super(150, 25, posicion);
	}

	@Override
	public boolean puedeAtacar(Unidad oponente) {
		return (this != oponente && !oponente.estaMuerto() && !this.estaMuerto() && estaDentroDelAlcance(oponente, 1, 3)
				&& this.getSalud() >= 1);
	}

	@Override
	public void atacar(Unidad oponente) {
		if (puedeAtacar(oponente)) {
			infringirDanio(oponente);
		}
	}
}