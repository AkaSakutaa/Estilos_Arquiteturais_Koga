package Patterns.Factory_Method;

public class Main {
    public static void main(String[] args) {
        // as variáveis são do tipo abstrato, o Main não depende de classe concreta de envio
        FabricaNotificacoes fabricaEmail = new FabricaEmail();
        FabricaNotificacoes fabricaSMS = new FabricaSMS();

        fabricaEmail.notificar();
        fabricaSMS.notificar();
    }
}