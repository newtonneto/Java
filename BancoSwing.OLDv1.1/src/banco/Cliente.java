package banco;

public class Cliente {
    private String nome;
    private String telefone;
    private String email;
    private ContaPoupanca[] minhasContasPoupanca = new ContaPoupanca[5];
    private ContaCorrente[] minhasContasCorrente = new ContaCorrente[5];
    private int numeroAgencia;
    private int indiceArrayPoupanca = 0;
    private int indiceArrayCorrente = 0;

    public Cliente() {

    }
    
    public Cliente(String nome, String telefone, String email) {
	this.nome = nome;
	this.telefone = telefone;
	this.email = email;
    }

    public Cliente(String nome, String telefone, String email, int numeroAgencia) {
	this.nome = nome;
	this.telefone = telefone;
	this.email = email;
	this.numeroAgencia = numeroAgencia;
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

    public void setContaPoupanca(ContaPoupanca novaConta) {
	minhasContasPoupanca[indiceArrayPoupanca] = novaConta;
	indiceArrayPoupanca++;
    }
    
    public void setContaCorrente(ContaCorrente novaConta) {
	minhasContasCorrente[indiceArrayCorrente] = novaConta;
	indiceArrayCorrente++;
    }

    public int getNumeroAgencia() {
	return numeroAgencia;
    }

    public int getQuantidadeDeContasPoupanca() {
	return indiceArrayPoupanca;
    }
    
    public int getQuantidadeDeContasCorrente() {
	return indiceArrayCorrente;
    }

    public ContaPoupanca getMinhaContaPoupanca(int indice) {
	return minhasContasPoupanca[indice];
    }
    
    public ContaCorrente getMinhaContaCorrente(int indice) {
	return minhasContasCorrente[indice];
    }

    public ContaPoupanca buscaContaPoupanca(int numero) {
	ContaPoupanca minhaConta = null;
	int i;

    	for (i = 0; i < indiceArrayPoupanca; i++) {
            if (minhasContasPoupanca[i].getNumeroConta() == numero) {
		minhaConta = minhasContasPoupanca[i];
            }
	}

	return minhaConta;
    }
    
    public ContaCorrente buscaContaCorrente(int numero) {
	ContaCorrente minhaConta = null;
	int i;

    	for (i = 0; i < indiceArrayCorrente; i++) {
            if (minhasContasCorrente[i].getNumeroConta() == numero) {
		minhaConta = minhasContasCorrente[i];
            }
	}

	return minhaConta;
    }
}
