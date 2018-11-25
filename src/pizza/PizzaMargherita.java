package pizza;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PizzaMargherita extends Pizza{

    public PizzaMargherita() {
        this.name = "Pizza Margherita";
        this.dough = "flatbread";
        this.cheese = "mozzarella";
        Stream<String> toppingsStream = Stream.of("tomato", "basil");
        this.toppings = toppingsStream.collect(Collectors.toList());
        this.price = 25.5;
    }
}
