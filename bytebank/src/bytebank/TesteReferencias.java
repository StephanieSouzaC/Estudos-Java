package bytebank;

public class TesteReferencias {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo da primeira conta: R$" + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		
		System.out.println("Saldo da segunda conta: R$" + segundaConta.saldo);
		
		segundaConta.saldo += 150;
		
		System.out.println("Novo saldo da segunda conta: R$" + segundaConta.saldo);
		
		System.out.println(primeiraConta.saldo);
		
		if(primeiraConta == segundaConta) {
			System.out.println("sao a mesma conta");
		}
	}
	
	
}
