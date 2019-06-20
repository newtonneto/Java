public class Agencia {
	private int numeroAgencia;
	private Cliente[] todosOsClientes = new Cliente[3];
	private ContaBancaria[] todasAsContas = new ContaBancaria[3];
	private Cliente[] copiaTodosOsClientes;
	private ContaBancaria[] copiaTodasAsContas;
	private int tamanhoArray;
	private int i;

	public Agencia(int numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	public void setCliente(Cliente cliente) {
		tamanhoArray = todosOsClientes.length;
		todosOsClientes[tamanhoArray] = cliente;
	}

	public void setConta(ContaBancaria conta) {
		tamanhoArray = todasAsContas.length;
		todasAsContas[tamanhoArray] = conta;
	}

	public int getNumeroAgencia() {
		return numeroAgencia;
	}
}