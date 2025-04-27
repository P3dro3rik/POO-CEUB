public class Cliente {
    private String nomeCompleto;
    private String cpf;
    private String enderecoCompleto;
    private String telefone;

    public Cliente(String nomeCompleto, String cpf, String enderecoCompleto, String telefone) {
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.enderecoCompleto = enderecoCompleto;
        this.telefone = telefone;
    }

    // Getters e Setters
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEnderecoCompleto() {
        return enderecoCompleto;
    }

    public void setEnderecoCompleto(String enderecoCompleto) {
        this.enderecoCompleto = enderecoCompleto;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
