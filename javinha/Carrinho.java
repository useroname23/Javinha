public class Carrinho {

    public static void main(String[] args) {
        // Exemplo de uso da classe Carro
        Carro meuCarro = new Carro("Ford", "Scort", 1996);
        meuCarro.exibirInformacoes();

        meuCarro.acelerar(50);
        meuCarro.frear(20);
        meuCarro.exibirInformacoes();
    }
}

