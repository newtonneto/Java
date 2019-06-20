package banco;

public class ContaPoupanca {
    private int numeroConta;
    private double saldo;
    private boolean status;
    private Cliente titular;
    private int numeroAgencia;
    
    public ContaPoupanca(int numeroConta, Cliente titular, int numeroAgencia) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.numeroAgencia = numeroAgencia;
        saldo = 50;
        status = true;
    }
    
    public void depositar(double valor) {
        saldo = saldo + valor;
    }
    
    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo = saldo - valor;
        }
    }
    
    public void cancelarConta() {
        status = false;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public String getNomeTitular() {
        return titular.getNome();
    }
    
    public int getNumeroConta() {
        return numeroConta;
    }
    
    public int getNumeroAgencia() {
        return numeroAgencia;
    }
    
    public boolean getStatus() {
        return status;
    }
}
