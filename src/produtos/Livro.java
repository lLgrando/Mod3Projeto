package produtos;

import java.util.UUID;

public class Livro extends Produto {

    private String autor;
    private int paginas;

    public Livro(String nome, double preco, String categoria, String marca, String autor, int paginas) {
        super(UUID.randomUUID(), nome, preco, categoria, marca);
        this.autor = autor;
        this.paginas = paginas;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Autor: " + this.autor);
        System.out.println("Paginas: " + this.paginas);
    }

}
