package Projeto;

public class Fotografo extends CriadorConteudo{
    private String especialidade;

    public Fotografo(Long id, String nome, String email, String senha) {
        super(id, nome, email, senha);
    }

    public Fotografo(Long id, String nome, String email, String senha, String descricao, int seguidores, String especialidade) {
        super(id, nome, email, senha, descricao, seguidores);
        this.especialidade = especialidade;
    }

    public void publicarFotos() {
        System.out.println("Foto publicada.");
    }

    @Override
    public String toString() {
        return "Fotografo{" +
                "especialidade='" + especialidade + '\'' +
                ", descricao='" + descricao + '\'' +
                ", seguidores=" + seguidores +
                ", id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
