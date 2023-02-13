package produtos;

import java.util.UUID;

public abstract class Produto {

    private UUID id;
    private String nome;
    private double preco;
    private String categoria;
    private String marca;
    private int paginas;
    private boolean perecivel;
    private int garantia;

    public Produto(UUID id, String nome, double preco, String categoria, String marca) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
        this.marca = marca;
    }

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getMarca() {
        return marca;
    }

    public int getPaginas() {
        return paginas;
    }

    public boolean isPerecivel() {
        return perecivel;
    }

    public int getGarantia() {
        return garantia;
    }

    public void visualizar() {
        System.out.println("Nome: " + this.getId());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Preco: " + this.getPreco());
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("Marca: " + this.getMarca());
    }

}
