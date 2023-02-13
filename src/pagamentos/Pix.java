package pagamentos;

import java.time.LocalDateTime;
import java.util.UUID;

public class Pix extends MetodoPgto {
    
    public Pix(double valorTotal, UUID idTransacao, LocalDateTime dataDaTransacao) {
        super(valorTotal, idTransacao, dataDaTransacao);
        dadosDoPagamento();
    }

    @Override
    public void dadosDoPagamento() {
        System.out.println("-----------------------------------------");
        System.out.println("PIX");
        System.out.println("Pagar até: " + LocalDateTime.now().plusHours(3).format(formatter));
        super.dadosDoPagamento();
    }

}
