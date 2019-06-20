package sistemabanco;

public class ContaBancaria {
	private int numero;
	private double saldo;
	private boolean ativa;
	private Cliente cliente;

	public ContaBancaria(int numero, Cliente cliente) {
		this.numero = numero;
		this.cliente = cliente;
		ativa = true;
		saldo = 0;
	}	

	public double sacar(double valor) {
		if ((saldo - valor) >= 0) {
			saldo = saldo - valor;
		}
		return saldo;
	}

	public double depositar(double valor) {
		saldo = saldo + valor;

		return saldo;
	}

	public String getNome() {
		return cliente.getNome();
	}

	public double getSaldo() {
		return saldo;
	}

	public int getNumero() {
		return numero;
	}

	public boolean getAtiva() {
		return ativa;
	}

	public void cancelarConta() {
		ativa = false;
	}
}
