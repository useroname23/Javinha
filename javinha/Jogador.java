public class Jogador {
    // Atributos
    private String nome;
    private int pontuacao;
    private int nivel;

    // Construtor
    public Jogador(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("Nome inválido");
        }
        this.pontuacao = 0;
        this.nivel = 1;
    }

    // Métodos para manipular pontuação e nível
    public void aumentarPontuacao(int pontos) {
        if (pontos > 0) {
            this.pontuacao += pontos;
            // Atualiza o nível se necessário
            atualizarNivel();
        }
    }

    private void atualizarNivel() {
        if (pontuacao >= 100) {
            this.nivel = 2;
            // Adicione mais lógica para outros níveis aqui
        }
    }

    // Método para subir de nível manualmente
    public void aumentarNivel() {
        this.nivel++;
    }

    // Método para exibir informações do jogador
    public void exibirInformacoes() {
        System.out.println("Nome do jogador: " + nome);
        System.out.println("Pontuação: " + pontuacao);
        System.out.println("Nível: " + nivel);
    }

    // Getters e setters (opcional, dependendo do uso)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("Nome inválido");
        }
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
