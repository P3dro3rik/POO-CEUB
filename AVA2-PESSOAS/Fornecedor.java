public class Fornecedor extends Pessoa {
    private int cnpj;
    private String matriculaFornecedor;

    public Fornecedor(String idPessoa, String nomeCompleto, String cpf, String endereco, String email, int telefone,
                      int cnpj, String matriculaFornecedor) {
        super(idPessoa, nomeCompleto, cpf, endereco, email, telefone);
        this.cnpj = cnpj;
        this.matriculaFornecedor = matriculaFornecedor;
    }
}

}
