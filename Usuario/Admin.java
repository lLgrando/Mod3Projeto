package LogicaDeProgramacao.Mod2Projeto.Usuario;

import LogicaDeProgramacao.Mod2Projeto.Produtos.Dados;
import LogicaDeProgramacao.Mod2Projeto.Produtos.Produto;

public class Admin {

    public void cadastrarProduto(Produto produto) {
        Dados.produtos.add(produto);
    }

    public void visualizarProdutos() {
        for (LogicaDeProgramacao.Mod2Projeto.Produtos.Produto produto : Dados.produtos) {
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Preco: " + produto.getPreco());
            System.out.println("Categoria: " + produto.getCategoria());
            System.out.println("Marca: " + produto.getMarca());
        }
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
        Dados.produtos.remove(produto);
    }
}
