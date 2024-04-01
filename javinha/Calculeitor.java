import java.util.Scanner;

public class Calculeitor {
    public static void main(String[] args) {
        Scanner scannerr = new Scanner(System.in);
        double num1, num2;
        char operador;

        System.out.printf("\nBem vindo :) \n");
        System.out.printf("\nDigite o primeiro número: ");
        num1 = scannerr.nextDouble();
        System.out.printf("\nDigite o operador (+, -, *, /): ");
        operador = scannerr.next().charAt(0);
        System.out.printf("\nDigite o segundo número: ");
        num2 = scannerr.nextDouble();

        double resultado = 0;

        switch (operador) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro! Divisão por zero não é permitida.");
                    return;
                }
                break;
            default:
                System.out.println("Operador inválido!");
                return;
        }

        System.out.println("Resultado: " + resultado);
    }
}
