package bytebankEncapsulado;

public class TestaSeteGet {
	public static void main(String[] args) {
		Conta conta = new Conta(1526, 5998648);
		
		System.out.println(conta.getNumero());
		
		Cliente ana = new Cliente();;
		ana.setNome("Ana Lucia");
		conta.setTitular(ana);
		System.out.println(conta.getTitular().getNome());
		//System.out.println(ana.getNome());
		
		conta.getTitular().setProfissao("Cozinheira");
		System.out.println(conta.getTitular().getProfissao());
	}

}
