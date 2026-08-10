package Projeto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== TESTANDO SISTEMA DE USUÁRIOS ===\n");

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataVerificacao = LocalDate.parse("20/05/2026", fmt);

        LocalDate dataHoje = LocalDate.now();

        // 1. Instanciando e testando UsuarioComum
        System.out.println("--- UsuarioComum ---");
        UsuarioComum usuarioComum = new UsuarioComum(
                1L,
                "Maria Silva",
                "maria@email.com",
                "senha123",
                dataHoje
        );
        usuarioComum.exibirPerfil();
        usuarioComum.atualizarDados();
        usuarioComum.visualizarConteudos();
        System.out.println();

        // 2. Instanciando e testando UsuarioPremium (Implementa Monetizavel)
        System.out.println("--- UsuarioPremium ---");
        UsuarioPremium usuarioPremium = new UsuarioPremium(
                2L,
                "João Souza",
                "joao@email.com",
                "senha456",
                dataHoje,
                dataHoje
        );
        usuarioPremium.exibirPerfil();
        usuarioPremium.ativarPremium();
        usuarioPremium.ativarMonetizacao();
        usuarioPremium.desativarMonetizacao();
        usuarioPremium.cancelarPremium();
        System.out.println();

        // 3. Instanciando e testando Influenciador (Implementa Patrocinado)
        System.out.println("--- Criador de Conteúdo: Influenciador ---");
        Influenciador influenciador = new Influenciador(
                3L,
                "Ana Clara",
                "ana@email.com",
                "senha789",
                "Criadora de conteúdo sobre vida saudável e fitness",
                50000,
                "Fitness & Saúde"
        );
        influenciador.exibirPerfil();
        influenciador.criarConteudo();
        influenciador.gerenciarConteudo();
        influenciador.fazerParceria();
        influenciador.receberPatrocinio();
        influenciador.encerrarPatrocinio();
        System.out.println();

        // 4. Instanciando e testando Streamer (Implementa Transmitivel)
        System.out.println("--- Criador de Conteúdo: Streamer ---");
        Streamer streamer = new Streamer(
                4L,
                "Carlos Gamer",
                "carlos@email.com",
                "senha101",
                "Lives diárias de jogos competitivos",
                120000,
                "Twitch"
        );
        streamer.exibirPerfil();
        streamer.criarConteudo();
        streamer.iniciarLive();
        streamer.encerrarLive();
        System.out.println();

        // 5. Instanciando e testando Fotografo
        System.out.println("--- Criador de Conteúdo: Fotógrafo ---");
        Fotografo fotografo = new Fotografo(
                5L,
                "Lucas Fotos",
                "lucas@email.com",
                "senha202",
                "Fotógrafo profissional de paisagens e eventos",
                15000,
                "Fotografia Urbana"
        );
        fotografo.exibirPerfil();
        fotografo.criarConteudo();
        fotografo.publicarFotos();
        System.out.println();

        // 6. Instanciando e testando Empresa
        System.out.println("--- Empresa ---");
        Empresa empresa = new Empresa(
                6L,
                "Tech Solutions",
                "contato@techsolutions.com",
                "senha303",
                "12.345.678/0001-90",
                "Tech Solutions LTDA"
        );
        empresa.exibirPerfil();
        empresa.exibirInformacoes();
        System.out.println();

        // 7. Instanciando e testando EmpresaVerificada
        System.out.println("--- Empresa Verificada ---");
        EmpresaVerificada empresaVerificada = new EmpresaVerificada(
                7L,
                "MegaCorp",
                "atendimento@megacorp.com",
                "senha404",
                "98.765.432/0001-10",
                "MegaCorp S/A",
                new Date()
        );
        empresaVerificada.exibirPerfil();
        empresaVerificada.exibirInformacoes();
        empresaVerificada.selarVerificacao();
        System.out.println();

        // 8. Demonstração de Polimorfismo
        System.out.println("=== DEMONSTRAÇÃO DE POLIMORFISMO ===");
        Usuario[] usuarios = { usuarioComum, usuarioPremium, influenciador, streamer, fotografo, empresa, empresaVerificada };

        for (Usuario u : usuarios) {
            System.out.print("[Polimorfismo] Exibindo perfil de: ");
            u.exibirPerfil();
        }
    }
}