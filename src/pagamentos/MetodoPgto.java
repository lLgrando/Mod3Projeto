package pagamentos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

abstract class MetodoPgto {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    private double valorTotal;
    private UUID idTransacao;
    private LocalDateTime dataDaTransacao;

    public MetodoPgto(double valorTotal, UUID idTransacao, LocalDateTime dataDaTransacao) {
        this.valorTotal = valorTotal;
        this.idTransacao = idTransacao;
        this.dataDaTransacao = dataDaTransacao;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public UUID getIdTransacao() {
        return idTransacao;
    }

    public LocalDateTime getDataDaTransacao() {
        return dataDaTransacao;
    }

    public void dadosDoPagamento(){
        System.out.println("Emitido em: " + LocalDateTime.now().format(formatter));
        System.out.println("Código: " + this.idTransacao);
        System.out.printf("R$ %.2f \n", this.valorTotal);
        System.out.println("-----------------------------------------");
    }
}
