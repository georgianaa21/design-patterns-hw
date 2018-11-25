package pizza;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PizzaChicago extends Pizza {

    public PizzaChicago() {
        this.name = "Pizza Chicago";
        this.dough = "thick crust";
        this.cheese = "mozzarella";
        Stream<String> toppingsStream = Stream.of("beef", "sausage", "pepperoni", "onion", "mushroom");
        this.toppings = toppingsStream.collect(Collectors.toList());
        this.price = 30;
    }
}
