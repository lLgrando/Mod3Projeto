package LogicaDeProgramacao.Mod2Projeto.Usuario;

import LogicaDeProgramacao.Mod2Projeto.Produtos.Dados;
import LogicaDeProgramacao.Mod2Projeto.Produtos.Produto;

public class Cliente {
    private String nome;
    private String endereco;
    private String telefone;

    public Cliente(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void visualizarListaProdutos() {
        for (Produto produto : Dados.produtos) {
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Preço: " + produto.getPreco());
            System.out.println("Categoria: " + produto.getCategoria());
            System.out.println("Marca: " + produto.getMarca());
            System.out.println("---------------------------------");
        }
    }

    public void filtrarPorCategoria(String categoria) {
        for (Produto produto : Dados.produtos) {
            if (produto.getCategoria().equals(categoria)) {
                System.out.println("Nome: " + produto.getNome());
                System.out.println("Preço: " + produto.getPreco());
                System.out.println("Categoria: " + produto.getCategoria());
                System.out.println("Marca: " + produto.getMarca());
                System.out.println("---------------------------------");
            }
        }
    }

    public void filtrarPorMarca(String marca) {
        for (Produto produto : Dados.produtos) {
            if (produto.getMarca().equals(marca)) {
                System.out.println("Nome: " + produto.getNome());
                System.out.println("Preço: " + produto.getPreco());
                System.out.println("Categoria: " + produto.getCategoria());
                System.out.println("Marca: " + produto.getMarca());
                System.out.println("---------------------------------");
            }
        }
    }

    public void ordenarPorNome() {
        Dados.produtos.sort((p1, p2) -> p1.getNome().compareTo(p2.getNome()));

        for (Produto p : Dados.produtos) {
            System.out.println("Nome: " + p.getNome());
            System.out.println("Preço: " + p.getPreco());
            System.out.println("Categoria: " + p.getCategoria());
            System.out.println("Marca: " + p.getMarca());
            System.out.println("---------------------------------");
        }
    }

    public void ordenarPorPreco() {
        Dados.produtos.sort((p1, p2) -> Double.compare(p1.getPreco(), p2.getPreco()));

        for (Produto p : Dados.produtos) {
            System.out.println("Nome: " + p.getNome());
                System.out.println("Preço: " + p.getPreco());
                System.out.println("Categoria: " + p.getCategoria());
                System.out.println("Marca: " + p.getMarca());
                System.out.println("---------------------------------");
        }
    }
}
