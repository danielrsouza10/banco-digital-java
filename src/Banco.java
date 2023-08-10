import banco.cliente.Cliente;
import banco.conta.Conta;
import banco.conta.ContaCorrente;
import banco.conta.ContaPoupanca;

public class Banco {
    public static void main(String[] args) {
        //criando um cliente
        Cliente daniel = new Cliente("Daniel", "006039991-07", "74140-100");
        

        //criando uma conta corrente
        Conta conta1 = new ContaCorrente(daniel);
        conta1.informacoesDaConta();
        conta1.depositar(150);
        // System.out.println(conta1.getSaldo());

        //criando uma conta poupança para o mesmo cliente
        Conta conta2 = new ContaPoupanca(daniel);
        conta2.informacoesDaConta();
        conta2.depositar(100);
        // System.out.println(conta2.getSaldo());

        conta1.transferir(250, conta2);

        // System.out.println(conta2.getSaldo());

        // System.out.println(conta1.getCliente().getNome());

        
        
    }
}
