package carrinho;

import java.time.LocalDateTime;
import java.util.UUID;

import pagamentos.Boleto;
import pagamentos.CartaoCredito;
import pagamentos.EnumPagamentos;
import pagamentos.Faturamento;
import pagamentos.Pix;
import produtos.Dados;
import produtos.Produto;
import usuario.ClientePF;

public abstract class Carrinho {

    private double precoTotal;
    private String[] carrinho;

    public void adicionarAoCarrinho(String[] listaProdutos) {
        for (String a : listaProdutos) {
            for (Produto b : Dados.produtos) {
                if (a == b.getNome()) {
                    precoTotal += b.getPreco();
                    carrinho = listaProdutos;
                }
            }
        }
    }

    public void verProdutosCarrinho() {
        System.out.println("#### Produtos no Carrinho ####");
        for (String a : carrinho) {
            System.out.println(a);
        }
        System.out.println("##############################");
    }

    public double precoTotal() {
        return precoTotal;
    }

    public Object pagar(EnumPagamentos formaDePagamento) {
        switch (formaDePagamento) {
            case PIX:
                if (precoTotal >= 1000) {
                    System.out.println("Pagamento com PIX deve ser menor que R$ 1.000,00");
                    return null;
                }
                return new Pix(precoTotal, UUID.randomUUID(), LocalDateTime.now());

            case BOLETO:
                return new Boleto(precoTotal, UUID.randomUUID(), LocalDateTime.now());

            case FATURAMENTO:
                if(this instanceof ClientePF){
                    System.out.println("Pagamento disponível apenas para PJ.");
                    return null;
                }
                return new Faturamento(precoTotal, UUID.randomUUID(), LocalDateTime.now());

            case CARTAO:
                if (precoTotal >= 2000) {
                    System.out.println("Pagamento com Cartão deve ser menor que R$ 2.000,00");
                    return null;
                }
                return new CartaoCredito(precoTotal, UUID.randomUUID(), LocalDateTime.now());

            default:
                return null;
        }
    }
}
