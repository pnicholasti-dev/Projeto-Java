package Projeto;

public class Streamer extends CriadorConteudo implements Patrocinado{
    private String plataforma;

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public Streamer(Long id, String nome, String email, String senha) {
        super(id, nome, email, senha);
    }

    @Override
    public void exibirPerfil() {

    }

    public Streamer(Long id, String nome, String email, String senha, String descricao, int seguidores, String plataforma) {
        super(id, nome, email, senha, descricao, seguidores);
        this.plataforma = plataforma;
    }

    public void iniciarLive() {
        System.out.println("Live iniciada.");
    }

    public void encerrarLive() {
        System.out.println("Live encerrada.");
    }

    @Override
    public String toString() {
        return "Streamer{" +
                "plataforma='" + plataforma + '\'' +
                ", descricao='" + descricao + '\'' +
                ", seguidores=" + seguidores +
                ", id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }

    @Override
    public void receberPatrocinio() {

    }

    @Override
    public void encerrarPatrocinio() {

    }
}
