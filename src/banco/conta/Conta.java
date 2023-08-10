package banco.conta;

import banco.cliente.Cliente;

public abstract class Conta {
    private static final int AGENCIA_PADRAO = 0001;
    private static int SEQUENCIAL = 0001;

    protected int agencia;
    protected int numero;
    protected double saldo = 0;
    //toda conta precisa de um cliente previamente criado
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = Conta.SEQUENCIAL++;
        //definindo que para a criação de uma conta, necessariamente precisa ser criado um cliente previamente
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void sacar(double valor) {
        if (valor <= this.saldo) {
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
        if (valor <= this.saldo) {
            this.sacar(valor);
            contaDestino.depositar(valor);
            System.out.println("Transferência realizada. Seu novo saldo é de: " + this.saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
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

    public void informacoesDaConta() {
        System.out.println("***Informações da Conta***");
        System.out.println("Titular: " + cliente.getNome());
        System.out.println("Agência: " + this.agencia);
        System.out.println("Conta: " + this.numero);
        System.out.println("Saldo: " + this.saldo);
    }

}
