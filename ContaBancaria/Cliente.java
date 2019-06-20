public class Cliente {
	private String nome;
	private String telefone;
	private String email;
	private ContaBancaria[] minhasContas = new ContaBancaria[10];
	private int indiceArray = 0;

	public Cliente() {

	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setConta(ContaBancaria novaConta) {
		minhasContas[indiceArray] = novaConta;
		indiceArray++;
	}

	public ContaBancaria buscaConta(int numero) {
		ContaBancaria minhaConta = null;
		int i;

		for (i = 0; i < indiceArray; i++) {
			if (minhasContas[i].getNumero() == numero) {
				minhaConta = minhasContas[i];
			}
		}

		return minhaConta;
	}
}