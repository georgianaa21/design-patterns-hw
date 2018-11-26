package order;

import java.util.ArrayList;
import java.util.List;
import pizza.*;
import menu.*;

//I thought that I should place an order of generic type, which later I will use as an order of a Menu
//or simply just a Pizza
public class Order<T> implements Subject, Observer, Creator {
    int id;
    T object;
    boolean done = false;

    List<Observer> observerList = new ArrayList<>();

    public Order(int id) {
        this.id = id;
    }

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

    @Override
    public void update() {
        done = true;
        System.out.println("Order " + id + " is ready");
    }

    //crearea obiectului folosind strategy
    @Override
    @SuppressWarnings("unchecked")
    public T create(String type, double price, String ... args) {
        try {
            if(type == "menu") {
                object = (T)new MenuBuilder()
                        .with(
                                menuBuilder -> {
                                    menuBuilder.pizzaType = args[0];
                                    menuBuilder.sauce = args[1];
                                    menuBuilder.drink = args[2];
                                    menuBuilder.desert = args[3];
                                    menuBuilder.price = price;
                                    menuBuilder.register(this);
                                    menuBuilder.notifyObservers();
                                }
                        ).buildMenu();
            }
            else {
                PizzaFactory pizzaFactory = new PizzaFactory();
                object = (T)pizzaFactory.makePizza(args[0]);
                pizzaFactory.register(this);
                pizzaFactory.notifyObservers();
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        finally {
            return object;
        }
    }
}
