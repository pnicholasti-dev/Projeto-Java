package Projeto;

public class Empresa extends Usuario {
    protected String cnpj;
    protected String razaoSocial;

    public Empresa(String cnpj, String razaoSocial) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    public Empresa(Long id, String nome, String email, String senha, String cnpj, String razaoSocial) {
        super(id, nome, email, senha);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    public void exibirInformacoes() {

    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    @Override
    public void exibirPerfil() {

    }
}
