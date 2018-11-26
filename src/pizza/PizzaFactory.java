package pizza;

import order.Observer;
import order.Subject;

import java.util.ArrayList;
import java.util.List;

public class PizzaFactory implements Subject {
    Pizza pizza;
    List<Observer> observerList = new ArrayList<>();

    public Pizza makePizza(String type) {

        if(type.equals("margherita")) {
            pizza = new PizzaMargherita();
        }
        else if (type.equals("chicago")) {
            pizza = new PizzaChicago();
        }
        else if (type.equals("newyork")) {
            pizza = new PizzaNewYork();
        }
        else if (type.equals("sicilian")) {
            pizza = new PizzaSicilian();
        }

        return pizza;
    }

    public Pizza addExtras(String extra, double price) {
        if(pizza.getExtras() < 3) {
            pizza.addExtra(extra, price);
        }
        return pizza;
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
}
