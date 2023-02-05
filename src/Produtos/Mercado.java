package src.Produtos;

import java.util.UUID;

public class Mercado extends Produto {

    private boolean perecivel;

    public Mercado(String nome, double preco, String categoria, String marca, String tipo, boolean perecivel) {
        super(UUID.randomUUID(), nome, preco, categoria, marca);
        this.perecivel = perecivel;
    }

    public boolean isPerecivel() {
        return perecivel;
    }  

}
