package game.of.poliform;

public class Soldado extends Unidad implements TomadorDeAgua {
	/*
	 * Los soldados pueden atacar cuerpo a cuerpo a otras unidades si tienen
	 * suficiente energ�a. Cada ataque les consume 10 puntos de energ�a, y comienzan
	 * con 100. Restauran energ�a si reciben la raci�n de agua. Infringen un da�o de
	 * 10 puntos y comienzan con 200 de salud
	 */

	private int energia;

	public Soldado(int posicion) {
		super(200, 10, posicion);
		this.energia = 100;
	}

	@Override
	public boolean puedeAtacar(Unidad oponente) {
		return (this != oponente && !this.estaMuerto() && !oponente.estaMuerto() && this.energia >= 10
				&& estaDentroDelAlcance(oponente, 0, 0));
	}

	@Override
	public void atacar(Unidad oponente) {
		if (this.puedeAtacar(oponente)) {
			this.energia -= 10;
			infringirDanio(oponente);
		}
	}

	protected int getEnergia() {
		return energia;
	}

	@Override
	public void beberAgua() {
		this.energia = 100;
	}
}