public class Fone {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.adicionarContato("kamila", "9994783821");
        agenda.adicionarContato("jeff", "981298928");
        agenda.adicionarContato("Virson", "87382912");

        Teletelefone contatokamila = agenda.buscarContato("kamila");
        if (contatokamila != null) {
            System.out.println("\nTelefone de Kamila: \n" + contatokamila.getTelefone());
        } else {
            System.out.println("\nContato 'kamila' não encontrado.");
        }

        Teletelefone contatojozefa = agenda.buscarContato("jozefa");
        if (contatojozefa != null) {
            System.out.println("\nTelefone de jozefa: \n" + contatojozefa.getTelefone());
        } else {
            System.out.println("\nContato 'Maria' não encontrado.");
        }

        agenda.removerContato("Virson");
        Teletelefone contatoJoao = agenda.buscarContato("João");
        if (contatoJoao != null) {
            System.out.println("\nTelefone de João: \n" + contatoJoao.getTelefone());
        } else {
            System.out.println("\nContato 'João' não encontrado!");
        }

        agenda.removerContato("Carlos");
    }
}
