package src.Produtos;

import java.util.UUID;

public class Produto extends ProdutoAbstract {

    public Produto(UUID id, String nome, double preco, String categoria, String marca) {
        super(id, nome, preco, categoria, marca);
    }

    public static void visualizarProdutos() {
        for (Produto produto : Dados.produtos) {
            System.out.println("Nome: " + produto.getId());
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Preco: " + produto.getPreco());
            System.out.println("Categoria: " + produto.getCategoria());
            System.out.println("Marca: " + produto.getMarca());
            if(produto instanceof Livro) System.out.println("Marca: " + produto.getPaginas());
            if (produto instanceof Informatica)System.out.println("Garantia: " + produto.getGarantia()+ " ano");
            if(produto instanceof Mercado) System.out.println("Perecivel: " + produto.isPerecivel());
        }
    }
}
