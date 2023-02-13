package pagamentos;

import java.time.LocalDateTime;
import java.util.UUID;

public class Faturamento extends MetodoPgto{

    public Faturamento(double valorTotal, UUID idTransacao, LocalDateTime dataDaTransacao) {
        super(valorTotal, idTransacao, dataDaTransacao);
        dadosDoPagamento();
    }

    @Override
    public void dadosDoPagamento() {
        System.out.println("-----------------------------------------");
        System.out.println("FATURAMENTO");
        System.out.println("Pagar até: " + LocalDateTime.now().plusDays(30).format(formatter));
        super.dadosDoPagamento();
    }
    
}
