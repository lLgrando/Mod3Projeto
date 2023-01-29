package LogicaDeProgramacao.Mod2Projeto.Produtos;

public class Informatica implements Produto {
    private String nome;
    private double preco;
    private String categoria;
    private String marca;
    private String modelo;
    
    public Informatica(String nome, double preco, String categoria, String marca, String modelo) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
        this.marca = marca;
        this.modelo = modelo;
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
    
    public String getModelo() {
        return modelo;
    }
}
