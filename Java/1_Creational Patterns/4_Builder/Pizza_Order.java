// Pizza.java

import java.util.List;

public class Pizza {
    private final String size;
    private final String crust;
    private final String cheese;
    private final List<String> toppings;

    private Pizza(PizzaBuilder builder) {
        this.size = builder.size;
        this.crust = builder.crust;
        this.cheese = builder.cheese;
        this.toppings = builder.toppings;
    }

    public static class PizzaBuilder {
        private final String size;
        private String crust;
        private String cheese;
        private List<String> toppings = new ArrayList<>();

        public PizzaBuilder(String size) {
            this.size = size;
        }

        public PizzaBuilder crust(String crust) {
            this.crust = crust;
            return this;
        }

        public PizzaBuilder cheese(String cheese) {
            this.cheese = cheese;
            return this;
        }

        public PizzaBuilder addTopping(String topping) {
            this.toppings.add(topping);
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", crust='" + crust + '\'' +
                ", cheese='" + cheese + '\'' +
                ", toppings=" + toppings +
                '}';
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.PizzaBuilder("Large")
                .crust("Thin")
                .cheese("Mozzarella")
                .addTopping("Pepperoni")
                .addTopping("Mushrooms")
                .addTopping("Onions")
                .build();

        System.out.println(pizza);
    }
}
