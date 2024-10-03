package gameTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import game.of.poliform.Caballero;
import game.of.poliform.Soldado;
import game.of.poliform.Unidad;

class GameOfPoliform {

	private Soldado soldado;
	private Caballero caballero;

	@BeforeEach
	void setUp() {
		soldado = new Soldado(0); // Posicion inicial 0
		caballero = new Caballero(0); // Posicion inicial 0
	}

	@Test
	void testCrearSoldado() {
		assertTrue(soldado instanceof Unidad, "La instancia no es de la clase Unidad");
	}

	@Test
	void testIniciaConEnergia() {
		assertEquals(100, soldado.getEnergia());
	}

	@Test
	void testPuedeAtacar_ConEnergia() {
		assertTrue(soldado.puedeAtacar(caballero));
	}

	@Test
	void testPuedeAtacar_SinEnergia() {
		while (soldado.getEnergia() >= 10) {
			soldado.atacar(caballero);
		}

		assertFalse(soldado.puedeAtacar(caballero), "El soldado no deberia poder atacar sin energia suficiente");
	}

	@Test
	void testAtacarSacaEnergia() {
		soldado.atacar(caballero);// Resta 10 de energia
		soldado.atacar(caballero);// Resta 10 de energia

		assertEquals(80, soldado.getEnergia());
	}

}
