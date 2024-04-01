import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Pizza {
    private String nome;
    private double preco;
    private List<String> ingredientes;

    public Pizza(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.ingredientes = new ArrayList<>();
    }

    public void adicionarIngrediente(String ingrediente) {
        this.ingredientes.add(ingrediente);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }
}

class Pedido {
    private List<Pizza> pizzas;

    public Pedido() {
        this.pizzas = new ArrayList<>();
    }

    public void adicionarPizza(Pizza pizza) {
        this.pizzas.add(pizza);
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public double calcularTotal() {
        Map<String, Integer> ingredientesContados = new HashMap<>();
        for (Pizza pizza : pizzas) {
            List<String> ingredientes = pizza.getIngredientes();
            for (String ingrediente : ingredientes) {
                ingredientesContados.put(ingrediente, ingredientesContados.getOrDefault(ingrediente, 0) + 1);
            }
        }

        double total = 0;
        for (Pizza pizza : pizzas) {
            total += pizza.getPreco() + (2 * pizza.getIngredientes().size());
        }

        return total;
    }
}