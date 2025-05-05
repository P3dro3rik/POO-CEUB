public class Vendedores extends Pessoa {
    private String matriculaVendedor;
    private String tipoDeVenda;

    public Vendedores(String idPessoa, String nomeCompleto, String cpf, String endereco, String email, int telefone,
                      String matriculaVendedor, String tipoDeVenda) {
        super(idPessoa, nomeCompleto, cpf, endereco, email, telefone);
        this.matriculaVendedor = matriculaVendedor;
        this.tipoDeVenda = tipoDeVenda;
    }
}
