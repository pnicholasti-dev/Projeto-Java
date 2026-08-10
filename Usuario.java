package Projeto;

public abstract class Usuario {

    protected Long id;
    protected String nome;
    protected String email;
    protected String senha;

    public Usuario(Long id, String nome, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public Usuario() {

    }

    public void exibirPerfil() {
        System.out.println("Id: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Senha: " + senha);
    }

    public void autenticar() {
        System.out.println("Usuário autenticado!");
    }

    public void atualizarDados() {
        System.out.println("Dados atualizados!");
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}