package src;

import src.Produtos.Informatica;
import src.Produtos.Livro;
import src.Produtos.Mercado;
import src.Usuario.Admin;
import src.Usuario.Cliente;

public class Home extends MyFrame {

    public static void main(String[] args) {
       //  new MyFrame();
       //  new MyFrameUsuario();

        Admin a1 = new Admin();
        Cliente c1 = new Cliente("Leonardo", "Algo", "123");

        Livro cronicasDeNarnia = new Livro(
                "As Crônicas de Narnia",
                45,
                "Fantasia",
                "ABC",
                "C.S Lewis",
                184);

        Informatica teclado = new Informatica(
                "Teclado",
                120,
                "Periférico",
                "Dell",
                1);

        Mercado arroz = new Mercado(
                "Arroz",
                6,
                "Grãos",
                "Camil",
                "ABC",
                false);

        Informatica mouse = new Informatica(
                "Mouse",
                60,
                "Periférico",
                "Dell",
                1);

        Livro codigoLimpo = new Livro(
                "Código Limpo",
                91,
                "Tecnologia",
                "Alta Books",
                "Robert C. Martin",
                425);

                
        a1.cadastrarProduto(cronicasDeNarnia);
        a1.cadastrarProduto(teclado);
        a1.cadastrarProduto(arroz);
        a1.cadastrarProduto(mouse);
        a1.cadastrarProduto(codigoLimpo);

        a1.removerProduto(arroz);
        a1.visualizarProdutos();
        c1.ordenarPorPreco();
        c1.ordenarPorNome();

    }
}
