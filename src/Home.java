import pagamentos.EnumPagamentos;
import produtos.Informatica;
import produtos.Livro;
import produtos.Mercado;
import usuario.Admin;
import usuario.ClientePF;
import usuario.ClientePJ;

public class Home {

    public static void main(String[] args) {

        Admin a1 = new Admin("LeoAdmin");
        ClientePF pf = new ClientePF("Leonardo", "Algo", "123");
        ClientePJ pj = new ClientePJ("Empresa ABC", "456798");
        ClientePJ pj2 = new ClientePJ("Empresa XYZ", "1472855");

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

        Informatica monitor = new Informatica(
                "Monitor",
                1600,
                "Periférico",
                "LG",
                1);

        Informatica notebook = new Informatica(
                "Notebook",
                4000,
                "Notebook",
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
        a1.cadastrarProduto(monitor);
        a1.cadastrarProduto(notebook);
        a1.cadastrarProduto(codigoLimpo);

        // a1.removerProduto(arroz);
        // a1.visualizarProdutos();
        // c1.ordenarPorPrecoMaiorMenor();
        // c1.ordenarPorPrecoMenorMaior();
        // c1.ordenarPorNomeMaiorMenor();
        // c1.ordenarPorNomeMenorMaior();

        pf.adicionarAoCarrinho(new String[] { "Código Limpo" });
        pj.adicionarAoCarrinho(new String[] { "As Crônicas de Narnia", "Teclado", "Arroz", "Arroz" });
        pj2.adicionarAoCarrinho(new String[] { "Notebook" });

        pf.pagar(EnumPagamentos.FATURAMENTO); // erro - faturamento apenas para PJ
        pj.pagar(EnumPagamentos.FATURAMENTO);
        pj2.pagar(EnumPagamentos.PIX); // erro - valor máximo do pix é 1k
        pj2.pagar(EnumPagamentos.CARTAO); // erro - valor máximo para cartão é 2k
        pj2.pagar(EnumPagamentos.BOLETO);

    }
}
