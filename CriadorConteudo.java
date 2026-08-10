package Projeto;

public class CriadorConteudo extends Usuario implements Transmitivel {
    protected String descricao;
    protected int seguidores;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(int seguidores) {
        this.seguidores = seguidores;
    }


    public CriadorConteudo(Long id, String nome, String email, String senha) {
        super(id, nome, email, senha);
    }

    public CriadorConteudo(Long id, String nome, String email, String senha, String descricao, int seguidores) {
        super(id, nome, email, senha);
        this.descricao = descricao;
        this.seguidores = seguidores;
    }

    public void criarConteudo() {
        System.out.println("Conteúdo criado.");
    }

    public void gerenciarConteudo() {
        System.out.println("Conteúdo gerendiado.");
    }

    @Override
    public String toString() {
        return "CriadorConteudo{" +
                "descricao='" + descricao + '\'' +
                ", seguidores=" + seguidores +
                ", id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }

    @Override
    public void iniciarLive() {

    }

    @Override
    public void encerrarLive() {

    }
}
