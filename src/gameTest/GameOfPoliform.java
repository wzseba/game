package gameTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import game.of.poliform.Soldado;
import game.of.poliform.Unidad;

class GameOfPoliform {

	@Test
	void testCrearSoldado() {
		Unidad soldado = new Soldado(2);

		assertTrue(soldado instanceof Unidad, "La instancia no es de la clase Unidad");
	}

}
