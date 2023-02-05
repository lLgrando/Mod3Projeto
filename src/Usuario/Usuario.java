package src.Usuario;

import src.Produtos.Dados;

public class Usuario {

    // NÃO ESTÁ FINALIZADO


    private String nome;
    private String senha;


    public static int login(String nome, String senha){
        int numero = -1;

        for (Usuario u1 : Dados.usuarios) {
            if (u1.nome.equals(nome) && u1.senha.equals(senha)) {
                numero = 1;
                return 1;
            } else {
                numero = -1;
            }
        }
        return numero;
    }

    public static int cadastrarUsuario(String nome, String senha) {
        int numero = -1;

        if (Dados.usuarios.size() == 0) {
            Usuario u1 = new Usuario();
            u1.nome = "admin";
            u1.senha = "admin";
            Dados.usuarios.add(u1);
        }

        for (Usuario u1 : Dados.usuarios) {
            if (u1.nome.equals(nome) && u1.senha.equals(senha)) {
                System.out.println("Usuário já existe.");
                numero = 1;
            } else {
                Usuario usuario = new Usuario();
                u1.nome = nome;
                u1.senha = senha;
                Dados.usuarios.add(usuario);
                System.out.println("Usuário cadastrado.");
                return -1;
            }
        }
        return numero;
    }
}
