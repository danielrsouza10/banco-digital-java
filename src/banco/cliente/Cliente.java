package banco.cliente;

public class Cliente {
    private String nome;
    private String cpf;
    private String cep;

    //definindo construtor para que o cliente só possa ser criado com todas as informações
    public Cliente(String nome, String cpf, String cep) {
        this.nome = nome;
        this.cpf = cpf;
        this.cep = cep;
    }

    //getters para a consulta das informacões do cliente
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCep() {
        return cep;
    }

}
