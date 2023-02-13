package produtos;

import java.util.ArrayList;
import java.util.List;


public class Dados {
    
    // Aqui ficam salvos os produtos que são inseridos pelo ADM.

    public static List<Produto> produtos = new ArrayList<>();

    public static void visualizarProdutos() {
        for (Produto produto : produtos) {
            produto.visualizar();
        }
    }
}
