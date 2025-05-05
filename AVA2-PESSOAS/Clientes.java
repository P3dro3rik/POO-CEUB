public class Clientes extends Pessoa {
    private String cadastroCliente;

    public Clientes(String idPessoa, String nomeCompleto, String cpf, String endereco, String email, int telefone,
                    String cadastroCliente) {
        super(idPessoa, nomeCompleto, cpf, endereco, email, telefone);
        this.cadastroCliente = cadastroCliente;
    }
}
