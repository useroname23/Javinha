public class Main {
    public static void main(String[] args) {
        Pizza margherita = new Pizza("Margherita", 25.0);
        margherita.adicionarIngrediente("Molho de tomate");
        margherita.adicionarIngrediente("Muçarela");
        margherita.adicionarIngrediente("Manjericão");

        Pizza calabresa = new Pizza("Calabresa", 30.0);
        calabresa.adicionarIngrediente("Molho de tomate");
        calabresa.adicionarIngrediente("Calabresa");
        calabresa.adicionarIngrediente("Cebola");

        Pedido pedido = new Pedido();
        pedido.adicionarPizza(margherita);
        pedido.adicionarPizza(calabresa);

        System.out.println("Pizzas no pedido:");
        for (Pizza pizza : pedido.getPizzas()) {
            System.out.println(pizza.getNome());
        }

        double totalPedido = pedido.calcularTotal();
        System.out.println("Total do pedido: R$" + totalPedido);
    }
}