package sistemabanco;

import java.util.ArrayList;

public class Cliente {
	private String nome;
	private String telefone;
	private String email;
        private ArrayList<ContaBancaria> minhasContas = new ArrayList<ContaBancaria>();
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
		minhasContas.add(novaConta);
	}

	public ContaBancaria buscaConta(int numero) {
		ContaBancaria minhaConta = null;
		int i;
                int tamanhoArray = minhasContas.size();

		for (i = 0; i < tamanhoArray; i++) {
			if (minhasContas.get(i).getNumero() == numero) {
				minhaConta = minhasContas.get(i);
			}
		}

		return minhaConta;
	}
}