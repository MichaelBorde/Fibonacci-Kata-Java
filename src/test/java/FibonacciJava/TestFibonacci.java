package FibonacciJava;

import static org.fest.assertions.Assertions.*;

import org.junit.Test;

public class TestFibonacci {

	@Test
	public void fiboDe0Donne0() {
		assertThat(fibo(0)).isEqualTo(0);
	}

	@Test
	public void fiboDe1Donne1() {
		assertThat(fibo(1)).isEqualTo(1);
	}

	@Test
	public void peutCalculerLesRésultatsGénéraux() {
		assertThat(fibo(2)).isEqualTo(1);
		assertThat(fibo(3)).isEqualTo(2);
		assertThat(fibo(4)).isEqualTo(3);
		assertThat(fibo(8)).isEqualTo(21);
	}

	@Test
	public void ilEstPossibleDeConnaitreLeRésultatPourUnGrandNombre() {
		assertThat(fibo(1337)).isGreaterThan(0);
	}

	private int fibo(int nombre) {
		if (nombre <= 1) {
			return nombre;
		}
		return fib(nombre - 1, 0, 1);
	}

	private int fib(int nombre, int valeurN1, int valeurN) {
		if (nombre == 0) {
			return valeurN;
		}
		return fib(nombre - 1, valeurN, valeurN1 + valeurN);
	}
}
