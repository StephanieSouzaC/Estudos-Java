package bytebankComposto;

public class TestaClasses {

	public static void main(String[] args) {
		Cliente maria = new Cliente();
		maria.nome = "Maria da Silva";
		maria.cpf = "111.111.111-11";
		maria.profissao = "Engenheira Ambiental.";
		
		//associa cliente Maria a conta contaMaria.
		Conta contaMaria = new Conta();
		contaMaria.deposita(150);
		
		contaMaria.titular = maria;
		System.out.println(contaMaria.titular.nome);
	}
	
}
