package fibonacci;

public class Fibonacci {

	public int pour(int nombre) {
		return fonctionAuxiliaire(nombre, 0, 1);
	}

	private static int fonctionAuxiliaire(int nombre, int résultat, int résultatSuivant) {
		if (nombre == 0) {
			return résultat;
		}
		return fonctionAuxiliaire(nombre - 1, résultatSuivant, résultat + résultatSuivant);
	}
}