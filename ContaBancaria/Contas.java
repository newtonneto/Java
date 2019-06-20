import java.util.ArrayList;

public class Contas {
	private ArrayList<ContaBancaria> todasAsContas = new ArrayList();
	private int numero = todasAsContas.size();

	public void adicionarConta(ContaBancaria novaConta) {
		todasAsContas.add(novaConta);
	}

	public int getNumero() {
		return numero;
	}
}
