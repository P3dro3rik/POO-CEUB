

public class Pedido {
    private String identificacao;
    private LocalDateTime dataHora;
    private Vendedor vendedor;
    private Cliente cliente;
    private String status;
    private List<ItemPedido> itens;
    private double valorTotal;

    public Pedido(String identificacao, Vendedor vendedor, Cliente cliente) {
        this.identificacao = identificacao;
        this.dataHora = LocalDateTime.now();
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.status = "Em processamento";
        this.itens = new ArrayList<>();
        this.valorTotal = 0.0;
    }

    public double calcularValorTotal() {
        valorTotal = 0.0;
        for (ItemPedido item : itens) {
            valorTotal += item.calcularValorTotal();
        }
        return valorTotal;
    }

    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
    }

    public void adicionarItem(ItemPedido item) {
        this.itens.add(item);
        calcularValorTotal();
    }

    public void removerItem(ItemPedido item) {
        this.itens.remove(item);
        calcularValorTotal();
    }

    public void aplicarDesconto(double percentualDesconto) {
        double desconto = valorTotal * (percentualDesconto / 100.0);
        valorTotal -= desconto;
    }

    // Getters e Setters (opcional)
}
