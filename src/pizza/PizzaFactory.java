package pizza;

public class PizzaFactory {
    public Pizza makePizza(String type) {
        Pizza pizza = null;

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
}
