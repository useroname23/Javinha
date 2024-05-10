import java.util.ArrayList;
import java.util.List;

class Teletelefone {
    private String nome;
    private String telefone;

    public Teletelefone(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }
}

class Agenda {
    private List<Teletelefone> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }

    public void adicionarContato(String nome, String telefone) {
        Teletelefone novoContato = new Teletelefone(nome, telefone);
        contatos.add(novoContato);
        System.out.println("\nContato adicionado: \n" + nome);
    }

    public Teletelefone buscarContato(String nome) {
        for (Teletelefone contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                return contato;
            }
        }
        System.out.println("\nContato não encontrado:\n " + nome);
        return null;
    }

    public void removerContato(String nome) {
        Teletelefone contatoRemover = null;
        for (Teletelefone contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contatoRemover = contato;
                break;
            }
        }
        if (contatoRemover != null) {
            contatos.remove(contatoRemover);
            System.out.println("\nContato removido:\n " + nome);
        } else {
            System.out.println("\nContato não encontrado: \n" + nome);
        }
    }
}



