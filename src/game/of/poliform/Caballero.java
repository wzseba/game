package game.of.poliform;

public class Caballero extends Unidad {
	/*
	 * Los caballeros pueden atacar a una distancia de 1 a 2, siempre que su caballo
	 * no se haya puesto rebelde. Infringe un daño de 50 puntos y comienza con 200
	 * de salud.
	 */

	private Caballo caballo;

	public Caballero(int posicion) {
		super(200, 50, posicion);
//		this.caballo = new Caballo();
	}

	@Override
	public boolean puedeAtacar(Unidad oponente) {
		return (this != oponente && !this.estaMuerto() && !oponente.estaMuerto() && estaDentroDelAlcance(oponente, 1, 2)
				&& !caballo.estaRebelde());
	}

	@Override
	public void atacar(Unidad oponente) {
		if (puedeAtacar(oponente)) {
			caballo.setContadorAtaque();
			infringirDanio(oponente);
		}

	}

//	public Caballo getCaballo() {
//		return caballo;
//	}

}
