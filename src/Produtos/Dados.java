package src.Produtos;

import java.util.ArrayList;
import java.util.List;

import src.Usuario.Usuario;

public class Dados {
    
    // Aqui ficam salvos os produtos que são inseridos pelo ADM.

    public static List<Produto> produtos = new ArrayList<>();

    public static List<Usuario> usuarios = new ArrayList<>();

    public static void visualizarProdutos() {
        for (Produto produto : produtos) {
            produto.visualizar();
        }
    }

}
