package design_patterns.creational.builder;

public class App {
    public static void main(String[] args) {
        Pizza pizza= new Pizza.PizzaBuilder("thin crust", "tomato")
                .cheese(true)
                .pepperoni(true)
                .topping("mushrooms")
                .build();

        System.out.println(pizza);
    }
}
