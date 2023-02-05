package src.Produtos;

import java.util.UUID;

public class Informatica extends Produto {

    private int garantia;

    public Informatica(String nome, double preco, String categoria, String marca, int garantia) {
        super(UUID.randomUUID(), nome, preco, categoria, marca);
        this.garantia = garantia;
    }
 
    public int getGarantia() {
        return garantia;
    }

}
