public class Jogador {

    private String nome;
    private int pontuacao;
    private int nivel;

    public Jogador(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("Nome inválido");
        }
        this.pontuacao = 0;
        this.nivel = 1;
    }

    public void aumentarPontuacao(int pontos) {
        if (pontos > 0) {
            this.pontuacao += pontos;
            atualizarNivel();
        }
    }

    private void atualizarNivel() {
        if (pontuacao >= 100) {
            this.nivel = 2;
        }
    }

    public void aumentarNivel() {
        this.nivel++;
    }

    public void exibirInformacoes() {
        System.out.println("Nome do jogador: " + nome);
        System.out.println("Pontuação: " + pontuacao);
        System.out.println("Nível: " + nivel);
    }

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
