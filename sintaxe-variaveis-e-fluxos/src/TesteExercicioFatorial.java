
public class TesteExercicioFatorial {

	public static void main(String[] args) {
		
		int fatorial = 1;
		
		for (int parcial = 1 ; parcial <= 10 ; parcial ++) {
			fatorial *= parcial;
			System.out.println("fatorial de " + parcial + " = " + fatorial);
		}
	}
}
