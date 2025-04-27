public class ItemPedido {
    private String codigoProduto;
    private String descricaoProduto;
    private int quantidade;
    private double precoUnitario;
    private double valorTotal;

    public ItemPedido(String codigoProduto, String descricaoProduto, int quantidade, double precoUnitario) {
        this.codigoProduto = codigoProduto;
        this.descricaoProduto = descricaoProduto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
        this.valorTotal = calcularValorTotal();
    }

    public double calcularValorTotal() {
        this.valorTotal = quantidade * precoUnitario;
        return valorTotal;
    }

    // Getters e Setters
    public String getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
        calcularValorTotal();
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
        calcularValorTotal();
    }

    public double getValorTotal() {
        return valorTotal;
    }
}
