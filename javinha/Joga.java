public class Joga {
    public static void main(String[] args) {
        // Criando um novo jogador
        Jogador jogador1 = new Jogador("Alice");
        
        // Aumentando a pontuação do jogador
        jogador1.aumentarPontuacao(50);
        
        // Aumentando o nível do jogador
        jogador1.aumentarNivel();
        
        // Exibindo informações do jogador
        jogador1.exibirInformacoes();
    }
}


