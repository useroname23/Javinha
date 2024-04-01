public class Carro {
    // Atributos privados
    private String marca;
    private String modelo;
    private int ano;
    private double velocidadeAtual;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = 0; 
    }

    public void acelerar(double incremento) {
        if (incremento > 0) {
            velocidadeAtual += incremento;
            System.out.println("Acelerando. Velocidade atual: " + velocidadeAtual + " km/h\n");
        } else {
            System.out.println("Não é possível acelerar com um valor negativo.\n");
        }
    }

    public void frear(double decremento) {
        if (decremento > 0) {
            velocidadeAtual -= decremento;
            System.out.println("\nFreando. Velocidade atual: " + velocidadeAtual + " km/h\n");
        } 
    }

    public void exibirInformacoes() {

        System.out.println("\nVelocidade atual: " + velocidadeAtual + " km/h\n");
    }

   
}
