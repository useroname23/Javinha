public class Joga {
    public static void main(String[] args) {

        Jogador jogador1 = new Jogador("Alice");
        
        jogador1.aumentarPontuacao(50);
        
        jogador1.aumentarNivel();
        
        jogador1.exibirInformacoes();
    }
}


