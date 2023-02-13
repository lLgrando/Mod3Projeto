package usuario;

import java.util.UUID;

import produtos.Dados;
import produtos.Produto;

public class Admin extends Usuario implements IUsuario {

    private UUID idAdmin;
    private boolean isAdmin;

    public Admin(String nome) {
        super(nome);
        this.idAdmin = id();
        this.isAdmin = this instanceof Admin;
    }

    public UUID getIdAdmin() {
        return idAdmin;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    @Override
    public UUID id() {
        return UUID.randomUUID();
    }

    @Override
    public String nome() {
        return this.getNome();
    }


    public void cadastrarProduto(Produto produto) {
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
