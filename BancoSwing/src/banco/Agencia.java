package banco;

public class Agencia {
    private int numeroAgencia;
    private Cliente funcionario;
    private Cliente[] todosOsClientes = new Cliente[100];
    private ContaPoupanca[] todasAsContasPoupanca = new ContaPoupanca[100];
    private ContaCorrente[] todasAsContasCorrente = new ContaCorrente[100];
    private int tamanhoArrayClientes = 0;
    private int tamanhoArrayPoupanca = 0;
    private int tamanhoArrayCorrente = 0;
    private int i;

    public Agencia(int numeroAgencia, Cliente funcionario) {
        this.numeroAgencia = numeroAgencia;
        this.funcionario = funcionario;
    }

    public void setCliente(Cliente cliente) {
	todosOsClientes[tamanhoArrayClientes] = cliente;
	tamanhoArrayClientes++;
    }

    public Cliente getCliente(int indice) {
	return todosOsClientes[indice];
    }
    
    public Cliente buscaCliente(String nome) {
        Cliente retornoCliente = null;
        
        for (i = 0; i < tamanhoArrayClientes; i++) {
            if (todosOsClientes[i].getNome().equals(nome )) {
                retornoCliente = todosOsClientes[i];
                break;
            }
        }
        
        return retornoCliente;
    }
    
    public String getFuncionario() {
        return funcionario.getNome();
    }

    public void setContaPoupanca(ContaPoupanca conta) {
	todasAsContasPoupanca[tamanhoArrayPoupanca] = conta;
	tamanhoArrayPoupanca++;
    }

    public ContaPoupanca getContaPoupanca(int indice) {
	return todasAsContasPoupanca[indice];
    }
    
    public void setContaCorrente(ContaCorrente conta) {
	todasAsContasCorrente[tamanhoArrayCorrente] = conta;
	tamanhoArrayCorrente++;
    }

    public ContaCorrente getContaCorrente(int indice) {
	return todasAsContasCorrente[indice];
    }

    public int getTamanhoArrayClientes() {
	return tamanhoArrayClientes;
    }

    public int getTamanhoArrayPoupanca() {
	return tamanhoArrayPoupanca;
    }
    
    public int getTamanhoArrayCorrente() {
	return tamanhoArrayCorrente;
    }

    public int getNumeroAgencia() {
	return numeroAgencia;
    }
}
