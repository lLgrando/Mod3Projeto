package pagamentos;

import java.time.LocalDateTime;
import java.util.UUID;

public class Boleto extends MetodoPgto{

    public Boleto(double valorTotal, UUID idTransacao, LocalDateTime dataDaTransacao) {
        super(valorTotal, idTransacao, dataDaTransacao);
        dadosDoPagamento();
    }
    
    @Override
    public void dadosDoPagamento() {
        System.out.println("-----------------------------------------");
        System.out.println("BOLETO");
        System.out.println("Pagar até: " + LocalDateTime.now().plusDays(5).format(formatter));
        super.dadosDoPagamento();
    }
}
