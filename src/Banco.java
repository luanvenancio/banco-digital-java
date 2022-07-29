import java.util.List;

public class Banco {
	
	private String nome;
	private List<Conta> contas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
	protected void imprimirContas() {
		System.out.println(String.format("Contas Cadastradas: %s", this.contas));
	}
}
