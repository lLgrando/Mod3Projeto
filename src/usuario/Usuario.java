package usuario;

import carrinho.Carrinho;
import produtos.Dados;
import produtos.Produto;

abstract class Usuario extends Carrinho{

    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void visualizarProdutos() {
        Dados.visualizarProdutos();
    }

    public void filtrarPorCategoria(String categoria) {
        for (Produto produto : Dados.produtos) {
            if (produto.getCategoria().equals(categoria)) {
                visualizarProdutos();
            }
        }
    }

    public void filtrarPorMarca(String marca) {
        for (Produto produto : Dados.produtos) {
            if (produto.getMarca().equals(marca)) {
                visualizarProdutos();
            }
        }
    }

    public void ordenarPorNomeMaiorMenor() {
        Dados.produtos.sort((p1, p2) -> p1.getNome().compareTo(p2.getNome()));
        visualizarProdutos();
    }

    public void ordenarPorNomeMenorMaior() {
        Dados.produtos.sort((p2, p1) -> p1.getNome().compareTo(p2.getNome()));
        visualizarProdutos();
    }

    public void ordenarPorPrecoMaiorMenor() {
        Dados.produtos.sort((p2, p1) -> Double.compare(p1.getPreco(), p2.getPreco()));
        visualizarProdutos();
    }

    public void ordenarPorPrecoMenorMaior() {
        Dados.produtos.sort((p1, p2) -> Double.compare(p1.getPreco(), p2.getPreco()));
        visualizarProdutos();
    }

}
