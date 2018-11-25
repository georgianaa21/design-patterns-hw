package pizza;

import menu.Menu;

//singleton
public class PizzaStore {

    private static PizzaStore instance = null;
    PizzaFactory pizzaFactory;

    private PizzaStore() {
        pizzaFactory = null;
    }

    public static PizzaStore getInstance() {
        if (instance == null) {
            instance = new PizzaStore();
        }
        return instance;
    }

    public void setPizzaFactory(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = pizzaFactory.makePizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    public Menu orderMenu() {
        Menu menu = null;
        return menu;
    }
}
