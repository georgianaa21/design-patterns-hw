package pizza;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PizzaNewYork extends Pizza{

    public PizzaNewYork() {
        this.name = "Pizza New York";
        this.dough = "thin crust";
        this.cheese = "mozzarella";
        Stream<String> toppingsStream = Stream.of("pepperoni", "sausage", "mushroom");
        this.toppings = toppingsStream.collect(Collectors.toList());
        this.price = 32.5;
    }
}
