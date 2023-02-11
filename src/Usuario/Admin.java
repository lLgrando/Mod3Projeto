package src.Usuario;

import src.Produtos.Dados;
import src.Produtos.Produto;

public class Admin {

    public <T extends Produto> void cadastrarProduto(T produto) {
        Dados.produtos.add(produto);
    }

    public void visualizarProdutos() {
        Dados.visualizarProdutos();
    }

    public void editarProduto(Produto produto) {
        for (Produto p : Dados.produtos) {
            if (p.getNome().equals(produto.getNome())) {
                int index = Dados.produtos.indexOf(p);
                Dados.produtos.set(index, produto);
                break;
            }
        }
    }

    public void removerProduto(Produto produto) {
        try {
            Dados.produtos.remove(produto);
        } catch (Exception e) {
            System.out.println("Impossível remover o produto. Tente novamente.");
        }
    }

}
