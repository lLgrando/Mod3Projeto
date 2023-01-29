package LogicaDeProgramacao.Mod2Projeto;

import LogicaDeProgramacao.Mod2Projeto.Produtos.Informatica;
import LogicaDeProgramacao.Mod2Projeto.Produtos.Livro;
import LogicaDeProgramacao.Mod2Projeto.Produtos.Mercado;
import LogicaDeProgramacao.Mod2Projeto.Usuario.Admin;
import LogicaDeProgramacao.Mod2Projeto.Usuario.Cliente;

public class Home {

    public static void main(String[] args) {

        Admin a1 = new Admin();
        Cliente c1 = new Cliente("Leonardo", "Algo", "123");

        Livro cronicasDeNarcia = new Livro(
            "As Crônicas de Narnia",
            45, 
            "Fantasia", 
            "ABC", 
            "C.S Lewis",
            184
        );

        Informatica teclado = new Informatica(
            "Teclado",
            120,
            "Periférico",
            "Dell",
            "ABC123"
        );

        Mercado arroz = new Mercado(
            "Arroz", 
            6, 
            "Grãos",
            "Camil", 
            "ABC"
        );


        a1.cadastrarProduto(cronicasDeNarcia);
        a1.cadastrarProduto(teclado);
        a1.cadastrarProduto(arroz);

      // c1.ordenarPorPreco();
        c1.ordenarPorNome();

    }
}
