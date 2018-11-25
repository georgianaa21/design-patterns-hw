package menu;

import pizza.Pizza;
import pizza.PizzaFactory;

public class Menu {

    Pizza pizza;
    String sauce;
    String drink;
    String desert;

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

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public void setDesert(String desert) {
        this.desert = desert;
    }
}
