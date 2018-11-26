import order.Observer;
import order.OnlineOrder;
import order.Order;
import order.TelOrder;

public class Cashier implements Observer {
    private static Cashier cashier = null;
    private Cashier() {
        cashier = null;
    }

    public static Cashier getInstance() {
        if (cashier == null) {
            cashier = new Cashier();
        }
        return cashier;
    }

    public static Order placeTelOrder(int id) {
        return new TelOrder(id);
    }
    public static Order placeOnlineOrder(int id) {
        return new OnlineOrder(id);
    }

    public static Order placeOrder(int id) {
        return new Order(id);
    }

    @Override
    public void update() {
        System.out.println("Order is ready to be delivered!");
    }
}
