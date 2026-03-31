package design_patterns.creational.builder;

public class Pizza {
    private String dough;
    private String sauce;
    private String topping;
    private boolean cheese;
    private boolean pepperoni;

    private Pizza(PizzaBuilder builder) {
        this.dough = builder.dough;
        this.sauce = builder.sauce;
        this.topping = builder.topping;
        this.cheese = builder.cheese;
        this.pepperoni = builder.pepperoni;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", topping='" + topping + '\'' +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                '}';
    }

    // Getters

    public static class PizzaBuilder {
        private String dough;
        private String sauce;
        private String topping;
        private boolean cheese;
        private boolean pepperoni;

        public PizzaBuilder(String dough, String sauce) {
            this.dough = dough;
            this.sauce = sauce;
        }

        public PizzaBuilder topping(String topping) {
            this.topping = topping;
            return this;
        }

        public PizzaBuilder cheese(boolean cheese) {
            this.cheese = cheese;
            return this;
        }

        public PizzaBuilder pepperoni(boolean pepperoni) {
            this.pepperoni = pepperoni;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}
