package pizza;

public class PizzaFactory {
    Pizza pizza;
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
}
