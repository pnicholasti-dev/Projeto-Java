package Projeto;

import java.time.LocalDate;

public class UsuarioPremium extends Usuario implements Monetizavel {

    private LocalDate dataInicioPremium;
    private LocalDate dataFimPremium;

    public UsuarioPremium(Long id, String nome, String email, String senha,
                          LocalDate dataInicioPremium,
                          LocalDate dataFimPremium) {

        super(id, nome, email, senha);

        this.dataInicioPremium = dataInicioPremium;
        this.dataFimPremium = dataFimPremium;
    }

    public void ativarPremium() {
        System.out.println("Premium ativado!");
    }

    public void cancelarPremium() {
        System.out.println("Premium cancelado!");
    }

    @Override
    public void ativarMonetizacao() {
        System.out.println("Usuário Premium monetizado.");
    }

    @Override
    public void desativarMonetizacao() {
        System.out.println("Monetização desativada.");
    }
}
