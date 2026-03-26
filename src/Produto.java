public class Produto {

    private static int contadorId = 1;
    private String nome;
    private Double preco;
    private Integer quantidade;
    private Integer id;


    public Produto(String nome, Double preco, Integer quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.id = contadorId++;
    }
    public Produto() {}

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return
                "ID " +id+ " || Nome= " + nome + " || Preço= " + preco + " || Quantidade= " + quantidade;
    }
}
