package usuario;

import java.util.UUID;

public class ClientePJ extends Usuario implements IUsuario {

    private UUID idCliente;
    private boolean isUser;
    private String cnpj;

    public ClientePJ(String nome, String cnpj) {
        super(nome);
        this.idCliente = id();
        this.isUser = this instanceof ClientePJ;
        this.cnpj = cnpj;
    }

    public UUID getIdCliente() {
        return idCliente;
    }

    public boolean isUser() {
        return isUser;
    }

    public String getCnpj() {
        return cnpj;
    }

    @Override
    public UUID id() {
        return UUID.randomUUID();
    }

    @Override
    public String nome() {
        return this.getNome();
    }

}
