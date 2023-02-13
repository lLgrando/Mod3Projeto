package pagamentos;

import java.time.LocalDateTime;
import java.util.UUID;

public class CartaoCredito extends MetodoPgto {

    public CartaoCredito(double valorTotal, UUID idTransacao, LocalDateTime dataDaTransacao) {
        super(valorTotal, idTransacao, dataDaTransacao);
        dadosDoPagamento();
    }

    @Override
    public void dadosDoPagamento() {
        System.out.println("-----------------------------------------");
        System.out.println("CARTÃO DE CRÉDITO");
        super.dadosDoPagamento();
    }
    
}
