package bytebankComposto;

public class TestaContaSemCliente {
	
	public static void main(String[] args) {
		Conta contaJose = new Conta();
		
		System.out.println(contaJose.getSaldo());
		
		contaJose.titular= new Cliente();
		System.out.println(contaJose.titular);
		
		contaJose.titular.nome= "Jose da Silva";
		System.out.println(contaJose.titular.nome);
	}

}
