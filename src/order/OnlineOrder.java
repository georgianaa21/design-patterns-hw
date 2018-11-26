package order;

public class OnlineOrder<T> extends Order<T>{

    public OnlineOrder(int id) {
        super(id);
    }

    @Override
    public void placedOrder() {
        System.out.println("This order was placed online!");
    }
}
