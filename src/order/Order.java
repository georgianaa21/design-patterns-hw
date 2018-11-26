package order;

import java.util.ArrayList;
import java.util.List;
import pizza.*;
import menu.*;

//I thought that I should place an order of generic type, which later I will use as an order of a Menu
//or simply just a Pizza
public class Order<T> implements Subject, Observer, Strategy {
    int id;
    T object;
    boolean done = false;



    List<Observer> observerList = new ArrayList<>();

    public Order(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
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
        System.out.println("Order " + id + " is ready!");
        notifyObservers();
    }

    @SuppressWarnings("unchecked")
    public T create(String type, String ... args) {
        try {
            if(type == "menu") {
                double price = Double.parseDouble(args[0]);
                object = (T)new MenuBuilder()
                        .with(
                                menuBuilder -> {
                                    menuBuilder.pizzaType = args[1];
                                    menuBuilder.sauce = args[2];
                                    menuBuilder.drink = args[3];
                                    menuBuilder.desert = args[4];
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

    @Override
    public void placedOrder() {
        System.out.println("This order was placed by unknown channel!");
    }
}
