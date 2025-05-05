public class Empregado extends Pessoa {
    private String matriculaEmpregado;
    private String setor;

    public Empregado(String idPessoa, String nomeCompleto, String cpf, String endereco, String email, int telefone,
                     String matriculaEmpregado, String setor) {
        super(idPessoa, nomeCompleto, cpf, endereco, email, telefone);
        this.matriculaEmpregado = matriculaEmpregado;
        this.setor = setor;
    }
}
