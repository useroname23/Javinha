public class Carrinho {

    public static void main(String[] args) {

        Carro meuCarro = new Carro("Ford", "Scort", 1996);
        meuCarro.exibirInformacoes();

        meuCarro.acelerar(50);
        meuCarro.frear(20);
        meuCarro.exibirInformacoes();
    }
}

