
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		venilton.setCpf(12345678902L);
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
