package menu;

import pizza.Pizza;
import pizza.PizzaFactory;

public class Menu {

    private Pizza pizza;
    private String sauce;
    private String drink;
    private String desert;
    private double price;

    public Menu(Pizza pizza, String sauce, String drink, String desert, double price) {
        this.pizza = pizza;
        this.sauce = sauce;
        this.drink = drink;
        this.desert = desert;
        this.price = price;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public String getSauce() {
        return sauce;
    }

    public String getDrink() {
        return drink;
    }

    public String getDesert() {
        return desert;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "pizza=" + pizza.toString() +
                ", sauce='" + sauce + '\'' +
                ", drink='" + drink + '\'' +
                ", desert='" + desert + '\'' +
                ", price=" + price +
                '}';
    }
}
