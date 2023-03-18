package bytebankEncapsulado;

public class TestaValores {
	
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 244456);
		
		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(1337, 269589);
		
		Conta conta3 = new Conta(1332, 269589);
		
		System.out.println(Conta.getTotal());
		
	}

}
