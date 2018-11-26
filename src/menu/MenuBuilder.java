package menu;

import order.Observer;
import order.Subject;
import pizza.Pizza;
import pizza.PizzaFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MenuBuilder implements Subject {
    public PizzaFactory pizzaFactory = new PizzaFactory();
    public String pizzaType;
    public String sauce;
    public String drink;
    public String desert;
    public double price;
    public int extras = 0;
    private List<Observer> observerList = new ArrayList<>();
    Menu menu;

    public MenuBuilder with(
            Consumer<MenuBuilder> builderFunction) {
        builderFunction.accept(this);
        return this;
    }

    public Menu buildMenu() {
        this.menu = new Menu(pizzaFactory.makePizza(pizzaType),
                sauce, drink, desert, price);
        return menu;
    }

//    public Menu addExtra(String extra, double price) {
//        this.menu.getPizza().
//    }

    @Override
    public void register(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observerList.forEach(Observer::update);
    }

}
