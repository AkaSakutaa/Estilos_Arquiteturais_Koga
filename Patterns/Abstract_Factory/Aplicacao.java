package Patterns.Abstract_Factory;

public class Aplicacao {

    // só conhece a interface, nunca uma fábrica concreta
    private final Fabricas fabrica;

    public Aplicacao(Fabricas fabrica) {
        this.fabrica = fabrica;
    }

    // fluxo comum: igual pra qualquer plataforma
    public void renderizar() {
        Botao botao = fabrica.criarBotao();
        Input input = fabrica.criarInput();

        botao.renderizarBotao();
        input.renderizarInput();
    }
}