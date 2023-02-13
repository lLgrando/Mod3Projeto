package usuario;

import java.util.UUID;

public class ClientePF extends Usuario implements IUsuario {

    private UUID idCliente;
    private String sobrenome;
    private boolean isUser;
    private String cpf;

    public ClientePF(String nome, String sobrenome, String cpf) {
        super(nome);
        this.idCliente = id();
        this.sobrenome = sobrenome;
        this.isUser = this instanceof ClientePF;
        this.cpf = cpf;
    }

    public UUID getIdCliente() {
        return idCliente;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public boolean isUser() {
        return isUser;
    }

    public String getCpf() {
        return cpf;
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
