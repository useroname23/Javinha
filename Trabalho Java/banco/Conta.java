public class Conta {
    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria(7777, "Maicon jacson");
        minhaConta.depositar(10000.0);
        minhaConta.sacar(220.0);
        minhaConta.exibirInformacoes();
    }    
}
