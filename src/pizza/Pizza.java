package pizza;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    String dough;
    String cheese;
    int extras = 0;
    List<String> toppings = new ArrayList();
    double price;

    void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough" + dough);
        System.out.println("Adding " + cheese);
        System.out.println("Adding toppings:");
        toppings.forEach(System.out::println);
        System.out.println("Total price: " + price);
    }

    void bake() {
        System.out.println("Pizza is baking at 350 in oven");
    }

    void cut() {
        System.out.println("Pizza is being cut");
    }

    void box() {
        System.out.println("Pizza is being boxed");
    }

    void addExtra(String extra, double price) {
        this.toppings.add(extra);
        this.price += price;
    }
}
