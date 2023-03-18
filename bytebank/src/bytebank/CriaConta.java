package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);

		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.agencia = 146;
		System.out.println("Agora a segunda conta esta na agencia " + primeiraConta.agencia);

		Conta segundaConta = new Conta();
		segundaConta.saldo = 300;

		System.out.println("Primeira Conta tem R$" + primeiraConta.saldo);
		System.out.println("Segunda Conta tem R$" + segundaConta.saldo);

		segundaConta.agencia = 146;
		System.out.println("Agora a segunda conta esta na agencia " + segundaConta.agencia);

		if (primeiraConta == segundaConta) {
			System.out.println("Sao a mesma conta");
		} else {
			System.out.println("Sao contas diferentes");
		}
	}

}
