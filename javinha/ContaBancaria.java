public class ContaBancaria {
    
    private int numeroConta;
    private String nomeTitular;
    private double saldo;

    public ContaBancaria(int numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = 0.0; 
    }



    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("\nbem vindo a o banco \n ");
            System.out.println("\n faça seu depostito! \n");
            System.out.println("\nDepósito de R$" + valor + " realizado com sucesso. \n");
        } else {
            System.out.println("\nValor inválido para depósito. \n");
        }
    }
    
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("\nSaque de R$" + valor + " realizado com sucesso. \n");
        } else {
            System.out.println("\nSaldo insuficiente ou valor inválido para saque. \n");
        }
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void exibirInformacoes() {
        System.out.println("Conta: " + numeroConta);
        System.out.println("\nTitular: " + nomeTitular);
        System.out.println("\nSaldo atual: R$\n" + saldo);
    }
}
