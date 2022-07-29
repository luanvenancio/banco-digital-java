
public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;
		System.out.println(String.format("--> [Conta %s - N: %d] Saque efetuado no valor de: R$ %.2f", this.cliente.getNome(), this.numero, valor));
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
		System.out.println(String.format("--> [Conta %s - N: %d] Deposito efetuado no valor de: R$ %.2f", this.cliente.getNome(), this.numero, valor));
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		System.out.println(String.format("--> Transferindo: R$ %.2f", valor));
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: R$ %.2f", this.saldo));
	}
}
