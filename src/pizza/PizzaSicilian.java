package pizza;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PizzaSicilian extends Pizza{
    public PizzaSicilian() {
        this.name = "Pizza Sicilian";
        this.dough = "thick square crust";
        this.cheese = "mozzarella";
        Stream<String> toppingsStream = Stream.of("onion", "herbs", "anchovies");
        this.toppings = toppingsStream.collect(Collectors.toList());
        this.price = 32.5;
    }
}
