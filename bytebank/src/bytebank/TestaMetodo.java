package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaMaria = new Conta();
		contaMaria.saldo = 100;
		contaMaria.deposita(50);
		System.out.println(contaMaria.saldo);
		
		contaMaria.saca(20);
		System.out.println(contaMaria.saldo);
		
		contaMaria.saca(170);
		System.out.println(contaMaria.saldo);
		boolean conseguiuRetirar = contaMaria.saca(170);
		System.out.println(conseguiuRetirar);
		
		Conta contaJoana = new Conta();
		contaJoana.deposita(1000);
		
		if(contaJoana.tranfere(500, contaMaria)) {
			System.out.println("A transferencia foi realizada com sucesso!");
		} else {
			System.out.println("Erro na transferencia!");
		}
		System.out.println("Valor da conta da Joana e: R$" + contaJoana.saldo);
		System.out.println("Valor da conta da Maria e: R$" + contaMaria.saldo);
		
		contaMaria.titular = "Maria da Silva";
		System.out.println(contaMaria.titular);
	}
	
}
