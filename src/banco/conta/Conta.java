package banco.conta;

public abstract class Conta {
    private int agencia;
    private int numero;
    private double saldo;

    public void sacar(double valor) {
        if (valor >= this.saldo) {
            this.saldo -= valor;
            System.out.println("O seu saldo agora é de: " + this.saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("O seu saldo agora é de: " + this.saldo);
    }

    public void transferir(double valor, Conta contaDestino) {

    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

}
