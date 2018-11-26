import com.sun.org.apache.xpath.internal.operations.Or;
import menu.*;
import order.Context;
import order.OnlineOrder;
import order.Order;
import order.TelOrder;
import pizza.*;

public class Main {

    public static void main(String[] args) {

        Cashier cashier = Cashier.getInstance();

        Order<Menu> order1 = cashier.placeOrder(1);
        Context context = new Context(order1);
        //nu merge sa pun register in constructorul de la order
        order1.register(cashier);
        context.executeStrategy();
        Menu menu1 = order1.create("menu", "30.5", "margherita", "Ketchup", "Cola", "Choco cup");
        System.out.println(menu1.toString() + "\n");

        Order<Pizza> order2 = cashier.placeTelOrder(2);
        context = new Context(order2);
        order2.register(cashier);
        context.executeStrategy();
        Pizza pizza2 = order2.create("pizza", "sicilian");
        System.out.println(pizza2.toString() + "\n");

        Order<Menu> order3 = cashier.placeOnlineOrder(3);
        order3.register(cashier);
        context = new Context(order3);
        context.executeStrategy();
        Menu menu3 = order3.create("menu", "45", "newyork", "Sour", "Fanta", "Ice cream");
        System.out.println(menu3.toString());

    }
}
