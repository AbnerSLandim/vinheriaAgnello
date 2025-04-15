package joy.aldrin.zerlin.bean;

public class Produto {
    private String nome;
    private String descricao;
    private String imagem;
    private String marca;
    private String categoria;
    private double preco;

    public Produto(String nome, String descricao, String imagem, String marca, String categoria, double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.imagem = imagem;
        this.marca = marca;
        this.categoria = categoria;
        this.preco = preco;
    }

    public String getNome() { return nome; }
    public String getDescricao() { return descricao; }
    public String getImagem() { return imagem; }
    public String getMarca() { return marca; }
    public String getCategoria() { return categoria; }
    public double getPreco() { return preco; }
}

