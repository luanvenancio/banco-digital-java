import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("Luan");
		List<Conta> contas = new ArrayList<Conta>();
		
		Conta corrente = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);
		
		contas.add(corrente);
		contas.add(poupanca);
		
		Banco banco = new Banco();
		banco.setNome("Bradesco");
		banco.setContas(contas);
		

		corrente.depositar(1000);
		corrente.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		corrente.transferir(200, poupanca);
		
		corrente.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		banco.imprimirContas();
	}

}
