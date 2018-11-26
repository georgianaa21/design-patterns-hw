package menu;

import pizza.Pizza;
import pizza.PizzaFactory;

import java.util.function.Consumer;

public class MenuBuilder {
    public PizzaFactory pizzaFactory = new PizzaFactory();
    public String pizzaType;
    public String sauce;
    public String drink;
    public String desert;
    public double price;

    public MenuBuilder with(
            Consumer<MenuBuilder> builderFunction) {
        builderFunction.accept(this);
        return this;
    }

    public Menu buildMenu() {
        return new Menu(pizzaFactory.makePizza(pizzaType),
                sauce, drink, desert, price);
    }

}
