
public class TesteExercicioLacos {

	public static void main(String[] args) {

		int multiplos = 1;

		for (int contador = 1; contador <= 100; contador++) {
			multiplos++;
			if (multiplos % 3 == 0) {
				System.out.println(multiplos);
			}
		}

	}
}
