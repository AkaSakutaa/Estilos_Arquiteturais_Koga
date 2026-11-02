package Patterns.Factory_Method;

public abstract class FabricaNotificacoes {

    // cada fábrica concreta decide qual notificação criar
    protected abstract IntNotificacoes criarNotificacoes();

    // fluxo comum: igual pra qualquer tipo de notificação
    public void notificar() {
        IntNotificacoes notificacao = criarNotificacoes();
        notificacao.enviar();
    }
}