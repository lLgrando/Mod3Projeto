package LogicaDeProgramacao.Mod2Projeto.Produtos;

public class Livro implements Produto {
    private String nome;
    private double preco;
    private String categoria;
    private String marca;
    private String autor;
    private int numeroPaginas;
    
    public Livro(String nome, double preco, String categoria, String marca, String autor, int numeroPaginas) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
        this.marca = marca;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
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
    
    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }
}
