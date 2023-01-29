package LogicaDeProgramacao.Mod2Projeto.Produtos;

public class Mercado implements Produto {
    private String nome;
    private double preco;
    private String categoria;
    private String marca;
    private String tipo;

    public Mercado(String nome, double preco, String categoria, String marca, String tipo) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
        this.marca = marca;
        this.tipo = tipo;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public String getCategoria() {
        return categoria;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    public String getTipo() {
        return tipo;
    }
}
