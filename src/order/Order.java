package order;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;
import java.util.List;

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
    public T create(Object object) {
        T type = null;

        return type;
    }
}
