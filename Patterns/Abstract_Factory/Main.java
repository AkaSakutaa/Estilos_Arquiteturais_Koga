package Patterns.Abstract_Factory;

public class Main {
    public static void main(String[] args) {
        // aqui só escolho qual fábrica entregar, sem if e sem mexer no fluxo
        Aplicacao appAndroid = new Aplicacao(new FabricaAndroid());
        Aplicacao appIOS = new Aplicacao(new FabricaIOS());

        appAndroid.renderizar();
        appIOS.renderizar();
    }
}