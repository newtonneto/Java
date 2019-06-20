package contabancaria;

public class Agencia {
	private int numeroAgencia;
	private Cliente[] todosOsClientes = new Cliente[3];
	private ContaBancaria[] todasAsContas = new ContaBancaria[3];
	private Cliente[] copiaTodosOsClientes;
	private ContaBancaria[] copiaTodasAsContas;
	private int tamanhoArrayClientes = 0;
	private int tamanhoArrayContas = 0;
	private int i;

	public Agencia(int numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	public void setCliente(Cliente cliente) {
		todosOsClientes[tamanhoArrayClientes] = cliente;
		tamanhoArrayClientes++;
	}

	public Cliente getCliente(int indice) {
		return todosOsClientes[indice];
	}

	public void setConta(ContaBancaria conta) {
		todasAsContas[tamanhoArrayContas] = conta;
		tamanhoArrayContas++;
	}

	public ContaBancaria getConta(int indice) {
		return todasAsContas[indice];
	}

	public int getTamanhoArrayClientes() {
		return tamanhoArrayClientes;
	}

	public int getTamanhoArrayContas() {
		return tamanhoArrayContas;
	}

	public int getNumeroAgencia() {
		return numeroAgencia;
	}
}