
public class TesteExercicio {

	public static void main(String[] args) {

		double salario = 1951.00;

		if (salario >= 1900.00 && salario <= 2800.00) {
			System.out.println(" IR e de 7.5% e pode deduzir na declaracao o valor de R$ 142");
		}
		if (salario >= 2800.01 && salario <= 3751.00) {
			System.out.println("o IR e de 15% e pode deduzir na declaracao o valor de R$ 350");
		}
		if (salario >= 3751.01 && salario <= 4664.00) {
			System.out.println("o IR e de 22.5% e pode deduzir na declaracao o valor de R$ 636");
		}
	}
}
