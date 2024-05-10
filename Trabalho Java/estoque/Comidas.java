import java.util.ArrayList;
import java.util.List;

public class Comidas {

    public static void main(String[] args) {
       
        List<produtu> estoque = new ArrayList<>();

        estoque.add(new produtu("Picanha", 1, 50, 5.0));
        estoque.add(new produtu("Batata", 2, 30, 6.0));
        estoque.add(new produtu("Arroz", 3, 20, 7.0));

        System.out.println("\nEstoque:");
        for (produtu produto : estoque) {
            System.out.println("Nome: " + produto.getNome() +
                    ", Código: " + produto.getCodigo() +
                    ", Quantidade: " + produto.getQuantidade() +
                    ", Preço: " + produto.getPreco() +
                    ", Valor Total: " + produto.calcularValorTotal());
        }
    }
}

